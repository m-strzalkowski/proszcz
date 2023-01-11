package ms.drzewo.wezly;

import ms.drzewo.Węzeł;
import ms.interpreter.Silnik;

import static ms.drzewo.Definicje.PRAWDA;

/**
 * Zwraca pierwsze PRAWDZIWE - dodatnie, lub NieBędąceLiczbą(NaN) dziecko, albo średnią arytmetyczna dzieci.
 */
public class Rozjazd extends Węzeł {
    public int dziecimin(){return 2;}
    public  int dziecimax(){return 2;}
    public Rozjazd(){}
    public Rozjazd(Węzeł lewy, Węzeł prawy){dzieci = new Węzeł[]{lewy,prawy};}
    @Override
    public double policz(Silnik s) {
        double w,a=0;
        for(var dz:dzieci)
        {
            w = dz.licz(s);
            if(PRAWDA(w))return w;
            a+=w;
        }
        return a/dzieci.length;//wszytkie ujemne - średnia arytmetyczna
    }
    public String kodPodrzewa()
    {
        return dzieci[0].kodPodrzewa() +
                "|" +
                dzieci[1].kodPodrzewa();

    }
    @Override
    public String txtRepr(){return "|";}
}
