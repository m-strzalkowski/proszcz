package ms.gp.ewolucja;

import ms.drzewo.Węzeł;
import org.antlr.v4.runtime.misc.Pair;

import java.util.ArrayList;

/**
 * Zapisuje, co stało się w danej generacji
 */
public class Historia {
    public Historia(int numer) {
        this.numer = numer;
    }

    public int getNumer() {
        return numer;
    }

    private int numer;
    double najlepsze_przystosowanie;
    double średnie_przystosowanie;
    double najgorsze_przystosowanie;

    Pair<Węzeł, Double>[] najlepsze_osobniki;

    ArrayList<String> polecenia = new ArrayList<>();
}
