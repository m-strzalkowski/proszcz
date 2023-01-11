package ms.proces;

import ms.drzewo.Węzeł;
import ms.interpreter.Silnik;

public interface Nazwa {
    double policz(Silnik s, double[] argumenty);
    double policz(Silnik s, Węzeł[] argumenty);
    double policz(Silnik s);

    int argcmin();//minimalna liczba argumentów wywołania
    int argcmax();//maksymalna liczba argunetów wywołania

    String kod(Silnik s,boolean czy_rekursywnie_w_głąb);//zwraca poprawy kod definiujacy taką nazwę, z lub bez poddefinicji.

    void inicjuj(Silnik s);//dla programów

    String dotId();
}
