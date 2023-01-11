package ms.interpreter;

import ms.drzewo.Węzeł;
import ms.drzewo.operacje.losowe.IPodawaczDrzew;
import ms.drzewo.operacje.losowe.IPodawaczWęzłów;
import ms.drzewo.operacje.losowe.LosowaczTablicowyWęzłów;
import ms.drzewo.operacje.losowe.PodawaczDrzew;
import ms.drzewo.wezly.*;
import ms.proces.FunkcjaWbudowana;
import ms.proces.Nazwa;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

import static java.lang.Math.*;

/**
 * W szczególności biblioteka fukncji do importu.
 */
public class Środowisko {
    public static Map<String, Nazwa> biblioteka_nazw;
    public static Map<String,Function<Double, Węzeł>> podst_generatory = new HashMap<String,Function<Double, Węzeł>>();
    public static IPodawaczWęzłów domyślny_podawacz = new LosowaczTablicowyWęzłów();
    public static IPodawaczDrzew domyślny_podawacz_drzew = new PodawaczDrzew(domyślny_podawacz);

    //Generatory de facto stanowiące o gramatyce podjęzyka do programowania genetyczngo
    public static Function<Double, Węzeł> gen_plus = (x)->{return new BinarneArytm('+');};
    public static Function<Double, Węzeł> gen_minus = (x)->{return new BinarneArytm('-');};
    public static Function<Double, Węzeł> gen_razy = (x)->{return new BinarneArytm('*');};
    public static Function<Double, Węzeł> gen_dziel = (x)->{return new BinarneArytm('/');};

    public static Function<Double, Węzeł> gen_dereferencja = (x)->{return new Dereferencja();};
    public static Function<Double, Węzeł> gen_podobny = (x)->{return new Porównanie('~');};
    public static Function<Double, Węzeł> gen_niepodobny = (x)->{return new Porównanie('!');};
    public static Function<Double, Węzeł> gen_mniejszy = (x)->{return new Porównanie('<');};
    public static Function<Double, Węzeł> gen_większy = (x)->{return new Porównanie('>');};

    //public static Function<Double, Węzeł> gen_przewranie_pętli = (x)->{return new PrzerwaniePętli();};
    public static Function<Double, Węzeł> gen_przypisanie = (x)->{return new Przypisanie();};
    public static Function<Double, Węzeł> gen_pętla = (x)->{return new Pętla();};
    public static Function<Double, Węzeł> gen_rozjazd = (x)->{return new Rozjazd();};
    public static Function<Double, Węzeł> gen_stała = Stała::new;//najwyraźniej równoważne z :(x)->{return new Stała(x);};
    public static Function<Double, Węzeł> gen_warunek = (x)->{return new Warunek();};
    public static Function<Double, Węzeł> gen_wąsy = (x)->{return new Wąsy(x);};
    public static Function<Double, Węzeł> gen_znak_minus = (x)->{return new Znak('-');};

    public static Function<Double, Węzeł> gen_arg = (x)->{return new Argument();};
    public static Function<Double, Węzeł> gen_argc = (x)->{return new LiczbaArg();};
    public static Function<Double, Węzeł> gen_read = (x)->{return new Czytaj();};
    public static Function<Double, Węzeł> gen_write = (x)->{return new Pisz();};

    public static Function<Double, Węzeł> generator_generatorów_wywołań_nazwy(String nazwa)
    {
        return (x)->{return new Wywołanie(nazwa);};
    }


    public static int i=init();//muhahaha
    public static int init()
    {
        biblioteka_nazw = new HashMap<String,Nazwa>();
        biblioteka_nazw.put("cos", new FunkcjaWbudowana((t)->{return cos(t[0]);},"Math.cos",1,1));
        biblioteka_nazw.put("sin", new FunkcjaWbudowana((t)->{return sin(t[0]);},"Math.sin",1,1));
        biblioteka_nazw.put("tan", new FunkcjaWbudowana((t)->{return tan(t[0]);},"Math.tan",1,1));
        biblioteka_nazw.put("pi", new FunkcjaWbudowana((t)->{return PI;},"Math.PI",0,0));
        biblioteka_nazw.put("e", new FunkcjaWbudowana((t)->{return E;},"Math.E",0,0));
        biblioteka_nazw.put("eul", new FunkcjaWbudowana((t)->{return E;},"Math.E",0,0));

        biblioteka_nazw.put("read", new FunkcjaWbudowana((t)->{return 0.0;},"read",0,0));
        biblioteka_nazw.put("write", new FunkcjaWbudowana((t)->{return 0.0;},"write/1",1,1));
        biblioteka_nazw.put("exit", new FunkcjaWbudowana((t)->{return 0.0;},"exit",0,0));

        //TU TAK NAPRAWDĘ OKREŚLA SIĘ NAZWY GRAMATYKI WIDOCZNE NA ZEWNĄTRZ:
        podst_generatory.put("plus",gen_plus);
        podst_generatory.put("minus",gen_minus);
        podst_generatory.put("mul",gen_razy);
        podst_generatory.put("div",gen_dziel);
        podst_generatory.put("deref",gen_dereferencja);
        podst_generatory.put("similar",gen_podobny);
        podst_generatory.put("dissimilar",gen_niepodobny);
        podst_generatory.put("lesser",gen_mniejszy);
        podst_generatory.put("greater",gen_większy);
        podst_generatory.put("assign",gen_przypisanie);
        podst_generatory.put("while",gen_pętla);
        podst_generatory.put("or",gen_rozjazd);
        podst_generatory.put("ifelse",gen_warunek);
        podst_generatory.put("block",gen_wąsy);
        podst_generatory.put("minus_sign",gen_znak_minus);
        podst_generatory.put("const",gen_stała);
        podst_generatory.put("arg",gen_arg);
        podst_generatory.put("argc",gen_argc);
        podst_generatory.put("read",gen_read);
        podst_generatory.put("write",gen_write);

        for (String name:podst_generatory.keySet()) {
            var w = podst_generatory.get(name).apply(0.0);
            //domyślny_podawacz.rejestruj(podst_generatory.get(name),name,w.waga_domyślna(), w.dziecimin(), w.dziecimax());
            domyślny_podawacz.rejestruj(podst_generatory.get(name),name);
            domyślny_podawacz.mutuj(name,w.waga_domyślna(), (double)w.dziecimin(),(double)w.dziecimax(),(double)w.dziecimin(),(double)w.dziecimax(),null);
        }
        //zmiana wagi dla wąsów:
        var w = gen_wąsy.apply(0.0);
        //domyślny_podawacz.rejestruj(podst_generatory.get("block"),"block",w.waga_domyślna(), 2, 4);
        domyślny_podawacz.mutuj("block",w.waga_domyślna(),2.0,4.0,2.0,4.0,null);
        domyślny_podawacz.mutuj("argc",0.0,0.0,0.0,0.0,0.0,null);
        domyślny_podawacz.mutuj("arg",0.0,1.0,1.0,1.0,1.0,null);
        domyślny_podawacz.mutuj("read",0.0,0.0,0.0,0.0,0.0,null);
        domyślny_podawacz.mutuj("write",0.0,1.0,1.0,1.0,1.0,null);
        domyślny_podawacz.zakres_dla_generatora("const",-100,100,1);
        domyślny_podawacz.zakres_dla_generatora("block",2,4,null);
        domyślny_podawacz.przelicz();
        System.out.println("init");
        //System.err.println(domyślny_podawacz.toString());

        return 0;
    }
}
