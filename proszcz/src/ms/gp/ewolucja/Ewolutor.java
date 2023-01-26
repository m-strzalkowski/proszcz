package ms.gp.ewolucja;

import ms.bledy.SyntaxErrorListener;
import ms.drzewo.Węzeł;
import ms.drzewo.operacje.losowe.IPodawaczDrzew;
import ms.gp.parser.GPInterpreter;
import ms.gp.parser.gen.ProszczGPLexer;
import ms.gp.parser.gen.ProszczGPParser;
import ms.gp.populacje.ZarządcaPopulacji;
import ms.gp.przypadki.ZarządcaPrzypadków;
import ms.gp.przystosowanie.FitnessFunction;
import ms.gp.silniki.ZarządcaSilników;
import ms.interpreter.Silnik;
import ms.proces.Nazwa;
import ms.proces.Proces;
import ms.proces.strumienie.IStrumień;
import ms.proces.strumienie.StrumieńWejściowy;
import ms.proces.strumienie.StrumieńWyjsciowy;
import ms.proces.strumienie.StrumieńZTablicą;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import sun.misc.Signal;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

import static java.lang.System.exit;
import static java.lang.System.out;
import static ms.Tablice.SHARED_STDIN_SCANNER;
import static ms.drzewo.operacje.losowe.RóżneLosowe.liczba_wezlow;
import static ms.interpreter.Środowisko.domyślny_podawacz_drzew;

public class Ewolutor implements EvolutorAdapter{
    PrintStream wy = System.out;
    ArrayList<Historia> generacje = new ArrayList<>();
    public int numer_generacji(){return generacje.size()-1;}
    int numer_generacji_w_iteracji=0;

    double[][] fcases;//dane wejściowe

    int wielkosc_populacji=25000;
    Węzeł[] npop;//nowa populacja
    Węzeł[] spop;//stara populacja
    //ArrayList<Pair<Integer,Double>> wyniki;//indeks w populacji - wartości funkcji przystosowania
    Silnik skg;//silnik genetyczny
    boolean interaktywny=false;
    public ZarządcaPopulacji zpop = new ZarządcaPopulacji();
    public ZarządcaPrzypadków zcas = new ZarządcaPrzypadków();
    public ZarządcaSilników zsil = new ZarządcaSilników();
    public ZarządcaOperatorów zop = new ZarządcaOperatorów();
    FitnessFunction fprzyst;
    public Stack<GPInterpreter> interpretery = new Stack<>();
    public Ewolutor(){
        this.generacje.add(new Historia(0));//zaczynamy w zerowej generacji
        this.zop.buduj_prawdopodobieństwa();
    }
    public Ewolutor(PrintStream wy){
        this();
        this.wy=wy; interpretuj_stdin();
    }
    public static String NAZWA_STARTOWEGO_PLIKU = "genet.txt";
    public String NAZWA_ROBOCZEGO_KATALOGU = "./";
    public Ewolutor(PrintStream wy,String nazwa_katalogu)
    {
        this();
        this.wy=wy;
        NAZWA_ROBOCZEGO_KATALOGU = nazwa_katalogu;
        interpretuj_plik(NAZWA_ROBOCZEGO_KATALOGU,NAZWA_STARTOWEGO_PLIKU,true);
    }
    public Path sciezka_pliku(String nazwa_pliku){return sciezka_pliku(NAZWA_ROBOCZEGO_KATALOGU,nazwa_pliku);}
    private Path sciezka_pliku(String nazwa_katalogu,String nazwa_pliku)
    {
        Path filePath;
        if((filePath= Path.of(nazwa_pliku)).isAbsolute()){wy.println("detected absolute path:"+filePath); return filePath;}
        filePath= Path.of(nazwa_katalogu+nazwa_pliku);
        String sciezka=null;
        try {
            sciezka = filePath.toAbsolutePath().toString();
            return filePath.toAbsolutePath();

        } catch (Exception e) {
            e.printStackTrace(wy);
            wy.println(" NOT FOUND "+ sciezka + ".");
        }
        return filePath;
    }
    public void interpretuj_plik(String nazwa_pliku){interpretuj_plik(NAZWA_ROBOCZEGO_KATALOGU,nazwa_pliku,false);}
    private void interpretuj_plik(String nazwa_katalogu,String nazwa_pliku,boolean potem_stdin)
    {
        Path sciezka = sciezka_pliku(nazwa_katalogu,nazwa_pliku);
        try {
            String skrypt = Files.readString(sciezka);
            wykonaj_tekst(skrypt,false);
            wy.println("SCRIPT "+sciezka+" EXECUTED.");

        } catch (IOException e) {
            e.printStackTrace(wy);
            wy.println(" ERROR READING "+ sciezka + ".");
        }
        if(potem_stdin){wy.println("AWAITING FURTHER COMMANDS FROM STDIN.");interpretuj_stdin();}
    }
    /*
    private void interpretuj_plik(String nazwa_katalogu,String nazwa_pliku,boolean potem_stdin)
    {
        Path filePath = Path.of(nazwa_katalogu+nazwa_pliku);
        String sciezka=null;
        try {
            String skrypt = Files.readString(filePath.toRealPath());
            sciezka = filePath.toRealPath().toString();
            //String skrypt = Files.readString(Path.of("D:\\schowek\\STUDIA\\Programowanie_genetyczne\\proszcz\\przyklady\\ewolucja\\test\\genet.txt"));
            wykonaj_tekst(skrypt);
            wy.println("SCRIPT "+sciezka+" EXECUTED.");

        } catch (IOException e) {
            e.printStackTrace(wy);
            wy.println(NAZWA_STARTOWEGO_PLIKU + " NOT FOUND "+ sciezka + ".");
        }
        if(potem_stdin){wy.println("AWAITING FURTHER COMMANDS FROM STDIN.");interpretuj_stdin();}
    }*/
    public void interpretuj_stdin()
    {
        Scanner scanner = SHARED_STDIN_SCANNER();//new Scanner(System.in);
        while(scanner.hasNextLine())
        {
            String linia = scanner.nextLine();
            wykonaj_tekst(linia,true);
            wy.format("%d:%d>",this.numer_generacji(),interpretery.size());
        }
    }

