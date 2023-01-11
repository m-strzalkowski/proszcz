package ms.drzewo.wezly;

import ms.drzewo.Węzeł;
import ms.interpreter.Silnik;

/** Zwraca, wartość komórki segmentu anonimowego o adresie zadanym przez wynik poddrzewa/
 * Indeksem jest cecha(abs(wynik poddrzewa)) mod wielkość pamięci
 */
public class Dereferencja extends Węzeł {
    public int dziecimin(){return 1;}
    public  int dziecimax(){return 1;}
    public double waga_domyślna(){return 3.0;}
    public Dereferencja(){}
    public Dereferencja(Węzeł czego)
    {
        dzieci = new Węzeł[]{czego};
    }
    @Override
    public double policz(Silnik s) {
        var p =s.aktualny();
        return  p.pam[p.indeks_pam(dzieci[0].licz(s))];
    }
    @Override
    public String kodPodrzewa()
    {
        return "["+dzieci[0].kodPodrzewa()+"]";
    }
    @Override
    public String txtRepr(){return "[]";}
}
