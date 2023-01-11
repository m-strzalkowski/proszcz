package ms.drzewo.operacje.losowe;

import ms.drzewo.Węzeł;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class LosowaczTablicowyWęzłów implements IPodawaczWęzłów{
    public Map<String,Kawałek> poNazwie = new HashMap<String,Kawałek>();
    Kawałek[] wszystkie;
    Kawałek[] terminale;
    Kawałek[] nieterminale;
    public LosowaczTablicowyWęzłów(){
        wszystkie = new Kawałek[0];
        terminale = new Kawałek[0];
        nieterminale = new Kawałek[0];
    }

    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        BigDecimal bd = BigDecimal.valueOf(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
    public Węzeł wybierz_z_tablicy(Kawałek[] tablica, Double typ, Double wewn) {
        int tmax = tablica.length;
        if(typ==null){ typ = (Math.random() * tmax);}
        Kawałek k = tablica[typ.intValue()];
        if(wewn==null){
            wewn = ((Math.random() * (k.wewn_max - k.wewn_min)) + k.wewn_min);
            if(k.wewn_zaokr_exp!=null){wewn = round(wewn, k.wewn_zaokr_exp);}
        }
        return k.generator.apply(wewn);
    }

    @Override
    public Węzeł węzeł(Double typ, Double wewn) {
        return wybierz_z_tablicy(wszystkie,typ,wewn);
    }

    @Override
    public double ilość_wszystkich() {
        return wszystkie.length;
    }

    @Override
    public double ilość_terminali() {
        return terminale.length;
    }

    @Override
    public double ilość_funkcji() {
        return nieterminale.length;
    }

    @Override
    public Węzeł terminal(Double typ, Double wewn) {
        return wybierz_z_tablicy(terminale,typ,wewn);
    }

    @Override
    public Węzeł nieterminal(Double typ, Double wewn) {
        return wybierz_z_tablicy(nieterminale,typ,wewn);
    }

    @Override
    public void rejestruj(Function<Double, Węzeł> generator, String nazwa) {
        poNazwie.put(nazwa, new Kawałek(generator,nazwa,0,0,0,Rozkład.JEDNOSTAJNY));
    }

    @Override
    public boolean zarejestrowane(String name) {
        return poNazwie.containsKey(name);
    }

    @Override
    public void mutuj(String nazwa, Double waga,Double min_wewn, Double max_wewn,Double dziecimin, Double dziecimax, Integer zaokr_exp) {
        Kawałek k = poNazwie.get(nazwa);
        if(k==null){throw new RuntimeException("No element:"+nazwa);}
        if(waga!=null){k.waga=waga;}
        if(min_wewn!=null){k.wewn_min=min_wewn;}
        if(max_wewn!=null){k.wewn_max=max_wewn;}
        if(dziecimin!=null){k.dziecimin=dziecimin.intValue();}
        if(dziecimax!=null){k.dziecimax=dziecimax.intValue();}
        /*if(zaokr_exp!=null)*/{k.wewn_zaokr_exp=zaokr_exp;}
    }

    @Override
    public void duplikuj(String oryginał, String duplikat) {
        Kawałek k = poNazwie.get(oryginał);
        if(k==null){throw new RuntimeException("No element:"+oryginał);}
        Kawałek d = new Kawałek(k);//kopia
        d.nazwa=duplikat;
        poNazwie.put(duplikat,d);
    }

    /*
    public void rejestruj(Function<Double, Węzeł> generator, String nazwa, double waga, int dziecimin, int dziecimax) {
        //System.out.println("NAZWA:"+nazwa);
        poNazwie.put(nazwa, new Kawałek(generator,nazwa,waga,dziecimin,dziecimax,Rozkład.JEDNOSTAJNY));
                //Kawałek(Function<Double, Węzeł> generator, String nazwa, double waga, int dziecimin, int dziecimax, Rozkład rozkład)
    }*/
    @Override
    public void zakres_dla_generatora(String nazwa,double wewn_min, double wewn_max, Integer wewn_zaokr_exp){
        var k = poNazwie.get(nazwa);
        if(k==null){throw new RuntimeException("No element:"+nazwa);}
        k.wewn_zakres(wewn_min,wewn_max,wewn_zaokr_exp);
    }

    @Override
    public void wyrejestruj(String nazwa) {
        poNazwie.remove(nazwa);
    }

    @Override
    public void przelicz() {
        int licznik=0;
        int sumawag=0,suma_nieterm=0,suma_term=0,waga,i;Kawałek k;
        for (String nazwa: poNazwie.keySet()) {
            k = poNazwie.get(nazwa);
            sumawag += (int)k.waga;
            if(k.terminal()){suma_term+=(int)k.waga;}
        }
        suma_nieterm = sumawag-suma_term;
        this.wszystkie = new Kawałek[sumawag];
        this.terminale = new Kawałek[suma_term];
        this.nieterminale = new Kawałek[suma_nieterm];
        int pozw=0,pozt=0,pozn=0;
        for (String nazwa: poNazwie.keySet()) {
            k = poNazwie.get(nazwa);
            waga = (int)k.waga;
            for(i=0;i<waga;i++)
            {
                wszystkie[pozw++] = k;
                if(k.terminal()){terminale[pozt++]=k;}
                else{nieterminale[pozn++]=k;}
            }
        }
    }
    public String wypisz_liczac_duplikaty(Object[] t)
    {
        var sb = new StringBuilder();
        if(t!=null && t.length>0)
        {
            Object poprz = t[0];
            int start=0,i=0;
            for(i=0;i<t.length;i++)
            {
                if(t[i]!=poprz){
                    sb.append(poprz.toString()).append("[").append(start).append(",").append(i).append("] ").append(i-start).append("\n");
                    poprz = t[i];
                    start=i;
                }
            }
            sb.append(poprz.toString()).append("[").append(start).append(",").append(i).append("] ").append(i-start).append("\n");
        }
        return sb.toString();
    }
    @Override
    public String toString() {
        var sb = new StringBuilder();
        sb.append("\nWEIGHTS:");
        sb.append("\n================");
        sb.append("\nALL:\n");
        sb.append(wypisz_liczac_duplikaty(wszystkie));
        sb.append("\nTERMINALS:\n");
        sb.append(wypisz_liczac_duplikaty(terminale));
        sb.append("\nNONTERMINALS:\n");
        sb.append(wypisz_liczac_duplikaty(nieterminale));
        sb.append("\n================\n");
        return sb.toString();
    }
}
