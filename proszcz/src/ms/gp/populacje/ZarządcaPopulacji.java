package ms.gp.populacje;

import ms.Tablice;
import ms.bledy.SyntaxErrorListener;
import ms.drzewo.Węzeł;
import ms.drzewo.operacje.losowe.IPodawaczDrzew;
import ms.drzewo.operacje.losowe.PodawaczDrzew;
import ms.gp.parser.CzytaczPopulacji;
import ms.gp.parser.populacja.populacjaLexer;
import ms.gp.parser.populacja.populacjaParser;
import ms.interpreter.Silnik;
import ms.parser.proszczLexer;
import ms.parser.proszczParser;
import ms.proces.Proces;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static java.lang.Integer.max;
import static java.lang.Integer.min;
import static ms.Tablice.outputFilePath;
import static ms.drzewo.operacje.losowe.RóżneLosowe.liczba_wezlow;
import static ms.gp.ewolucja.Ewolutor.parsingParametryczny;
import static ms.interpreter.Środowisko.domyślny_podawacz;
import static ms.interpreter.Środowisko.domyślny_podawacz_drzew;

public class ZarządcaPopulacji {
    public Map<String, Węzeł[]> populacje=new HashMap<>();
    public Map<String, double[]> przystosowania=new HashMap<>();

