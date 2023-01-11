package ms.drzewo.wezly;

import ms.drzewo.Węzeł;
import ms.interpreter.Silnik;

public class Adres extends Węzeł {
    public int dziecimin(){return 0;}
    public  int dziecimax(){return 0;}
    public double waga_domyślna(){return 0.0;}
    String nazwa = null;
    public Adres(String nazwa){this.nazwa=nazwa;}
    @Override
    public double policz(Silnik silnik) {
        //silnik.lwartosci.push(nazwa);
        silnik.adres = silnik.aktualny().szukaj_nazwy(nazwa);
        //System.err.println("ADRES:"+silnik.adres);
        return Double.NaN;
    }
    @Override
    public String kodPodrzewa()
    {
        return "."+nazwa;
    }
    @Override
    public String txtRepr(){return "."+nazwa;}
}
