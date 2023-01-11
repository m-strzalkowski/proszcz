package ms.drzewo.operacje;

import ms.Tablice;
import ms.bledy.SemanticOccurence;
import ms.bledy.ZdarzenieWykonania;
import ms.drzewo.Węzeł;
import ms.drzewo.operacje.losowe.IPodawaczWęzłów;
import ms.drzewo.wezly.*;
import ms.interpreter.Silnik;
import ms.parser.proszczBaseVisitor;
import ms.parser.proszczParser;
import ms.proces.Nazwa;
import ms.proces.Proces;
import ms.proces.Zmienna;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Stack;

import static ms.drzewo.Definicje.*;

public class KonstruktorProgramów extends proszczBaseVisitor<Węzeł> {

    Silnik silnik = null;
    Proces cel = null;
    Stack<Proces> procesy = new Stack<Proces>();
    WykonywaczDodatków dodatki = null;
    IPodawaczWęzłów podawacz=null;
    public KonstruktorProgramów(Silnik silnik, IPodawaczWęzłów podawacz)
    {
        this.silnik = silnik;
        procesy.push(silnik.główny);
        this.podawacz=podawacz;
    }

    @Override
    public Węzeł visitProgram(proszczParser.ProgramContext ctx) {
        for (var instr:ctx.instrukcja()) {
            visit(instr);
        }
        return null;//symbole gramatyczne powyżej wyrażenia nie tworzą drzewa składniowego, więc nie zwracają węzłów;
    }

    @Override
    public Węzeł visitInstrukcja_silnika(proszczParser.Instrukcja_silnikaContext ctx) {
        if(ctx.reset_silnika()!=null)
        {
            silnik.resetuj();
        }
        if(ctx.uruchomienie()!=null)
        {
            silnik.uruchom(ctx.uruchomienie().NAZWA().getText());
        }
        if(ctx.logi()!=null)
        {
            silnik.trace = !silnik.trace;
            silnik.out.println("trace:"+silnik.trace);
            return null;
        }
        if(ctx.wypisanie()!=null)
        {
            if(ctx.wypisanie().wypisanie_krotkie()!=null)
            {
                var k = ctx.wypisanie().wypisanie_krotkie();
                silnik.listuj_krótko(k.NAZWA()==null?null:k.NAZWA().getText());

            }
            if(ctx.wypisanie().wypisanie_rekursywne()!=null)
            {
                var k = ctx.wypisanie().wypisanie_rekursywne();
                silnik.listuj(k.NAZWA()==null?null:k.NAZWA().getText());
            }
        }
        if(ctx.pokaz_drzewo()!=null)
        {
            silnik.out.println("SHOW");
            var k = ctx.pokaz_drzewo();
            Proces p=null;
            for (var n_term:k.NAZWA()) {
                String tekst_nazwy = n_term.getText();
                Nazwa n = silnik.główny.nazwy.get(tekst_nazwy);
                if(n==null)
                {
                    Tablice.podsystem_bledow.zglosZdarzenie(new SemanticOccurence(SemanticOccurence.Level.ERROR,ctx.start,ctx.start.getLine(),ctx.start.getCharPositionInLine(),
                            "In this namespace there is no name "+tekst_nazwy));
                }
                if(n instanceof Proces){
                    p= (Proces) n;
                    EksportDrzewa.graphviz(p,tekst_nazwy,k.rek!=null);
                }
                else {
                    Tablice.podsystem_bledow.zglosZdarzenie(new SemanticOccurence(SemanticOccurence.Level.ERROR,ctx.start,ctx.start.getLine(),ctx.start.getCharPositionInLine(),
                            "Name "+tekst_nazwy+" is not a process."));
                }

            }
            if(k.NAZWA() == null || k.NAZWA().size()<1){
                EksportDrzewa.graphviz(silnik.główny,"ENGINE CONTENTS",k.rek!=null);
            }

        }
        return null;
    }

    @Override
    public Węzeł visitInstrukcja_procesowa(proszczParser.Instrukcja_procesowaContext ctx) {
        for (var d:ctx.children) {
            visit(d);
        }
        return null;
    }

