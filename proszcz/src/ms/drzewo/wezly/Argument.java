package ms.drzewo.wezly;

import ms.drzewo.Węzeł;
import ms.interpreter.Silnik;

import static ms.drzewo.Definicje.adresacja_cykliczna;

public class Argument extends Węzeł {
    public int dziecimin(){return 1;}
    public  int dziecimax(){return 1;}
    public double waga_domyślna(){return 2.0;}
    @Override
    public double policz(Silnik silnik) {
        if(dzieci == null){kontrola();}
        double nr_arg = dzieci[0].licz(silnik);
        int max_nr_arg = silnik.aktualny().argcmax();
        if(max_nr_arg<1){throw new RuntimeException("This procedure has declared 0 parameters, arg(x) instruction is useless");}
        return silnik.aktualny().argument(adresacja_cykliczna( nr_arg,max_nr_arg),silnik);
    }
    @Override
    public String kodPodrzewa()
    {
        return "arg"+(dzieci!=null&&(dzieci.length>0)?("("+dzieci[0].kodPodrzewa()+")"):"");
    }
    @Override
    public String txtRepr(){return "arg";}
}
