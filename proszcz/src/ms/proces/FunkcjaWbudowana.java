package ms.proces;

import ms.drzewo.Węzeł;
import ms.interpreter.Silnik;

import java.util.function.Function;

public class FunkcjaWbudowana implements Nazwa{

    Function<double [], Double> funkcja=null;
    String nazwa_funkcji_wbudowanej=null;
    int argcmin_ = 0;
    int argcmax_=0;
    public FunkcjaWbudowana(Function<double [], Double> funkcja, String nazwa, int argcmin, int argcmax)
    {
        this.funkcja = funkcja;
        this.nazwa_funkcji_wbudowanej = nazwa;
        this.argcmin_=argcmin;
        this.argcmax_=argcmax;
    }
    @Override
    public double policz(Silnik s, Węzeł[] argumenty) {
        //ewaluacja argumentów
        double[] wartosci_arg = null;
        if(argumenty!=null)
        {
            wartosci_arg = new double[argumenty.length];
            for(int i=0;i<argumenty.length;i++)
            {
                wartosci_arg[i] = argumenty[i].policz(s);
            }
        }
        return funkcja.apply(wartosci_arg);
    }
    @Override
    public double policz(Silnik s, double[] argumenty) {
        return funkcja.apply(argumenty);
    }
    @Override
    public double policz(Silnik s) {
        return funkcja.apply(null);
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
        return "/*built in function "+nazwa_funkcji_wbudowanej+"*/0;use "+nazwa_funkcji_wbudowanej;
    }
    public String kod() {
        return kod(null,true);
    }

    @Override
    public void inicjuj(Silnik s) {

    }
    public String dotId(){return "F"+System.identityHashCode(this);}
}
