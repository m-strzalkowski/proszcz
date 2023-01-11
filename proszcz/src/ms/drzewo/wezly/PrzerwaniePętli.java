package ms.drzewo.wezly;

import ms.drzewo.Węzeł;
import ms.interpreter.Przerwanie;
import ms.interpreter.Silnik;

public class PrzerwaniePętli extends Węzeł {
    public double waga_domyślna(){return 0.0;}//domyslnie wyłączone
    public int dziecimin(){return 1;}
    public  int dziecimax(){return 1;}
    public PrzerwaniePętli(){}
    public PrzerwaniePętli(Węzeł zwracane){dzieci = new Węzeł[]{zwracane};}
    @Override
    public double policz(Silnik s) {
        s.ostatnia_wartość_zwracana = dzieci[0].licz(s);
        throw new Przerwanie();
    }
    @Override
    public String kodPodrzewa()
    {
        return "break_with "+dzieci[0].kodPodrzewa();
    }
    @Override
    public String txtRepr(){return "break_with";}
}
