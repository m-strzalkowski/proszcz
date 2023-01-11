package ms.drzewo.wezly;

import ms.drzewo.Węzeł;
import ms.interpreter.Silnik;
import ms.proces.strumienie.IStrumień;

import static ms.drzewo.Definicje.NUMER_DESKRYPTORA_STANDARDOWEGO_WEJŚCIA;

public class Czytaj extends Węzeł {
    public int dziecimin(){return 0;}
    public  int dziecimax(){return 1;}
    public double waga_domyślna(){return 2.0;}
    @Override
    public double policz(Silnik silnik) {
        if(dzieci == null){kontrola();}
        int nr_in=NUMER_DESKRYPTORA_STANDARDOWEGO_WEJŚCIA;
        if(dzieci!=null && dzieci.length >0){nr_in = (int)dzieci[0].licz(silnik);}
       IStrumień in= silnik.aktualny().daj_deskryptor(nr_in);
       return in.czytaj_lub_nan();
    }
    @Override
    public String kodPodrzewa()
    {
        return "read"+(dzieci!=null&&(dzieci.length>0)?("("+dzieci[0].kodPodrzewa()+")"):"");
    }
    @Override
    public String txtRepr(){return "read";}
}
