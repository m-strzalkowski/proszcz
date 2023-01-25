package ms.proces;

import ms.bledy.SemanticOccurence;
import ms.bledy.wykonania.BłądAlokacji;
import ms.drzewo.Węzeł;
import ms.interpreter.Silnik;
import ms.interpreter.Środowisko;
import ms.proces.strumienie.IStrumień;
import ms.proces.strumienie.StrumieńWejściowy;
import ms.proces.strumienie.StrumieńWyjsciowy;

import java.util.*;

import static java.lang.Double.NaN;
import static ms.Tablice.SHARED_STDIN_SCANNER;
import static ms.drzewo.Definicje.*;

@SuppressWarnings("NonAsciiCharacters")
public class Proces implements Nazwa{
    public Proces(Węzeł drzewo){
        this.drzewo = drzewo;
        dodaj_deskryptor(new StrumieńWejściowy(SHARED_STDIN_SCANNER()));//0 - stdin
        dodaj_deskryptor(new StrumieńWyjsciowy(System.out));//1 - stdout
        dodaj_deskryptor(new StrumieńWyjsciowy(System.err));//2 - stderr
    }
    public Ewaluacja ewaluacja = Ewaluacja.SPRYTNA;
    public Węzeł drzewo=null;//algorytm
    Węzeł licznik=null;//PC - licznik /rozkazów/

    private void ustaw_argumenty(Węzeł[] argumenty,Silnik s){
        //sprawdź ilośc argumentów
        int ile = argumenty!=null?argumenty.length:0;
        if(ile<argcmin() || ile>argcmax())
        {
            throw new RuntimeException("Invalid number of process invocation arguments:got "+ile+" should be in ["+argcmin()+","+argcmax()+"]");
        }
        if(argumenty!=argumenty_kod)
        argumenty_kod=argumenty;
        arg_wart_ini(s);
    }
    private double[] arg_poprz;
    private void ustaw_argumenty(double[] argumenty){
        if(argumenty==arg_poprz){return;}
        if(argumenty==null){argumenty_wart=null;}
        else{
            argumenty_wart = new Double[argumenty.length];
            for(int i=0;i<argumenty.length;i++){argumenty_wart[i]=argumenty[i];}
        }
        arg_poprz = argumenty;
    }
    //Argumenty mozna podawać zarówno jako kod, jak też i wartosci. Kod bedzie się ewaluował, gdy będzie to konieczne.
    private Węzeł [] argumenty_kod =null;//argumenty wywołania - kod
    private Double[] argumenty_wart=null;
    public void arg_wart_ini(Silnik s){
        if( argumenty_kod!=null && (argumenty_wart==null ||argumenty_kod.length!=argumenty_wart.length ))
            argumenty_wart=new Double[argumenty_kod.length];
        else if(argumenty_kod==null){argumenty_wart=null;}
        if(ewaluacja == Ewaluacja.GORLIWA){policz_wszystkie_argumenty(s);}
    }
    public void policz_wszystkie_argumenty(Silnik s)
    {
        if(argumenty_kod==null)return;else arg_wart_ini(s);
        Proces wołający =  s.zeStosu();//trzeba argument obliczyć w kontekście wołającego
        for(int i=0; i<argumenty_wart.length;i++)
        {
            argumenty_wart[i] = argumenty_kod[i].policz(s);
        }
        s.naStos(wołający);
    }
    //TODO przyspieszyc lambdą
    public double argument(int indeks, Silnik s)
    {

        if(argumenty_wart == null){throw new RuntimeException("Unable to provide argument "+indeks+" because no arguments have been given to this process..");}
        if(argumenty_wart[indeks]==null)//przy gorliwej ewaluacji nie powinno byc tu nulla, więc po prostu zwraca wartość
        {
            Proces wołający =  s.zeStosu();//trzeba argument obliczyć w kontekście wołającego
            double wartość = argumenty_kod[indeks].policz(s);
            System.err.println("Argument"+indeks+":"+wartość);
            s.naStos(wołający);
            if(ewaluacja==Ewaluacja.LENIWA){return wartość;}//trzeba będzie następnym razem znów obliczać
            else{argumenty_wart[indeks] = wartość;}//albo sprytnie zachować na później.
        }
        return argumenty_wart[indeks];
    }
    public int liczba_argumentów()
    {
        if(argumenty_wart==null){return 0;}
        return argumenty_wart.length;
    }

