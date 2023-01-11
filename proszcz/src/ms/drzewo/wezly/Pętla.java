package ms.drzewo.wezly;

import ms.drzewo.Węzeł;
import ms.interpreter.Przerwanie;
import ms.interpreter.Silnik;

import static ms.drzewo.Definicje.PRAWDA;

/**
 * Pierwsze dziecko - warunek pętli, sprawdzany jeśli i dopóki PRAWDZIWY, drugie dziecko - ciało pętli. Zwraca ostatni warunek - zawsze ujemną (chyba, że przerwany)
 */
public class Pętla extends Węzeł {
    public int dziecimin(){return 2;}
    public  int dziecimax(){return 2;}
    public double waga_domyślna(){return 1.0;}
    public Pętla(){}
    public Pętla(Węzeł warunek, Węzeł ciało)
    {
        dzieci = new Węzeł[]{warunek, ciało};
    }
    @Override
    public double policz(Silnik s) {
        double a;
        while(PRAWDA(a=dzieci[0].licz(s)))
        {
            try{dzieci[1].licz(s);}catch(Przerwanie p){break;}
        }
        return a;
    }
    public String kodPodrzewa()
    {
        return new StringBuilder("while(")
                .append(dzieci[0].kodPodrzewa())
                .append(")")
                .append(dzieci[1].kodPodrzewa())
                .toString();

    }
    @Override
    public String txtRepr(){return "while";}
}
