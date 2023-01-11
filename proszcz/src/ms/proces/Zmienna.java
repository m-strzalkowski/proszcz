package ms.proces;

import ms.drzewo.Węzeł;
import ms.drzewo.wezly.Stała;
import ms.interpreter.Silnik;

import static java.lang.Double.NaN;

public class Zmienna implements Nazwa{

    private double wartość=NaN;
    public double zmutuj(double nowa_wartosc){
        //System.err.println("|"+wartość+"=>"+nowa_wartosc+"|");
        return wartość=nowa_wartosc;
    }
    public Zmienna(double wartość)
    {
        this.wartość=wartość;
    }
    @Override
    public double policz(Silnik s, Węzeł[] argumenty) {
        if(argumenty!=null){throw new RuntimeException("Variable has no arguments,"+argumenty.length+" were given.");}
        return wartość;
    }
    @Override
    public double policz(Silnik s, double[] argumenty) {
        if(argumenty!=null){throw new RuntimeException("Variable has no arguments,"+argumenty.length+" were given.");}
        return wartość;
    }

    @Override
    public double policz(Silnik s) {
        return wartość;
    }
    public double policz() {
        return wartość;
    }

    @Override
    public int argcmin() {
        return 0;
    }

    @Override
    public int argcmax() {
        return 0;
    }

    @Override
    public String kod(Silnik s,boolean czy_rekursywnie_w_głąb) {
        return ""+wartość;
    }
    public String kod() {
        return ""+wartość;
    }

    @Override
    public void inicjuj(Silnik s) {
        return;
    }
    /**
     *Sprawdza, czy drzewo nie ma statycznie policzalnej wartości (na razie, czy składa sie z jedynego węzła typu Stała) i jeśli tak, zwraca Zmienną, jesli nie - null.
     */
    public static  Zmienna spróbuj_statycznie_zredukować(Węzeł drzewo)
    {
        if(drzewo instanceof Stała)
        {
            double w = ((Stała)drzewo).policz();
            return new Zmienna(w);
        }
        else return null;
    }
    public String dotId(){return "Z"+System.identityHashCode(this);}
}
