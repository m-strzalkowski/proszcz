package ms.gp.ewolucja;

import ms.bledy.SyntaxErrorListener;
import ms.drzewo.Węzeł;
import ms.gp.parser.GPInterpreter;
import ms.gp.parser.gen.ProszczGPLexer;
import ms.gp.parser.gen.ProszczGPParser;
import ms.gp.populacje.ZarządcaPopulacji;
import ms.gp.przypadki.ZarządcaPrzypadków;
import ms.gp.przystosowanie.FitnessFunction;
import ms.interpreter.Silnik;
import ms.parser.proszczLexer;
import ms.proces.strumienie.IStrumień;
import ms.proces.strumienie.StrumieńZTablicą;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.Pair;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.io.PrintStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

import static java.lang.System.exit;

public class Ewolutor {
    PrintStream wy = System.out;
    ArrayList<Historia> generacje = new ArrayList<>();
    int numer_generacji_w_iteracji=0;

    double[][] fcases;//dane wejściowe

    int wielkosc_populacji=25000;
    Węzeł[] npop;//nowa populacja
    Węzeł[] spop;//stara populacja
    ArrayList<Pair<Integer,Double>> wyniki;//indeks w populacji - wartości funkcji przystosowania
    Silnik skg;//silnik genetyczny
    boolean interaktywny=false;
    public ZarządcaPopulacji zpop = new ZarządcaPopulacji();
    public ZarządcaPrzypadków zcas = new ZarządcaPrzypadków();
    FitnessFunction fprzyst;
    public Stack<GPInterpreter> interpretery = new Stack<>();
    public Ewolutor(){
        this.generacje.add(new Historia());//zaczynamy w pierwszej generacji
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
        Path filePath = Path.of(nazwa_katalogu+nazwa_pliku);
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
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextLine())
        {
            String linia = scanner.nextLine();
            wykonaj_tekst(linia,true);
            wy.format("%d:%d>",this.generacje.size(),interpretery.size());
        }
    }

    public void wykonaj_tekst(String tekst,boolean interaktywny) {
        boolean i=false;
        //ParseTree ptree = parsingProgramu(tekst);
        ParseTree ptree = parsingParametryczny(tekst, ProszczGPLexer.class, ProszczGPParser.class, "plik");
        if(ptree==null){if(!interaktywny){System.err.println("SWITCHING TO INTERACTIVE MODE"); interpretuj_stdin();}return;}//parsowanie sie ne powiodło
        GPInterpreter interpreter = new GPInterpreter(this,wy,interaktywny);
        try {
            interpreter.visit(ptree);
            generacje.get(generacje.size()-1).polecenia.add(tekst);//rejestrujemy wykonane polecenia
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
        System.out.println("AST:"+tree.toStringTree(parser)); // print tree as text <label id="code.tour.main.7"/>
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
                wy.println("STOPPED, BEST SPECIMEN ATTAINED FITNESS LOWER THAN TARGET:"+ilosc_generacji);
            }
        }
    }
    void następna()
    {
        //Obliczenie wyników całej populacji
        ewaluuj_populację();
        //3.Selekcja
        //4.Rekombinacja i mutacja
    }
    void ewaluuj_populację()
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
    void proc_interaktywna()
    {

    }
}
