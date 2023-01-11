package ms.drzewo.wezly;

import ms.drzewo.Węzeł;
import ms.interpreter.Silnik;

import static ms.drzewo.Definicje.PRAWDA;

public class Warunek extends Węzeł {
    public int dziecimin(){return 3;}
    public  int dziecimax(){return 3;}
    public Warunek(){}
    public Warunek(Węzeł test, Węzeł poAkceptacji, Węzeł poFalsyfikacji)
    {
        dzieci = new Węzeł[]{test,poAkceptacji,poFalsyfikacji};
    }
    @Override
    public double policz(Silnik s) {
        double war = dzieci[0].licz(s);
        if(PRAWDA(war))
        {return dzieci[1].licz(s);}
        else{return dzieci[2].licz(s);}
    }
    public String kodPodrzewa()
    {
        return new StringBuilder("if(")
                .append(dzieci[0].kodPodrzewa())
                .append(")")
                .append(dzieci[1].kodPodrzewa())
                .append(" else ")
                .append(dzieci[2].kodPodrzewa())
                .toString();

    }
    @Override
    public String txtRepr(){return "if-else";}
}
