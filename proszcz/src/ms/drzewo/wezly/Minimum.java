package ms.drzewo.wezly;

import ms.drzewo.Węzeł;
import ms.interpreter.Silnik;

import static ms.drzewo.Definicje.PRAWDA;

/**
 * Zwraca mniejszy z argumentów, może służyc za koniunkcję logiczna, przy przyjętej definicji prawdy.
 * sgn(a) sgn(b) sgn(min(a,b))
 *   -      -          -
 *   -      +          -
 *   +      -          -
 *   +      +          +
 */
@SuppressWarnings("GrazieInspection")
public class Minimum extends Węzeł{
    public int dziecimin(){return 2;}
    public  int dziecimax(){return 2;}
    public Minimum(){}
    public Minimum(Węzeł lewy, Węzeł prawy){dzieci = new Węzeł[]{lewy,prawy};}
    @Override
    public double policz(Silnik s) {
        double w,najmn=Double.POSITIVE_INFINITY;
        for(var dz:dzieci)
        {
            w = dz.licz(s);
            if(w<najmn){najmn=w;}
        }
        return najmn;
    }
    public String kodPodrzewa()
    {
        return dzieci[0].kodPodrzewa() +
                "&" +
                dzieci[1].kodPodrzewa();

    }
    @Override
    public String txtRepr(){return "&";}
}