    @Override
    public Węzeł visitImport_procesu(proszczParser.Import_procesuContext ctx) {
        if(ctx.NAZWA()!=null)
        {
            var p = procesy.peek();
            for(var n: ctx.NAZWA())
            {
                if(Objects.equals(n.getText(), "SUPER"))
                {
                    if(procesy.size()<2){throw new ZdarzenieWykonania(SemanticOccurence.Level.FATAL,n,n.getSymbol().getLine(),n.getSymbol().getCharPositionInLine(),
                            "There is no parent process, so cannot import SUPER - use parent's namespace.");
                    }
                    Proces rodzic = procesy.elementAt(procesy.size()-2);
                    p.nazwy = rodzic.nazwy;
                }
                silnik.import_(p, n.getText(),silnik);
            }
        }
        return null;
    }

    @Override
    public Węzeł visitDeport_procesu(proszczParser.Deport_procesuContext ctx) {
        if(ctx.NAZWA()!=null)
        {
            var p = procesy.peek();
            for(var n: ctx.NAZWA())
            {
                if(Objects.equals(n.getText(), "SUPER")) {
                    if (procesy.size() < 2) {
                        throw new ZdarzenieWykonania(SemanticOccurence.Level.FATAL, n, n.getSymbol().getLine(), n.getSymbol().getCharPositionInLine(),
                                "Cannot deport SUPER because process namespace reference may already be set to parent's namespace.");
                    }
                }
                silnik.deport(p, n.getText());
            }
        }
        return null;
    }

