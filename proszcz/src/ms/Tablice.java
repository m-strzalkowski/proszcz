package ms;

import ms.bledy.Błędnik;

public class Tablice {

    public static String inputFilePath;
    public static String outputFilePath;

    public static String testInputFilePath;
    public static String testOutputFilePath;
    public static boolean interaktywny=false;
    public static boolean upraszczanie=false;
    public static boolean pokazywanie=false;
    public  static boolean dziwnedzielenie=false;

    public static double PRÓG_DZIWNODZIELENIA =0.001;//od jakiej wartości mianownika dzielenia ma się zachowywać inaczej niż powinno (za TinyGp)
    public static String nazwa_kolumny_wyniku_w_testach ="predykcja";//od jakiej wartości mianownika dzielenia ma się zachowywać inaczej niż powinno (za TinyGp)
    public static Błędnik podsystem_bledow = new Błędnik();

    public static void inicjalizuj() {
    }
}
