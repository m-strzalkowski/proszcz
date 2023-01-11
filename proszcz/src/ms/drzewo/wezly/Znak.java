package ms.drzewo.wezly;

import ms.drzewo.Węzeł;
import ms.interpreter.Silnik;

public class Znak extends Węzeł {
    public int dziecimin(){return 1;}
    public  int dziecimax(){return 1;}
    public Znak(char znak){this.znak=znak;}
    public Znak(char znak, Węzeł poddrzewo)
    {
        this.znak = znak;
        this.dzieci = new Węzeł[]{poddrzewo};
    }
    char znak='+';
    @Override
    public double policz(Silnik s) {
        return znak=='-'? -(dzieci[0].licz(s)): dzieci[0].licz(s);
    }
    public String kodPodrzewa()
    {
        return znak + "("+dzieci[0].kodPodrzewa() +")";

    }
    @Override
    public String txtRepr(){return ""+znak;}

}