    public void pisz(String nazwa_pop, PrintStream wy, int od_poczatku, int od_konca)
    {
        int i=0,w=0;
        Węzeł[] pop = populacje.get(nazwa_pop);
        double[] wyniki = przystosowania.get(nazwa_pop);
        if(pop==null){wy.println("error:population named '"+nazwa_pop+"' does not exist");return;}
        wy.format("==POPULATION %s==\n",nazwa_pop);
        int k= min(od_poczatku, pop.length);
        int wielkosc,srednia=0,minim=Integer.MAX_VALUE,maxim=Integer.MIN_VALUE;
        String reprezentacja;
        for(;i< pop.length;i++)
        {
            if(pop[i]!=null)
            {
                wielkosc =liczba_wezlow(pop[i]);
                reprezentacja = pop[i].kodPodrzewa();
            }
            else{
                wielkosc = 0;
                reprezentacja = "NULL";
            }
            srednia+=wielkosc;
            minim = min(minim,wielkosc);
            maxim = max(maxim,wielkosc);
            double wynik = wyniki==null?Double.NaN:wyniki[i];
            w++;
            wy.format("%d[%d][@%f]:%s\n",i,wielkosc,wynik,reprezentacja);
            if(i>=od_poczatku)
            {
                if(i<pop.length-od_konca){wy.println("\t...");}
                i=max(i, pop.length-od_konca);
            }
        }
        /*
        if(i<pop.length-od_konca){wy.println("\t...");}
        i=max(i, pop.length-od_konca);
        for(;i< pop.length;i++)
        {
            if(pop[i]!=null)
            {
                wielkosc =liczba_wezlow(pop[i]);
                srednia+=wielkosc;
                min = min(min,wielkosc);
                max = max(max,wielkosc);
                wy.format("%d[%d]:%s\n",i,wielkosc,(pop[i]!=null)?(pop[i].kodPodrzewa()):(pop[i]));
            }
        }*/
        wy.format("== statistics ==\n");
        wy.format("= printed specimens' number of nodes: min:%d average:%d max%d (among %d specimens) =\n",minim, srednia/pop.length,maxim,w);
        wy.format("==%d specimens in population %s==\n",pop.length,nazwa_pop);
    }
    public void pisz(String nazwa_pop,PrintStream wy){pisz(nazwa_pop,wy,5,5);}
    public void zapisz_do_pliku(String nazwa_pop,String sciezka_pliku)
    {
        Węzeł[] pop = populacje.get(nazwa_pop);
        if(pop==null){System.err.println("error:population named '"+nazwa_pop+"' does not exist");return;}
        try {
            var out = new PrintStream(sciezka_pliku);
            String nazwa = sciezka_pliku.replaceAll(".*[/\\ ]","");
            out.println("population "+ nazwa_pop+ ", size: "+pop.length+";");
            for (var tree:pop) {
                out.print(tree.kodPodrzewa());out.print(";\n");
            }
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public void czytaj_z_pliku(String nazwa_pop,String sciezka_pliku)
    {
        System.out.format("czytaj_z_pliku(String %s,String %s)",nazwa_pop, sciezka_pliku);
        ArrayList<Węzeł> pop=new ArrayList<>();
        CharStream input=null;
        try{
            input = CharStreams.fromPath(Paths.get(sciezka_pliku), StandardCharsets.UTF_8);
        } catch (IOException e) {
            System.err.println("Nie udało się otworzyć pliku wejściowego. Kończenie");
            System.exit(1);
        }
        Silnik silnik=null;
        Scanner scanner = null;
        try {
            silnik = new Silnik(new PrintStream(sciezka_pliku+".readlog.txt"));
            scanner = new Scanner(new File(sciezka_pliku));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        if(scanner.hasNextLine())
        {
            scanner.nextLine();
            //System.err.println("1:"+scanner.nextLine());
        }
        int i=0;
        while(scanner.hasNextLine())
        {
            String linia = scanner.nextLine();
            //System.err.print("l:"+linia);
            silnik.wykonaj_tekst("g::="+linia);
            pop.add(((Proces)(silnik.główny.nazwy.get("g"))).drzewo);
            //System.err.print(i);System.err.print("\n");
            //System.out.println(drzewo.toStringTree());
        }
        /*
        SyntaxErrorListener syntaxErrorListener = new SyntaxErrorListener();
        populacjaLexer lexer = new populacjaLexer(input);
        lexer.addErrorListener(syntaxErrorListener);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        populacjaParser parser = new populacjaParser(tokens);
        parser.addErrorListener(syntaxErrorListener);
        ParseTree tree = parser.populacja();
        CzytaczPopulacji czytacz = new CzytaczPopulacji(new Silnik(), domyślny_podawacz);
        Węzeł[] pop= czytacz.czytajPopulację(tree);
         */
        System.out.format("Read %d specimens into %s from %s\n",pop.size(),nazwa_pop,sciezka_pliku);
        populacje.put(nazwa_pop,pop.toArray(new Węzeł[0]));
    }
    public void listuj_populacje(PrintStream wy)
    {
        wy.format("== POPULATIONS ==\n");
        Węzeł[] pop;
        int akum=0,wielkosc,ilosc=0;
        for (String nazwa : populacje.keySet()) {
            pop = populacje.get(nazwa);
            if(pop==null){wielkosc=0;nazwa+="[NULL]";}else{wielkosc=pop.length;}
            akum+=wielkosc;
            wy.format("%c %7d %s\n",' ',wielkosc,nazwa);
            ilosc++;
        }
        wy.format("==%d specimens in %d populations==\n",akum,ilosc);
    }
    public Węzeł[] wczytaj_ze_strumienia(FileInputStream in)
    {
        throw new RuntimeException("not yet implemented");
    }
    public void empty_and_resize(String pop,int size)
    {
        populacje.put(pop,new Węzeł[size]);
    }
    public void inicjalizacja(String typ, String nazwa_populacji, int maks_glebokosc)
    {
        Węzeł[] pop = populacje.get(nazwa_populacji);
        if(pop == null){System.err.println("Population "+nazwa_populacji+" does not exist."); return;}
        System.out.println("initializing pop "+ nazwa_populacji + " by method "+typ);
        switch (typ)
        {
            case "grow": grow(pop,maks_glebokosc);break;
            case "full": full(pop,maks_glebokosc);break;
            case "ramped-and-a-half":
            case "rah":ramped_and_a_half(pop,maks_glebokosc);break;
            default: throw new RuntimeException("Type of initialization: "+typ+" not recognized");
        }
    }
    public void grow(Węzeł[] pop, int maks_glebokosc)
    {
        IPodawaczDrzew pd = domyślny_podawacz_drzew;//na razie
        for(int i=0;i<pop.length;i++)
        {
            pop[i] = pd.grow(maks_glebokosc);
        }
    }
    public void full(Węzeł[] pop,int maks_glebokosc){
        IPodawaczDrzew pd = domyślny_podawacz_drzew;//na razie
        for(int i=0;i<pop.length;i++)
        {
            pop[i] = pd.full(maks_glebokosc);
        }
    }
    public void ramped_and_a_half(Węzeł[] pop, int maks_glebokosc)
    {
        IPodawaczDrzew pd = domyślny_podawacz_drzew;//na razie
        //pół takie, pół takie.
        for(int i=0;i<pop.length;i+=2) {pop[i] = pd.full(maks_glebokosc);}
        for(int i=1;i<pop.length;i+=2) {pop[i] = pd.grow(maks_glebokosc);}
    }
    public static void statystyki_populacji(Węzeł[] populacja){}
}
