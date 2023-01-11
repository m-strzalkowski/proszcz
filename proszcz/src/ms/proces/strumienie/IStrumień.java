package ms.proces.strumienie;

import java.util.function.Consumer;

public interface IStrumień {

    public boolean pisz(double co);
    public double czytaj();
    public void poCzytaniu(Consumer<Double> zwrotne);
    public void poKońcu(Consumer<Integer> zwrotne);
    public double czytaj_lub_nan();
    public double czytaj_cyklicznie();

    /**Powoduje zsynchronizowanie z sekwencją wyjściową/wejściową
     * @return
     */
    public boolean synchronizuj();
}
