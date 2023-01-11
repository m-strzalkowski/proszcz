package ms.drzewo;

/**
 * Reprezentuje funkcjonalność czegoś, co pełni rolę węzła w drzewie składniowym
 * Nie koniecznie musi trzymać przy sobie, np. FunkcjaWbudowana powinna zachowywac się jak IWęzeł, choć konkretny Węzeł będzie typu Wywołanie, jedynie słabo połączony z konkretna Funckją
 */
public interface IWęzeł {
    public  boolean isTerminal();
    public int dziecimin();
    public  int dziecimax();

    public double waga_domyślna();
}