    public double [] pam;//segment anonimowy (zmienne lokalne)
    private int zawijanie=100;//jaka jest rzeczywista wielkośc pamięci lokalnej

    private ArrayList<IStrumień> deskryptory = new ArrayList<>(8);
    public IStrumień daj_deskryptor(int nr){return deskryptory.get(nr);}
    /**
     * @return zwrcanumer pod którym został zarejestrowany
     */
    public int dodaj_deskryptor(IStrumień strumień){deskryptory.add(strumień); return deskryptory.size()-1;}
    public void ustaw_deskryptor(IStrumień strumień, int indeks){deskryptory.set(indeks,strumień);}

    public void rezerwuj_lokalną_pamięć(int wielkość)
    {if(wielkość<0)throw new BłądAlokacji(null,"Niewłaściwy rozmiar anonimowego bloku pamięci:"+wielkość);
        else{pam = new double[wielkość];}
    }

    /**
     * @param x double
     * @return poprawny indeks dla pam - segmentu anonimowego
     */
    public int indeks_pam(double x){
        return  ((int)Math.abs(x))%(pam.length);
    }

    /**Zawiera przestrzeń nazw dostępną wewnątrz tego procesu.
     */
    public Map<String, Nazwa> nazwy = new HashMap<String, Nazwa>();
    public Nazwa szukaj_nazwy(String nazwa)
    {
        Nazwa n = nazwy.get(nazwa);
        if(n==null){throw new RuntimeException("No such mame in given context:"+nazwa);}
        return n;
    }

    public void ustaw_argumenty(Double[] argumenty){this.argumenty_wart = argumenty;}

    @Override
    public double policz(Silnik s, Węzeł[] argumenty) {
        ustaw_argumenty(argumenty,s);
        s.naStos(this);
        //s.aktualny = this;
        double w = drzewo.licz(s);
        s.zeStosu();
        return w;
    }
    @Override
    public double policz(Silnik s, double[] argumenty) {
        ustaw_argumenty(argumenty);
        s.naStos(this);
        //s.aktualny = this;
        double w= drzewo.licz(s);
        s.zeStosu();
        return w;
    }

    @Override
    public double policz(Silnik s) {
        return policz(s, (double[]) null);
    }

    private int _argcmin,_argcmax;
    @Override
    public int argcmin() {
        return _argcmin;
    }

    @Override
    public int argcmax() {
        return _argcmax;
    }

    @Override
    public String kod(Silnik s,boolean czy_rekursywnie_w_głąb) {
        var sb = new StringBuilder();
        sb.append(kod_instr_procesowych(s,true));
        sb.append(" ");
        sb.append((drzewo==null)?"/*no tree*/0":drzewo.kodPodrzewa());
        sb.append(" ");
        sb.append(kod_segm_anonimowego());
        return sb.toString();
    }

    private String kod_segm_anonimowego() {
        if(pam ==null){return "/*no anonymous segment*/";}
        //Wypisuje (# <zawartość pam do momentu, gdy do końca są już zera> #)
        int ost = pam.length;
        while(--ost>=0 && pam[ost]==0){}
        if(ost>=0)
        {
            var sb = new StringBuilder();
            sb.append(NAWIAS_ANONIM_LEWY);
            for(int i=0;i<=ost;i++)
            {
                sb.append(Double.isFinite(pam[i])?pam[i]:"0.0/*inf/nan*/").append(" ");
            }
            sb.append(NAWIAS_ANONIM_PRAWY);
            return sb.toString();
        }else{return "";}
    }

