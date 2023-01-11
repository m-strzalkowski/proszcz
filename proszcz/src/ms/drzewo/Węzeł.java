package ms.drzewo;

import ms.bledy.SemanticOccurence;
import ms.bledy.wykonania.ZlyWezel;
import ms.drzewo.wezly.Adres;
import ms.interpreter.Silnik;
import org.antlr.v4.runtime.Token;

import static java.lang.Math.abs;

public abstract class Węzeł implements Cloneable {

    /**
     */
    @Override
    public Object clone() throws CloneNotSupportedException {
        Object obj = super.clone();
        Węzeł w = (Węzeł) obj;
        if(w.dzieci!=null) {w.dzieci = w.dzieci.clone();}
        return (Object)w;
    }

    public Węzeł [] dzieci=null;
    public final boolean isTerminal(){return dzieci==null || dzieci.length<1;}
    public int dziecimin(){return 0;}
    public  int dziecimax(){return 1024;}
    public void kontrola() {
        if(dzieci == null)
        {
            if(dziecimin()==0 ){return;}
            else{throw new ZlyWezel(SemanticOccurence.Level.FATAL,this,-1,-1,"0 children not inrequired range:["+dziecimin()+","+dziecimax()+"]."+this.getClass());}
        }
        else{
            if(dzieci.length< dziecimin() || dzieci.length > dziecimax())
            {throw new ZlyWezel(SemanticOccurence.Level.FATAL,this,-1,-1,""+dzieci.length+" children not inrequired range:["+dziecimin()+","+dziecimax()+"]."+this.getClass());}
        }
    }

    public double waga_domyślna(){return 2.0;}

    public Token start=null;
    public Token stop=null;
    public Węzeł loc(Token start, Token stop){this.start=start;this.stop=stop;return this;}
    //kolor, potrzebny wyłącznie do wizualizaji.
    public long kolor=0xfafafa;//w 64bitach miesci się kolor htmlowy.
    public String kolorHTML(){return String.format("#%06x",kolor&0x00ffffff);}

    /** Po każdym węźle trzeba coś zrobić. Generalnie tylko Adres zwraca Nazwę - lwartość mozliwa do zmutowanie, a przypisanie na jego skonsumowanie
     */
    public void sprawdź_stan(Silnik s)
    {
        if(s.adres!=null){throw new RuntimeException("Got address when should have value. Adress is of"+s.adres.kod(s,false));}
    }

    public abstract double policz(Silnik silnik);//Ze środka implementacji  policz, koniecznie nie wywoływac samego policz, tylko licz, by kod kontrolny mógł sie wykonać.
    public final double licz(Silnik s){//kod nadzorujący, aby kontrola w ogóle mogła powrócić ze środka drzewa.
        sprawdź_stan(s);

        if(s.liczba_wykonanch_wezłów>s.limit_wykonanch_wezłów){s.liczba_wykonanch_wezłów=0; throw new RuntimeException("PRZEKROCZONO LIMIT");}
        double r = s.ostatnia_wartość_zwracana = policz(s);
        ++s.liczba_wykonanch_wezłów;
        if(s.trace)System.out.println("["+s.liczba_wykonanch_wezłów+"]:"+s.ostatnia_wartość_zwracana+"<-"+this.txtRepr());
        return r;
    }
    //Węzeł(){}//nie należy robić węzłów nie bedących podtypami.
    public String kodPodrzewa()
    {
        var sb = new StringBuilder("WĘZEŁ:{");
        if(dzieci!=null && dzieci.length>0)for(var dz : this.dzieci){sb.append(dz.kodPodrzewa()).append(",");}
        sb.append("}");
        return sb.toString();
    }

    /**
     * @return reprezentacja samego węzła, jego nazwy, bez dzieci, np. dla BinarneArytm('+') : "+", a nie np.2+2
     */
    public String txtRepr(){return (isTerminal()? "TERMINAL:"+this.getClass().getName() : "NIETERMINAL:"+this.getClass().getName())+(((start.getLine()>=0 && stop.getLine()>=0) )?("<"+start.getLine()+":"+start.getCharPositionInLine()+","+stop.getLine()+":"+stop.getCharPositionInLine()+ ">"):(""));}
    //public String internalRepr(){return "["+zawartość+ "]("+zm+","+st+","+wt+")";}

    /**
     * @return Tekst unikalnego id węzła do graphviza
     */
    public String dotId(){return "N"+System.identityHashCode(this);}

    /**
     * @return Zapis węzła wraz z dziećmi w DOT graphviza.
     */
    public String dotRepr()
    {
        StringBuilder sb = new StringBuilder();

        if(dzieci!=null)
        {
            for (var dz:dzieci) {
                sb.append(this.dotId());
                sb.append(" -> ");
                sb.append(dz.dotId());
                sb.append(";\n");
            }
        }
        sb.append(this.dotId());
        sb.append("[label=\"");
        sb.append(this.txtRepr());
        sb.append("\";fillcolor=\"");
        sb.append(this.kolorHTML());
        sb.append("\";];\n");
        return sb.toString();
    }

}
