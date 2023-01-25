package ms;

import ms.bledy.Błędnik;

import java.util.Scanner;

public class Tablice {

    public static String inputFilePath;
    public static String outputFilePath;

    public static String testInputFilePath;
    public static String testOutputFilePath;
    public static boolean interaktywny=false;
    public static boolean upraszczanie=false;
    public static boolean pokazywanie=false;
    public  static boolean dziwnedzielenie=false;

    private static Scanner _sh_stdin=null;
    public static Scanner SHARED_STDIN_SCANNER(){if(_sh_stdin==null){_sh_stdin=new Scanner(System.in);}return _sh_stdin;};

    public static double PRÓG_DZIWNODZIELENIA =0.001;//od jakiej wartości mianownika dzielenia ma się zachowywać inaczej niż powinno (za TinyGp)
    public static String nazwa_kolumny_wyniku_w_testach ="predykcja";//od jakiej wartości mianownika dzielenia ma się zachowywać inaczej niż powinno (za TinyGp)
    public static Błędnik podsystem_bledow = new Błędnik();

    public static void inicjalizuj() {
    }
}