    public String kod_instr_procesowych(Silnik s,boolean importy_gdzie_można)
    {
        var sb = new StringBuilder();
        {
            sb.append(ZAWIJAS_LEWY);
            var importy = new ArrayList<String>();
            for(String id: nazwy.keySet())
            {
                Nazwa zewn,wewn=this.nazwy.get(id);
                //szukaj nazwy w głównej przestrzeni i w bibliotece
                //jeżeli główna przestrzen zawiera, włączono przełącznik i zawartość wartość odwołania jest w obu miescach taka sama.
                if((zewn=s.główny.nazwy.get(id))!=null && !importy_gdzie_można && zewn == wewn)
                {
                    importy.add("/*ctx*/"+id);
                }
                else if((zewn=Środowisko.biblioteka_nazw.get(id))!=null && !importy_gdzie_można && zewn == wewn){
                    importy.add(id);
                }
                else{
                    //inaczej trzeba napisac pełną definicję
                    sb.append(id).append(PRZYPISANIE_DLUGIE).append(wewn.kod(s,true)).append(";");
                }
                if(importy.size()>0)
                {
                    sb.append("use ");
                    for (var ip:importy) {
                        sb.append(ip).append(',');
                    }
                    sb.deleteCharAt(sb.length()-1);//usuwanie ostatniego przecinka
                    sb.append(";");
                }
            }
            sb.append(ZAWIJAS_PRAWY);
            if(sb.length() == ZAWIJAS_LEWY.length() + ZAWIJAS_PRAWY.length()){sb.delete(0,sb.length()-1);}//w takim razie tu nic nie ma...
        }
        return sb.toString();
    }

    //przygotowuje program do wykonania, ustawiając stan nazw specjalnych nazw odpowiednio, w tym rozmiar segmentu anonimowego w zależności od MEMLIMIT
    public void inicjuj(Silnik s){
        if(this.nazwy.get(NAZWA_LIMITU_PAMIECI)==null){this.nazwy.put(NAZWA_LIMITU_PAMIECI, new Zmienna(DOMYSLNY_LIMIT_PAMIECI));}
        if(this.nazwy.get(NAZWA_ARGMIN)==null){this.nazwy.put(NAZWA_ARGMIN, new Zmienna(DOMYSLNY_ARGMIN));}
        if(this.nazwy.get(NAZWA_ARGMAX)==null){this.nazwy.put(NAZWA_ARGMAX, new Zmienna(DOMYSLNY_ARGMAX));}

        zawijanie = (int)(this.nazwy.get(NAZWA_LIMITU_PAMIECI).policz(s));
        _argcmin = (int)(this.nazwy.get(NAZWA_ARGMIN).policz(s));
        _argcmax = (int)(this.nazwy.get(NAZWA_ARGMAX).policz(s));
        if(this.pam==null || this.pam.length != zawijanie){rezerwuj_lokalną_pamięć(zawijanie);}
        Arrays.fill(this.pam,0);
    }
    //public double wykonaj(){return NaN;}
    public double ostatni_wynik = NaN;

    public  double DOKLADNOSC_POROWNANIA=0.0001;
    public String dotId(){return "P"+System.identityHashCode(this);}

    public enum Ewaluacja {

        GORLIWA(0),
        SPRYTNA(1),
        LENIWA(2);

        private final Integer typ;

        Ewaluacja(int typ) {
            this.typ = typ;
        }

        public String toString() {
            return switch (typ) {
                case 0 -> "eager";
                case 1 -> "smart";
                case 2 -> "lazy";
                default -> "?";
            };
        }

        public static Ewaluacja zNapisu(String napis, Ewaluacja domyślna) {
            return switch (napis) {
                case "eager", "EAGER" -> Ewaluacja.GORLIWA;
                case "smart", "SMART" -> Ewaluacja.SPRYTNA;
                case "lazy", "LAZY" -> Ewaluacja.LENIWA;
                default -> domyślna;
            };
        }
    }

}