    public void wykonaj_tekst(String tekst,boolean interaktywny) {
        //ParseTree ptree = parsingProgramu(tekst);
        ParseTree ptree = parsingParametryczny(tekst, ProszczGPLexer.class, ProszczGPParser.class, "plik");
        if(ptree==null){if(!interaktywny){System.err.println("SWITCHING TO INTERACTIVE MODE"); interpretuj_stdin();}return;}//parsowanie sie ne powiodło
        GPInterpreter interpreter = new GPInterpreter(this,wy,interaktywny);
        try {
            interpreter.visit(ptree);
            generacje.get(numer_generacji()).polecenia.add(tekst);//rejestrujemy wykonane polecenia
        }
        catch (RuntimeException ex)
        {
            ex.printStackTrace();
            System.err.println("ERROR OCCURED WHEN INTERPRETING.");
        }
    }
    public static ParseTree parsingParametryczny(String tekstProgramu, Class LexerClass,Class ParserClass, String symbol_startowy)
    {
        //1.Analiza leksykalna
        //ProszczGPLexer lexer = new ProszczGPLexer(CharStreams.fromString(tekstProgramu));
        Constructor<?> cons = null;
        try {
            cons = LexerClass.getConstructor(new Class[]{CharStream.class});
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
            exit(1);
        }
        Lexer lexer = null;
        try {
            lexer = (Lexer) cons.newInstance(CharStreams.fromString(tekstProgramu));
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace(); exit(1);
        }
        if(lexer==null){  System.err.println("lexer==null"); exit(1);}
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        //2.analiza syntaktyczna
        //ProszczGPParser parser = new ProszczGPParser(tokens);
        Constructor<?> consp = null;
        try {
            consp = ParserClass.getConstructor(new Class[]{TokenStream.class});
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        Parser parser = null;
        try {
            parser = (Parser) consp.newInstance(tokens);
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
        if(parser==null){  System.err.println("parser==null"); exit(1);}
        SyntaxErrorListener syntaxErrorListener = new SyntaxErrorListener();
        parser.addErrorListener(syntaxErrorListener);
        //ParseTree tree = parser.program(); // parse; start at prog <label id="code.tour.main.6"/>
        java.lang.reflect.Method method=null;
        try {
            //obj.getClass()
            method = ParserClass.getMethod(symbol_startowy);//, param1.class, param2.class, ..);
        } catch (SecurityException | NoSuchMethodException e) { e.printStackTrace();exit(1); }
        if(method==null){  System.err.println("method==null"); exit(1);}
        ParseTree tree=null;
        try {
            tree = (ParseTree) method.invoke(parser);
            //method.invoke(obj, arg1, arg2,...);
        } catch (IllegalArgumentException | IllegalAccessException | InvocationTargetException e) { e.printStackTrace();exit(1);}
        int nume = syntaxErrorListener.getNumberOfErrors();
        if (nume > 0) {
            System.err.println("THERE "+(nume>1?"WERE":"WAS")+" DETECTED " + nume + " SYNTAX ERROR"+(nume>1?"S":"")+". Analysis will not proceed.\n");
            System.err.println("incomplete tree:");
            System.err.println(tree.toStringTree(parser));
            return null;
        }
        if(tree==null){  System.err.println("tree==null"); exit(1);}
//        System.err.println(syntaxErrorListener.getNumberOfErrors());
//        System.err.println("|"+tekstProgramu+"|");
        //System.out.println("AST:"+tree.toStringTree(parser)); // print tree as text <label id="code.tour.main.7"/>
        return tree;
    }
    void podstawowy_algorytm(int ilosc_generacji, double przyst_stop)
    {
        //1.reprezentacja
        wielkosc_populacji=1000;
        spop = new Węzeł[wielkosc_populacji];
        //inicjalizacja silnika
        skg = new Silnik();
        skg.wykonaj_tekst("use sin,cos;");
        //2.inicjalizacja populacji
        zpop.ramped_and_a_half(spop,10);
        //Petla - aż warunek zakończenia
        double min_przyst = Double.POSITIVE_INFINITY;
        for(numer_generacji_w_iteracji=0; ;numer_generacji_w_iteracji++)
        {
            //3.Selekcja
            //4.Rekombinacja i mutacja
            następna();
            if(numer_generacji_w_iteracji>=ilosc_generacji)
            {
                wy.println("STOPPED, EXCEEDED GENERATION LIMIT:"+ilosc_generacji);
            }
            if(przyst_stop > min_przyst)
            {
                wy.println("STOPPED, BEST SPECIMEN ATTAINED FITNESS LOWER THAN TARGET:"+ilosc_generacji); break;
            }
        }
    }
    public boolean pracuje=false;
    public boolean ma_przestać=false;
    public void następna(int ilosc_generacji)
    {
        /*Thread thread = new Thread(){
            public void run(){
                System.out.println("");
            }
            thread.start();
        };*/
        pracuje=true;
        ma_przestać=false;
        Signal.handle(new Signal("INT"),  // SIGINT
                signal -> {
                    System.out.println("Interrupted by Ctrl+C");
                    if(pracuje){ma_przestać=true;}else{throw new RuntimeException("Interrupted by Ctrl+C");}
                });

        for(numer_generacji_w_iteracji=0; ;numer_generacji_w_iteracji++)
        {
            //3.Selekcja
            //4.Rekombinacja i mutacja
            następna(false);
            if(numer_generacji_w_iteracji>=ilosc_generacji)
            {
                wy.println("STOPPED, EXCEEDED GIVEN GENERATION LIMIT:"+ilosc_generacji); break;
            }
            if(ma_przestać){wy.println("STOPPED AFTER FINISHING GENERATION, PER USER INTERRUPT:"+ilosc_generacji); break;}
        }
        this.fprzyst.set_verbosity(false);
        pracuje = false;
        //thread.interrupt();
    }
    String NAZWA_AKTUALNEJ_POPULACJI = "curr";
    public String NAZWA_PROCEDURY_GENETYCZNEJ = "main";
    public String NAZWA_SILNIKA_EWOLUCJI = "genet";
    int MAKS_DLUGOSC_WYJSCIA = 128;
    public void następna(){następna(true);}
    public void następna(boolean wypisywanie)
    {
        this.fprzyst.set_verbosity(wypisywanie);
        //Obliczenie wyników całej populacji
        Węzeł[] pop = this.zpop.populacje.get(NAZWA_AKTUALNEJ_POPULACJI);
        if(pop==null){System.err.println("no population table.Stopped.");return;}
        double[] wyniki = this.zpop.przystosowania.get(NAZWA_AKTUALNEJ_POPULACJI);
        if(wyniki == null){wyniki = new double[pop.length]; this.zpop.przystosowania.put(NAZWA_AKTUALNEJ_POPULACJI,wyniki);}
        if(this.zcas.cases==null){System.err.println("no cases Stopped.");return;}
        Silnik silnik = this.zsil.silniki.get(NAZWA_SILNIKA_EWOLUCJI);
        if(silnik==null){System.err.println("no env"+NAZWA_SILNIKA_EWOLUCJI+" Stopped.");return;}
        ewaluacja_populacji(silnik,pop,0,pop.length,this.zcas.cases,new double[zcas.cases.length][MAKS_DLUGOSC_WYJSCIA],fprzyst,wyniki);
        //3.Selekcja i Rekombinacja, mutacja
        Węzeł[] nowa_populacja = new Węzeł[pop.length];
        selekcja_i_operatory(pop,nowa_populacja,0,pop.length,wyniki,wypisywanie);
        this.zpop.populacje.put(NAZWA_AKTUALNEJ_POPULACJI,nowa_populacja);
        this.zpop.przystosowania.put(NAZWA_AKTUALNEJ_POPULACJI,wyniki);
        wydobywanie_najlepszych(nowa_populacja,wyniki);
        generacje.add(new Historia(this.numer_generacji()+1));
        System.out.println("PASSING TO GENERATION "+numer_generacji());
    }

    int ROZMIAR_TURNIEJU = 5;
    private void selekcja_i_operatory(Węzeł[] spop, Węzeł[] npop, int npop_start, int npop_end, double[] wyniki,boolean wypisywanie) {
        //dla każdego miejsca w nowej populacji
        IPodawaczDrzew drzewa = domyślny_podawacz_drzew;//na razie
        int lewy,prawy;
        for(int n=npop_start;n<npop.length;n++)
        {
            lewy = selekcja_turniejowa(spop,wyniki,ROZMIAR_TURNIEJU);
            //System.err.print(n);
            switch(this.zop.losuj())
            {
                case CROSS:
                    if(wypisywanie)System.err.print("CROSS ");
                    prawy = selekcja_turniejowa(spop,wyniki,ROZMIAR_TURNIEJU);
                    npop[n] = drzewa.cross_dcpy(spop[lewy],null,spop[prawy],null);//TODO losowanie wewnątrz drzewa punktu
                    break;
                case SIMPLE_MUTATE:
                    if(wypisywanie)System.err.print("MUTATE ");
                    npop[n] = drzewa.mutation_subtree(spop[lewy],5,null);
                    break;
                case TRANSFER:
                    if(wypisywanie)System.err.print("TRANSFER ");
                    npop[n] = drzewa.deepcopy(spop[lewy],0);
            }
        }
    }
    SplittableRandom generator = new SplittableRandom();
    //wbiera NAJMNIEJSZE wyniki
    private int selekcja_turniejowa(Węzeł[] spop, double[] wyniki,int rozmiar_probki) {
        Integer najlepszy = null; int r;
        for(int i=0;i<rozmiar_probki;i++)
        {
            r = generator.nextInt(0,spop.length);
            if(najlepszy == null || wyniki[r] < wyniki[najlepszy] )
            {
                najlepszy = r;
            }
        }
        return najlepszy;
    }

    /**
     * Ewaluacja wyznaczonego kawałka populacji i policzenie jego przystosowania za pomocą dostarczonej funkcji
     * @param silnik Silnik, którego należy uzyć do obliczeń.
     * @param pop tablica drzew - populacja. Ma miec długość tą samą co wyniki
     * @param popstart indeks pierwszego osobnika liczonego
     * @param popstop indeks, osobnika PRZED którym zatrzyma się liczenie
     * @param fitcases dla każdego osobnika tablica wartości wejściowych. Ma miec długość tą samą co byfwy
     * @param bufwy będzie uzuwana dla każdego osobnika jako tablica wartości wyjściowych per przypadek. ma miec wymiary [fitcases.length][MAKS_DLUGOSC_WYJSCIA]
     * @param funkcja_przystosowania obiekt interpretujacy interfejs FitnessFunction gotowy wypluwać wartosci przystosowania
     * @param wyniki tablica na wartości funkcji przystosowania dla każdego osobnika
     */
    void ewaluacja_populacji(Silnik silnik, Węzeł[] pop, int popstart, int popstop,double[][] fitcases, double[][] bufwy, FitnessFunction funkcja_przystosowania, double[] wyniki)
    {
        StrumieńZTablicą we = new StrumieńZTablicą();//
        StrumieńZTablicą wy = new StrumieńZTablicą();//
        Proces proces;
        double wartość_zwracana;
        funkcja_przystosowania.set_fitness_cases(fitcases);//funkcja przystosowania musi znać wejscia - podawane tu i wyjscia - podawane przy compute_fitness_of_outputs_for_cases
        if(!ewaluacja_populacji_sprawdzania(pop,popstart,popstop,fitcases,bufwy,funkcja_przystosowania,wyniki)){throw new RuntimeException("unable to call ewaluacja_populacji");};
        //Dla każdego osobnika w podanym zakresie
        //p - numer osobnika, c - numer przypadku
        int[] czasy = new int[fitcases.length];
        int[] długości_wyjść = new int[fitcases.length];//może to głupie...
        for(int p=popstart;p<popstop;p++)
        {
            //
            proces = wstrzyknij_drzewo(pop[p],silnik,NAZWA_PROCEDURY_GENETYCZNEJ,we,wy);
            StrumieńZTablicą wyjscie_osobnika = (StrumieńZTablicą) proces.daj_deskryptor(1);
            for(int c=0;c<fitcases.length;c++)
            {
                //przestaw strumienie
                przestaw_i_resetuj_strumienie(proces,fitcases[c],bufwy[c]);//czyta z fitcases[c] i pisze do bufwy[c]
                try {
                    wartość_zwracana = silnik.wykonaj(NAZWA_PROCEDURY_GENETYCZNEJ, null);
                }
                catch(RuntimeException ex){}
                czasy[c] = silnik.liczba_wykonanch_wezłów;
                długości_wyjść[c] = wyjscie_osobnika.ile_zapisano();
            }
            //policz wartośc funkcji przystosowania
            wyniki[p] = funkcja_przystosowania.compute_fitness_of_outputs_for_cases(bufwy,długości_wyjść,liczba_wezlow(pop[p]),czasy);
        }
    }



    /**
     * @return Sprawdza, czy można wywołać ewaluacja_populacji z tymi parametrami
     */
    private boolean ewaluacja_populacji_sprawdzania(Węzeł[] pop, int popstart, int popstop, double[][] fitcases, double[/*fitcases.len*/][] bufwy, FitnessFunction funkcja_przystosowania, double[/*pop.length*/] wyniki) {
        if(pop==null){System.err.println("no population table.Stopped.");return false;}
        if(fitcases==null){System.err.println("no fitness cases.Stopped.");return false;}
        if(bufwy==null){System.err.println("no output buffer.Stopped.");return false;}
        if(funkcja_przystosowania==null){System.err.println("no fitness function.Stopped.");return false;}
        if(wyniki==null){System.err.println("no results buffer.Stopped.");return false;}
        for(int i=0; i<fitcases.length;i++) {if(fitcases[i]==null){System.err.println("Case"+i+"is null.Stopped.");return false;}}
        for(int i=0; i<bufwy.length;i++) {if(bufwy[i]==null){System.err.println("Outbuf["+i+"]is null.Stopped.");return false;}}
        if(pop.length!=wyniki.length){System.err.format("Population[%d] and results buffer[%d] have different lengths.",pop.length,wyniki.length);return false;}
        if(fitcases.length!=bufwy.length){System.err.format("fitcases[%d] and output buffer[%d] have different lengths.",fitcases.length,bufwy.length);return false;}
        return true;
    }

    /** Przestawia drzewo i strumienie dla danego silnika.
     * @return
     */
    public Proces wstrzyknij_drzewo(Węzeł drzewo, Silnik silnik, String nazwa_procedury_genetycznej, IStrumień we, IStrumień wy) {
        Nazwa n = (nazwa_procedury_genetycznej==null) ? silnik.główny : silnik.główny.nazwy.get(nazwa_procedury_genetycznej);
        if(!(n instanceof Proces)){System.err.println("Nazwa "+nazwa_procedury_genetycznej+":"+n.kod(silnik,true)); throw new RuntimeException("Name"+nazwa_procedury_genetycznej+"is not a process. Check environment file.");}
        Proces proces = (Proces) n;
        proces.drzewo = drzewo;
        proces.ustaw_deskryptor((IStrumień) we,0);//TODO !!!!
        proces.ustaw_deskryptor((IStrumień) wy,1);
        return proces;
    }
    private boolean przestaw_i_resetuj_strumienie(Proces proces, double[] wejścia, double[] wyjścia) {
        IStrumień wejscie = proces.daj_deskryptor(0);
        IStrumień wyjscie = proces.daj_deskryptor(1);
        if(!(wejscie instanceof StrumieńZTablicą) || !(wyjscie instanceof StrumieńZTablicą)){throw new RuntimeException("wong class of streams:"+wejscie.getClass()+","+wyjscie.getClass());}
        StrumieńZTablicą we = (StrumieńZTablicą) wejscie;
        StrumieńZTablicą wy = (StrumieńZTablicą) wyjscie;
        we.tab = wejścia; we.MAX = wejścia.length; we.resetuj();
        wy.tab = wyjścia; wy.MAX = wyjścia.length; wy.resetuj();
        return true;
    }

    void ewaluuj_populację()//TODO skasować
    {
        if(fcases==null){System.out.println("no fitness cases.Stopped.");return;}
        if(spop==null){System.out.println("no population table.Stopped.");return;}
        for(int fci=0; fci<fcases.length;fci++) {System.out.println("Case"+fci+"empty.Stopped.");return;}
        StrumieńZTablicą we = new StrumieńZTablicą();//
        StrumieńZTablicą wy = new StrumieńZTablicą();//
        skg.główny.ustaw_deskryptor((IStrumień) we,0);//TODO !!!!
        skg.główny.ustaw_deskryptor((IStrumień) wy,1);
        //Dla każdego osobnika
        for(int popi=0; popi<spop.length;popi++)
        {
            skg.główny.drzewo = spop[popi];//podmień drzewo programu głównego w obiekcie silnika.
            //Dla każdego przypadku
            for(int fci=0; fci<fcases.length;fci++)
            {
                we.tab = fcases[fci];//TODO FUNKCJA DO PRZESTAWIANIA
                double wynik = skg.wykonaj(null);//wykonaj główny program.
                //double ocena = fprzyst.compute_fitness(wy.tab);
                //wyniki.add()

            }
        }

    }
    String NAZWA_POPULACJI_NAJLEPSZYCH = "best";
    String NAZWA_NAJLEPSZEGO_OD_POCZATKU = "bestever";
    private void wydobywanie_najlepszych(Węzeł[] pop,double[] fit) {
        int ile=10;
        ArrayList<Węzeł> najlepsze = new ArrayList<>();
        ArrayList<Integer> indeksy = new ArrayList<>();
        ArrayList<Integer> wart = new ArrayList<>();
        //wybierz ile najlepszych osobników z populacji
        double max=Double.NEGATIVE_INFINITY;
        double poprzedni = Double.POSITIVE_INFINITY;
        double srednia = 0.0;
        int wybierany=0;
        for(int i=0;i<ile;i++)
        {
            //Z całej populacji wybierz lepszego od poprzedniego najlepszego
            for(int j=0;j<pop.length;j++)
            {
                if(fit[j]>max && fit[j]<poprzedni){wybierany=j;}
            }
            indeksy.add(wybierany);
            poprzedni = wybierany;
        }
        double acum=0.0; int wyłączone_ze_sredniej=0;
        for(int j=0;j<pop.length;j++) {if(fit[j]<Double.MAX_VALUE){acum+=fit[j];}else{wyłączone_ze_sredniej++;}}
        srednia = acum/(fit.length-wyłączone_ze_sredniej);
        Węzeł[] npop = new Węzeł[indeksy.size()];//najlepsze w tej generacji
        double[] nfit = new double[indeksy.size()];
        for(int i=0;i<npop.length;i++){npop[i] = pop[indeksy.get(i)]; nfit[i] = fit[indeksy.get(i)];}//kopiowanie
        zpop.populacje.put(NAZWA_POPULACJI_NAJLEPSZYCH,npop);
        zpop.przystosowania.put(NAZWA_POPULACJI_NAJLEPSZYCH,nfit);
       // Węzeł[] najlepszy_historycznie_pop= zpop.populacje.get(NAZWA_NAJLEPSZEGO_OD_POCZATKU);
        double[] najlepszy_historycznie_fit= zpop.przystosowania.get(NAZWA_NAJLEPSZEGO_OD_POCZATKU);
        if(najlepszy_historycznie_fit==null|| najlepszy_historycznie_fit[0]>nfit[0]) {
            //mamy lepszego w tej generacji
            wy.format("got better best specimen:%f than prevoius:%f\n",fit[0],najlepszy_historycznie_fit==null?Double.NaN:najlepszy_historycznie_fit[0]);
            Węzeł[] win = new Węzeł[1]; win[0]=npop[0];
            double[] winfit = new double[1]; winfit[0]=fit[0];
            zpop.populacje.put(NAZWA_NAJLEPSZEGO_OD_POCZATKU,win);
            zpop.przystosowania.put(NAZWA_NAJLEPSZEGO_OD_POCZATKU,winfit);
        }
        wy.format("avg %f best:%f best ever:%f\n",srednia,nfit[0],najlepszy_historycznie_fit==null?Double.NaN: najlepszy_historycznie_fit[0]);
        Historia hist = this.generacje.get(this.numer_generacji());
        hist.najgorsze_przystosowanie = Double.NaN;
        hist.najlepsze_przystosowanie = nfit[0];
        hist.średnie_przystosowanie = srednia;
    }

    public void załaduj_funkcję_przystosowania(String nazwa_klasy, String nazwa_pliku) {
        //Dodawanie
        Class fclass=null;
        Constructor<?> cons = null;
        if(nazwa_pliku!=null){throw new RuntimeException("not implemented yet: załaduj_funkcję_przystosowania.nazwa_pliku");}
        try {
            fclass = Class.forName(nazwa_klasy);
            System.out.println("Class = " + fclass.getName());
        }
        catch(ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("Exception: " + e.toString());
        }
        if(fclass==null){throw new RuntimeException("fclass == null");}
        try {
            cons = fclass.getConstructor(new Class[0]);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
            throw new RuntimeException("class doesn't have 0 parameter constructor");
        }
        FitnessFunction func=null;
        try {
            func = (FitnessFunction) cons.newInstance();
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();return;
        }
        //if(func==null){  System.err.println("func==null"); exit(1);}
        this.fprzyst = func;
        this.fprzyst.set_adapter(this);
        wy.println("Successfully loaded fitness function from"+nazwa_klasy);
    }

    public void wydaj_osobnika_jako_program_w_pliku(String populacja, int indeks_w_populacji, String środowisko, String ścieżka) {
        try {

            var out = new PrintStream(sciezka_pliku(ścieżka).toAbsolutePath().toString());
            Węzeł[] pop = this.zpop.populacje.get(populacja);
            Węzeł drzewo = pop[indeks_w_populacji];
            Silnik silnik = this.zsil.silniki.get(środowisko);
            wstrzyknij_drzewo(drzewo,silnik,NAZWA_PROCEDURY_GENETYCZNEJ,new StrumieńWejściowy(SHARED_STDIN_SCANNER()),new StrumieńWyjsciowy(System.out));
            out.print(silnik.zwróćKod());
            out.print("* main;\n\n\n");
            out.close();
        } catch (FileNotFoundException e){e.printStackTrace();}
    }

    public void pisz_historie()
    {
        try {

            var wy = new PrintStream(sciezka_pliku("stats.csv").toAbsolutePath().toString());
            out.format("nr_generacji najgorsza srednia najlepsza\n");
            wy.format("nr_generacji najgorsza srednia najlepsza\n");
            for (var generacja:this.generacje) {
                if(generacja.getNumer()>=numer_generacji()){break;}
                out.format(Locale.ROOT,"%d %f %f %f\n",generacja.getNumer(),generacja.najgorsze_przystosowanie,generacja.średnie_przystosowanie,generacja.najlepsze_przystosowanie);
                wy.format(Locale.ROOT,"%d %f %f %f\n",generacja.getNumer(),generacja.najgorsze_przystosowanie,generacja.średnie_przystosowanie,generacja.najlepsze_przystosowanie);
            }
            wy.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public int GENERATION() {
        return numer_generacji();
    }

    @Override
    public Object getInternalObject() {
        return this;
    }
}
