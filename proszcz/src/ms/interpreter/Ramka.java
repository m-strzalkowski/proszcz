package ms.interpreter;

import java.io.PrintStream;
import java.util.*;

public class Ramka {
    public Ramka narzędna=null;
    private Map<String,Double> lokalne = new HashMap<>();
    public void ustawZmienną(String nazwa, double wartość)
    {
        lokalne.put(nazwa,wartość);
    }
    public double odczytZmiennej(String nazwa)
    {
        return lokalne.getOrDefault(nazwa, Double.NaN);
    }
    public void pisz(PrintStream s)
    {
        s.println("ramka{");
        SortedSet<String> keys = new TreeSet<>(lokalne.keySet());
        for (String key : keys) {
            s.println(key+":"+odczytZmiennej(key));
        }
        s.println("}");
    }
    /*public void zmienneAlfabetycznieNaKolumny()
    {
        Map<String,Double> kopia = new HashMap<>();
        int i=0;
        SortedSet<String> keys = new TreeSet<>(lokalne.keySet());
        for (String key : keys) {
            String nowyklucz = ""+('A'+((char) i));
            kopia.put(nowyklucz, lokalne.get(key));
            ++i;
        }

        lokalne=kopia;
        System.out.println("=========");
        for(var v:lokalne.keySet())
        {
           System.out.println(v);
        }
        System.out.println("=========");
    }
*/
}
