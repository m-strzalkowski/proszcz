package ms.interpreter;

import ms.proces.Nazwa;
import ms.proces.Proces;

/**
 * Opisuje najwazniejsze funkcjonalności silnika
 */
public interface ISilnik {
    /** Podaje proces przypięty do danej nazwy albo null
     */
    Nazwa daj_proces(String nazwa);

    /** Przypina proces do danej nazwy
     */
    void przypnij(String nazwa,Proces p);
    /** W procesie pod daną nazwą są wykonywane specjalne nazwy - MEMLIMIT (i alokowany jest segment), STEPLIMIT itd...
     */
    void inicjuj(String nazwa);
    /** przypnij(p,nazwa);inicjuj(nazwa);
     */
    void załaduj(String nazwa,Proces p);

    /** Czyszczenie limitów i segmentu anonimowego
     */
    void przygotuj(String nazwa);

    /** Uruchamia daną nazwę i zwraca, co sie wyliczy.
     */
    double uruchom(String nazwa);
    double uruchom(String nazwa, double[] argumenty);


    /** przygotuj(nazwa); uruchom(nazwa);
     */
    double wykonaj(String nazwa);
    double wykonaj(String nazwa, double[] argumenty);

    double wykonaj_tekst(String tekst);
    void resetuj();
}
