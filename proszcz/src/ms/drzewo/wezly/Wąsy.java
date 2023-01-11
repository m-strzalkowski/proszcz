package ms.drzewo.wezly;

import ms.drzewo.Węzeł;
import ms.interpreter.Silnik;

import static java.lang.Double.NaN;

public class Wąsy extends Węzeł {
    private int _dziecimax=4096;
    private int _dziecimin=0;

    public int dziecimin(){return _dziecimin;}
    public  int dziecimax(){return _dziecimax;}
    public Wąsy(){}
    public Wąsy(double dzieci){_dziecimin=(int)dzieci;_dziecimax=(int)dzieci;}
    public Wąsy(Węzeł [] dzieci)
    {
        this.dzieci = dzieci;
    }
    @Override
    public double policz(Silnik s) {
        double wynik=NaN;
        for(var dz:dzieci)
        {
            wynik = dz.licz(s);
        }
        return wynik;
    }

    @Override
    public String kodPodrzewa()
    {
        if(dzieci==null){kontrola();}
        var sb = new StringBuilder("{");
        for(var dz : this.dzieci){sb.append(dz.kodPodrzewa()).append(";");}
        sb.append("}");
        return sb.toString();

    }
    @Override
    public String txtRepr(){return "{}";}
}