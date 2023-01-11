package ms.drzewo.wezly;

import ms.drzewo.Węzeł;
import ms.interpreter.Silnik;

import static java.lang.Double.NaN;

public class Stała extends Węzeł {
    public int dziecimin(){return 0;}
    public  int dziecimax(){return 0;}
    public double waga_domyślna(){return 2.0;}
    public Stała(double wartość){this.wartość=wartość;}
    double wartość=NaN;
    @Override
    public double policz(Silnik s) {return wartość;}
    public double policz() {return wartość;}
    @Override
    public String txtRepr() {return Double.toString(wartość);}
    public String kodPodrzewa()
    {
        return Double.toString(wartość);
    }
}