    @Override
    public Węzeł visitDeklaracja_procesu(proszczParser.Deklaracja_procesuContext ctx) {
        //Dla każdej podanej nazwy skonstruuj proces z tekstu
        var nazwy = new ArrayList<String>();
        boolean wykonanie=false;
        Węzeł drzewo=null;Zmienna drzewo_zredukowane=null;
        if(ctx.wyrazenie()!=null)
        {
            //sparsuj wyrażenie
            drzewo = visit(ctx.wyrazenie());
            //System.err.println("drzewo:"+drzewo);
            //Spróbuj policzyć od razu wartość drzewa.
            drzewo_zredukowane = Zmienna.spróbuj_statycznie_zredukować(drzewo);
        }
        //Pozbieraj nazwy przed ::= lub ::+=
        if(ctx.desygnat_celu()!=null&& ctx.desygnat_celu().NAZWA() != null)
        {
            for (var n:ctx.desygnat_celu().NAZWA()) {
                nazwy.add(n.getText());
            }
        }
        if(nazwy.size()<1){
            wykonanie=true;
            //nazwy.add(NAZWA_MAIN);
            nazwy.add(null);//null oznacza główny proces
        }
        //dla każdej nazwy przed ::=
        for (var nazwa_odwołania:nazwy)
        {
            //System.err.println("NAZWA_ODWOLANIA:"+nazwa_odwołania);
            boolean akumulacja=false;//Przy ::= tworzymy nowy proces, przy ::+= dodajemy do niego
            if(nazwa_odwołania==null){akumulacja=true;}//bez nazwy - dla głównego zawsze akumulacja
            //Jeśli udało się policzyć i nie jest to główny proces
            if(drzewo_zredukowane!=null && nazwa_odwołania !=null)
            {
                //każda nazwa przy przypisaniu typu a,b,c::=0; dostaje swoja zmienną
                //System.err.println("Zmienna.");
                procesy.peek().nazwy.put(nazwa_odwołania,new Zmienna(drzewo_zredukowane.policz()));
                continue;
            }
            Proces p=null;
            if(!akumulacja)
            {
                p = new Proces(drzewo);//Uzywamy tego samego drzewa do róznych nazw , czyli a,b,c::=2+read; będa miec to samo drzewo, choć odrebne kopie przestrrzeni nazw.
            }
            else{
                if(nazwa_odwołania==null){p= silnik.główny;}
                else{Nazwa n = procesy.peek().szukaj_nazwy(nazwa_odwołania);
                    if(n instanceof Zmienna){
                        silnik.out.println(nazwa_odwołania+":var->proc");
                        p = new Proces(new Stała(n.policz(silnik)));
                    }
                }
                //jeśli konieczne, wymiana drzewa
                if(drzewo!=null){p.drzewo=drzewo;}
            }


            //jako, że zajmujemy sie jakimś procesem, wkładamy go na stos.
            procesy.push(p);
                //instrukcje procesowe
                if(!akumulacja)//jeśli proces jest nowy, potrzebuje wartości domyślnych
                {
                    p.nazwy.put(NAZWA_LIMITU_PAMIECI, new Zmienna(DOMYSLNY_LIMIT_PAMIECI));
                    p.nazwy.put(NAZWA_ARGMIN, new Zmienna(DOMYSLNY_ARGMIN));
                    p.nazwy.put(NAZWA_ARGMAX, new Zmienna(DOMYSLNY_ARGMAX));
                }
                //Przetwarzanie bloku procesowego
                if(ctx.blok_procesowy()!=null)
                {
                    if(ctx.blok_procesowy().naglowek_bloku_procesowego()!=null)
                    {
                        var n = ctx.blok_procesowy().naglowek_bloku_procesowego();
                        if(n.arnosc()!=null)
                        {
                            var a = n.arnosc();
                            p.nazwy.put(NAZWA_ARGMIN, new Zmienna(Double.parseDouble(a.STALA(0).getText())));
                            p.nazwy.put(NAZWA_ARGMAX, new Zmienna(Double.parseDouble(a.STALA(1).getText())));
                        }
                        if(n.zawijanie_pamieci()!=null)
                        {
                            var z = n.zawijanie_pamieci();
                            p.nazwy.put(NAZWA_LIMITU_PAMIECI, new Zmienna(Double.parseDouble(z.STALA().getText())));
                        }
                        if(ctx.blok_procesowy().instrukcja_procesowa()!=null)
                        {
                            for(var ipr:ctx.blok_procesowy().instrukcja_procesowa())
                            {
                                visit(ipr);
                            }
                        }
                    }
                    //konstrukcja a~b,%c; - krótki zapis liczby parametrów,rozmiaru pamięci równoważny ARGMIN::=a;ARGMAX::=b; MEMLIMIT::=c;

                }

                //ustawia odpowiednie cherakterystyki procesu, w szczególnosci p.pam o wielkości w MEMLIMIT
                //potrzebne osobno, bo podproces moze zostać zdefiniwany, ale jeszcze nie wykonany
                p.inicjuj(silnik);

                //zapis segmentu anonimowego
                var z =ctx.zapis_segmentu_anonimowego();
                if(z!=null && z.STALA()!=null)
                {
                    if(z.STALA().size() > p.pam.length)
                    {
                        Tablice.podsystem_bledow.zglosZdarzenie(new SemanticOccurence(SemanticOccurence.Level.ERROR, z.getStart(),
                                "ANONYMOUS SEGMENT DEFINITION HAS "+z.STALA().size()+ "ELEMENTS WHEREAS MEMLIMIT IS ONLY"+p.pam.length));
                    }

                    int i=0;
                    for(var num:z.STALA())
                    {
                        p.pam[i++] = Double.parseDouble(num.getText());
                    }
                }
            procesy.pop();
                //System.err.println("drz2"+p.drzewo.kodPodrzewa());
            DFS(p.drzewo, (w)->{w.kontrola();return w;},false);

            if(nazwa_odwołania!=null)
            {
                //dowiąż proces do nazwy w procesie nadrzędnym
                procesy.peek().nazwy.put(nazwa_odwołania,p);
            }
            //else{silnik.główny = p;} nie trzeba


            //wypisz i wykonaj, jeśli
            if(wykonanie)
            {
                silnik.out.println(p.kod(silnik,true));
                //if(pokazywanie){EksportDrzewa.graphviz(p,true);}
                //silnik.załaduj_argumenty(p);
                silnik.załaduj(nazwa_odwołania,p);
                double wynik = silnik.uruchom(nazwa_odwołania,null);
                if(silnik.trace)silnik.out.println("="+wynik);
            }
        }

        return null;
    }

//WYRAŻENIA

