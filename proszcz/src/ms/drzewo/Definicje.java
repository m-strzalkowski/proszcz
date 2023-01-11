package ms.drzewo;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Queue;
import java.util.Stack;
import java.util.function.Function;

/**
 * Tu gnieżdżą się definicje niektórych elementów semantycznych języka.
 */
public class Definicje {
    //KLĘKAJCIE FILOZOFOWIE, OTO DEFINICJA PRAWDY!
    public static boolean PRAWDA(double x) {return Double.doubleToRawLongBits(x) >=0;}//wszystko, co ma plus(bit znaku:0) - z +inf włącznie i NaN, bez -0.0

    public static String ZAWIJAS_LEWY = "(/";
    public static String ZAWIJAS_PRAWY = "\\)";
    public static String NAWIAS_ANONIM_LEWY = "(#";
    public static String NAWIAS_ANONIM_PRAWY = "#)";
    public static String NAWIAS_STOSU_LEWY = "($";
    public static String NAWIAS_STOSU_PRAWY = "$)";

    public static String PRZYPISANIE_DLUGIE = "::=";

    public static String NAZWA_MAIN = "MAIN";
    public static String NAZWA_LIMITU_PAMIECI = "MEMLIMIT";
    public static String NAZWA_ARGMIN = "ARGMIN";
    public static String NAZWA_ARGMAX = "ARGMAX";
    public static int DOMYSLNY_LIMIT_PAMIECI = 64;
    public static int DOMYSLNY_ARGMIN = 0;
    public static int DOMYSLNY_ARGMAX = 0;

    public static int NUMER_DESKRYPTORA_STANDARDOWEGO_WEJŚCIA = 0;
    public static int NUMER_DESKRYPTORA_STANDARDOWEGO_WYJŚCIA = 1;

    public static final String NAZWA_INSTR_CZYTAJ = "read";
    public static final String NAZWA_INSTR_PISZ = "write";
    public static final String NAZWA_INSTR_ARGUMENT = "arg";
    public static final String NAZWA_INSTR_LICZBA_ARG = "argc";


    public static int adresacja_cykliczna(double indeks, int zawijanie){
        return  ((int)Math.abs(indeks))%(zawijanie);
    }

    public static void DFS(Węzeł korzeń, Function<Węzeł,Węzeł> przekształcenie, boolean po)
    {
        int i=0;
        Stack<Węzeł> stos = new Stack<Węzeł>();
        stos.push(korzeń);
        while(!stos.empty())
        {
            Węzeł w = stos.pop();
            if(!po){przekształcenie.apply(w);}
            if(w.dzieci!=null)
            {
                for(i=w.dzieci.length-1;i>=0;i--)
                {
                    stos.push(w.dzieci[i]);
                }
            }
            if(po){przekształcenie.apply(w);}
        }
    }
    public static void BFS(Węzeł korzeń, Function<Węzeł,Węzeł> przekształcenie, boolean po)
    {
        Queue<Węzeł> kolejka = new ArrayDeque<Węzeł>();
        kolejka.add(korzeń);
        while(!kolejka.isEmpty())
        {
            Węzeł w = kolejka.poll();
            if(!po){przekształcenie.apply(w);}
            if(w.dzieci!=null){
                Collections.addAll(kolejka, w.dzieci);
            }
            if(po){przekształcenie.apply(w);}
        }
    }
}
