package ms.drzewo.operacje.losowe;

import ms.drzewo.Węzeł;

import java.util.function.Function;

/**
    Klasa ta przechowuje informacje o wycinku języka tak, by mogła podawać losowe węzły, biorąc pod uwagę zarejestrowane wagi ich występowania.
 */
public interface IPodawaczWęzłów {
    /**
     * @param typ liczba z zakresu [0,maxtyp()], która wybiera zwracany typ węzła. Jeśli null, zostanie wylosowany
     * @param wewn Parametr do generatora danego typu, jeśli null, zostanie odpowiednio wylosowany.
     * @return Węzeł jakiegoś podtypu, zwracanego przez wylosowany generator
     */
    Węzeł węzeł(Double typ, Double wewn);
    double ilość_wszystkich();
    double ilość_terminali();
    double ilość_funkcji();
    /** Robi to samo, co węzeł(), tylko losuje spośród węzłów mogących  mieć tylko od 0 do 0 dzieci.
     * @param typ liczba z zakresu [0,maxtyp()], która wybiera zwracany typ węzła. Jeśli null, zostanie wylosowany
     * @param wewn Parametr do generatora danego typu, jeśli null, zostanie odpowiednio wylosowany.
     * @return Węzeł jakiegoś podtypu, zwracanego przez wylosowany generator, mający 0 dzieci.
     */
    Węzeł terminal(Double typ, Double wewn);

    /** Robi to samo, co węzeł(), tylko losuje spośród węzłów NIE mających od 0 do 0 dzieci.
     * @param typ liczba z zakresu [0,maxtyp()], która wybiera zwracany typ węzła. Jeśli null, zostanie wylosowany
     * @param wewn Parametr do generatora danego typu, jeśli null, zostanie odpowiednio wylosowany.
     * @return Węzeł jakiegoś podtypu, zwracanego przez wylosowany generator, mający więcej niż 0 dzieci.
     */
    Węzeł nieterminal(Double typ, Double wewn);

    /** Dodaje do razkładu prawdopodobieństw element. (ale zob. metodę przelicz!)
     * @param generator Funkcja ta ma zwracać bezdzietny obiekt potomny od Węzła, generując jego zawartość na podstawie parametru.
     * @param nazwa Pod jaką nazwą zapisać ten generator
     */
    void rejestruj(Function<Double, Węzeł> generator, String nazwa);
    boolean zarejestrowane(String name);
    /**
     * @param nazwa
     * @param waga Jaką wagę przy losowaniu ma posiadać element. (Na razie tylko int i to małe np. 1,2,5, bo inaczej wewnętrzna tablica się rozedmie  (żeby zachować O(1)))
     * @param wewn_min jeśli null -nie powoduje przestawienia wagi.
     * @param wewn_max
     * @param zaokr_exp
     */
    void mutuj(String nazwa, Double waga,Double wewn_min, Double wewn_max, Double dziecimin, Double dziecimax, Integer zaokr_exp);

    void duplikuj(String oryginał, String duplikat);

    //void rejestruj(Function<Double, Węzeł> generator, String nazwa, double waga,int dziecimin,int dziecimax);
    void zakres_dla_generatora(String nazwa,double min, double max, Integer zaokr_exp);
    /**
     * @param nazwa Nazwa, którą należy usunąć z rozkładu prawdopodobieństwa. (ale zob. metode przelicz!)
     */
    void wyrejestruj(String nazwa);
    /** Wprowadza w życie zmiany ustawione przez zarejestruj/ wyrejestruj. Przed tym wywołaniem obiekt nie ma obowiązku uwzględniac ich przy losowaniu węzła.
     */
    void przelicz();

    /** Zgodnie z nazwą zwraca zapis /tortu prawdopodobieństwa/ znajdującego się w środku
     */
    String toString();
}