    @Override
    public Węzeł visitWyrazenieZnak(proszczParser.WyrazenieZnakContext ctx) {
        Węzeł w = new Znak(ctx.znak.getText().charAt(0));
        w.dzieci = new Węzeł[1];
        w.dzieci[0] = visit(ctx.wyrazenie());
        w.start = ctx.start; w.stop = ctx.stop;
        return w;
    }

    @Override
    public Węzeł visitWyrazenieMult(proszczParser.WyrazenieMultContext ctx) {
        Węzeł w = new BinarneArytm(ctx.mult.getText().charAt(0));
        w.dzieci = new Węzeł[2];
        w.dzieci[0] = visit(ctx.wyrazenie(0));
        w.dzieci[1] = visit(ctx.wyrazenie(1));
        w.start = ctx.start; w.stop = ctx.stop;
        return w;
    }

    @Override
    public Węzeł visitWyrazenieAddyt(proszczParser.WyrazenieAddytContext ctx) {
        Węzeł w = new BinarneArytm(ctx.addyt.getText().charAt(0));
        w.dzieci = new Węzeł[2];
        w.dzieci[0] = visit(ctx.wyrazenie(0));
        w.dzieci[1] = visit(ctx.wyrazenie(1));
        w.start = ctx.start; w.stop = ctx.stop;
        return w;
    }

    @Override
    public Węzeł visitWyrazenieLubLgicz(proszczParser.WyrazenieLubLgiczContext ctx) {
        Węzeł w = new Rozjazd();
        w.dzieci = new Węzeł[2];
        w.dzieci[0] = visit(ctx.wyrazenie(0));
        w.dzieci[1] = visit(ctx.wyrazenie(1));
        w.start = ctx.start; w.stop = ctx.stop;
        return w;
    }
    @Override
    public Węzeł visitWyrazenieILgicz(proszczParser.WyrazenieILgiczContext ctx) {
        Węzeł w = new Minimum();
        w.dzieci = new Węzeł[2];
        w.dzieci[0] = visit(ctx.wyrazenie(0));
        w.dzieci[1] = visit(ctx.wyrazenie(1));
        w.start = ctx.start; w.stop = ctx.stop;
        return w;
    }

    @Override
    public Węzeł visitWyrazeniePorownanie(proszczParser.WyrazeniePorownanieContext ctx) {
        Węzeł w = new Porównanie(Porównanie.znak_z_typuOp(ctx.porownanie.getText()));
        w.dzieci = new Węzeł[2];
        w.dzieci[0] = visit(ctx.wyrazenie(0));
        w.dzieci[1] = visit(ctx.wyrazenie(1));
        w.start = ctx.start; w.stop = ctx.stop;
        return w;
    }

    @Override
    public Węzeł visitWyrazenieAdresZmiennej(proszczParser.WyrazenieAdresZmiennejContext ctx) {
        return new Adres(ctx.NAZWA().getText());
    }

    @Override
    public Węzeł visitWyrazeniePrzypisanie(proszczParser.WyrazeniePrzypisanieContext ctx) {
        Węzeł w = new Przypisanie();
        w.dzieci = new Węzeł[2];
        w.dzieci[0] = visit(ctx.wyrazenie(0));
//        System.err.println("LEWE PRZYPISANIE:"+w.dzieci[0]);
        w.dzieci[1] = visit(ctx.wyrazenie(1));
        w.start = ctx.start; w.stop = ctx.stop;
        return w;
    }

    @Override
    public Węzeł visitWyrazenieStala(proszczParser.WyrazenieStalaContext ctx) {
        return new Stała(Double.parseDouble(ctx.STALA().getText()));
    }

