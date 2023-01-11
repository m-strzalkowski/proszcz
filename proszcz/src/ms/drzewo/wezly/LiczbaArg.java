package ms.drzewo.wezly;

import ms.drzewo.Węzeł;
import ms.interpreter.Silnik;

import static ms.drzewo.Definicje.adresacja_cykliczna;

public class LiczbaArg extends Węzeł {
    public int dziecimin(){return 0;}
    public  int dziecimax(){return 0;}
    public double waga_domyślna(){return 1.0;}
    @Override
    public double policz(Silnik silnik) {
        return silnik.aktualny().liczba_argumentów();
    }
    @Override
    public String kodPodrzewa()
    {
        return "argc";
    }
    @Override
    public String txtRepr(){return "argc";}
}
