package ms.gp.silniki;

import ms.Proszcz;
import ms.drzewo.Węzeł;
import ms.drzewo.operacje.losowe.IPodawaczDrzew;
import ms.interpreter.Silnik;
import ms.proces.Proces;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static java.lang.Integer.max;
import static java.lang.Integer.min;
import static ms.drzewo.operacje.losowe.RóżneLosowe.liczba_wezlow;
import static ms.interpreter.Środowisko.domyślny_podawacz_drzew;

public class ZarządcaSilników {
    public Map<String, Silnik> silniki =new HashMap<>();
    public Map<String, double[]> przystosowania=new HashMap<>();

    public Silnik inicjuj_pusty(String nazwa_silnika)
    {
        Silnik s = new Silnik();
        s.wykonaj_tekst("0;");
        silniki.put(nazwa_silnika,s);
        return s;
    }
    public void inspekcja(String nazwa_silnika, PrintStream wy) {
        Silnik s = silniki.get(nazwa_silnika);
        if(s==null){wy.println("Initalizing new empty environment "+nazwa_silnika); s=inicjuj_pusty(nazwa_silnika);}
        Proszcz.interpretacja_interaktywna_do_n_pustych_linii(s,System.in, System.out,1024);
    }
    public void głęboka_kopia(String nazwa_oryginału, String nazwa_kopii)
    {
        Silnik oryginał = silniki.get(nazwa_oryginału);
        if(oryginał==null){System.err.println("error:environment named '"+nazwa_oryginału+"' does not exist");return;}
        Silnik kopia = inicjuj_pusty(nazwa_kopii);
        kopia.wykonaj_tekst(oryginał.główny.kod(oryginał,true));
    }
    public void zapisz_do_pliku(String nazwa_silnika,String sciezka_pliku)
    {
        Silnik env = silniki.get(nazwa_silnika);
        if(env==null){System.err.println("error:environment named '"+nazwa_silnika+"' does not exist");return;}
        try {
            var out = new PrintStream(sciezka_pliku);
            String nazwa = sciezka_pliku.replaceAll(".*[/\\ ]","");
            out.println("/*saved environment "+ nazwa_silnika+ " by ProszczGP (conforming to grammar proszcz.g4)*/");
            out.println("/*brief (non recursive) definition: "+ env.główny.kod(env,false)+ " */");
            out.println(env.główny.kod(env,true));
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public void czytaj_z_pliku(String nazwa_silnika,String sciezka_pliku)
    {
        Silnik env = silniki.get(nazwa_silnika);
        if(env==null){env=inicjuj_pusty(nazwa_silnika);}
        //wczytaj plik
        String kod; try {kod = Files.readString(Path.of(sciezka_pliku));} catch (IOException e) {e.printStackTrace();return;}
        env.wykonaj_tekst(kod);
    }
    public void listuj_silniki(PrintStream wy)
    {
        wy.format("== ENVIRONMENTS ==\n");
        Silnik s;
        int akum=0,wielkosc,ilosc=0;
        for (String nazwa : silniki.keySet()) {
            s = silniki.get(nazwa);
            if(s==null){wielkosc=0;nazwa+="[NULL]";}else{wielkosc=s.główny.kod(s,true).length();}
            akum+=wielkosc;
            wy.format("%c %7d %s %s\n",' ',wielkosc,nazwa,s!=null?s.główny.kod(s,false):"null");
            ilosc++;
        }
        wy.format("==%d environments==\n",ilosc);
    }
    public Węzeł[] wczytaj_ze_strumienia(FileInputStream in)
    {
        throw new RuntimeException("not yet implemented");
    }

}