    @Override
    public Węzeł visitWyrazenieWywolanie(proszczParser.WyrazenieWywolanieContext ctx) {
        String nazwa=ctx.NAZWA().getText();
        Węzeł w = switch (nazwa) {
            case NAZWA_INSTR_CZYTAJ -> new Czytaj();
            case NAZWA_INSTR_PISZ -> new Pisz();
            case NAZWA_INSTR_ARGUMENT -> new Argument();
            case NAZWA_INSTR_LICZBA_ARG -> new LiczbaArg();
            default -> new Wywołanie(nazwa);
        };


        if(ctx.lista_wyrazen()==null){return w;}
        w.dzieci = new Węzeł[ctx.lista_wyrazen().wyrazenie().size()];
        //if(ctx.lista_wyrazen().wyrazenie().size()<1)
        int i=0;
        for (var dz:ctx.lista_wyrazen().wyrazenie()) {
            w.dzieci[i++] = visit(dz);
        }
        w.start = ctx.start; w.stop = ctx.stop;
        return w;
    }

    @Override
    public Węzeł visitWyrazenieDereferencja(proszczParser.WyrazenieDereferencjaContext ctx) {
        Węzeł w = new Dereferencja();
        w.dzieci = new Węzeł[1];
        w.dzieci[0] = visit(ctx.wyrazenie());
        w.start = ctx.start; w.stop = ctx.stop;
        return w;
    }

    @Override
    public Węzeł visitWyrazenieNawiasy(proszczParser.WyrazenieNawiasyContext ctx) {
        return visit(ctx.wyrazenie());//jak widac drzewo parsingu rózni sie od drzewa składniowego
    }

    @Override
    public Węzeł visitWyrazenieInstrukcjaZlozona(proszczParser.WyrazenieInstrukcjaZlozonaContext ctx) {
        Wąsy w = new Wąsy();
        if(ctx.nastepstwo_wyrazen()==null){return w;}
        w.dzieci = new Węzeł[ctx.nastepstwo_wyrazen().wyrazenie().size()];
        int i=0;
        for (var dz:ctx.nastepstwo_wyrazen().wyrazenie()) {
            w.dzieci[i++] = visit(dz);
        }
        w.start = ctx.start; w.stop = ctx.stop;
        return w;
    }

    @Override
    public Węzeł visitWyrazenieInstrukcjaWarunkowa(proszczParser.WyrazenieInstrukcjaWarunkowaContext ctx) {
        Węzeł w = new Warunek();
        w.dzieci = new Węzeł[3];
        w.dzieci[0] = visit(ctx.wyrazenie(0));
        w.dzieci[1] = visit(ctx.wyrazenie(1));
        w.dzieci[2] = visit(ctx.wyrazenie(2));
        w.start = ctx.start; w.stop = ctx.stop;
        return w;
    }

    @Override
    public Węzeł visitWyrazeniePetelka(proszczParser.WyrazeniePetelkaContext ctx) {
        Węzeł w = new Pętla();
        w.dzieci = new Węzeł[2];
        w.dzieci[0] = visit(ctx.wyrazenie(0));
        w.dzieci[1] = visit(ctx.wyrazenie(1));
        w.start = ctx.start; w.stop = ctx.stop;
        return w;
    }

    @Override
    public Węzeł visitWyrazeniePrzerwaniePetelki(proszczParser.WyrazeniePrzerwaniePetelkiContext ctx) {
        Węzeł w = new PrzerwaniePętli();
        w.dzieci = new Węzeł[1];
        w.dzieci[0] = visit(ctx.wyrazenie());
        w.start = ctx.start; w.stop = ctx.stop;
        return w;
    }

    @Override
    public Węzeł visitLogi(proszczParser.LogiContext ctx) {
        silnik.trace = !silnik.trace;
        silnik.out.println("trace:"+silnik.trace);
        return null;
    }

    @Override
    public Węzeł visitDodatek(proszczParser.DodatekContext ctx) {
        if(dodatki==null){
            dodatki = new WykonywaczDodatków(silnik,podawacz);
        }
        //przekazanie sterowania
        dodatki.visitDodatek(ctx);
        return null;
    }
}
