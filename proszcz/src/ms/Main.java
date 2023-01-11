package ms;

import ms.bledy.SemanticOccurence;
import ms.bledy.SyntaxErrorListener;
import ms.drzewo.Jednomianowy;
import ms.drzewo.operacje.KonstrukcjaDrzewaJednomianow;
import ms.interpreter.starysilnik;
import ms.parser.wyrLexer;
import ms.parser.wyrParser;
import ms.parser.wyrVisitor;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.apache.commons.cli.*;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.channels.Channels;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;
import java.util.ArrayList;

import static java.lang.System.exit;
import static ms.Tablice.*;

public class Main {

    public static void main(String[] args)  {

        //Opcje z terminala (apache.commons.cli)
        Options options = new Options();

        Option optinput = new Option("i", "we", true, "Plik wejściowy");
        optinput.setRequired(false);
        options.addOption(optinput);

        Option optoutput = new Option("o", "wy", true, "Plik wynikowy formuły");
        optoutput.setRequired(false);
        options.addOption(optoutput);

        Option stopstate = new Option("s", "stop", true, "Jak poważny błąd zatrzyma kompilację: ostrzezenie/blad/fatalny, fatalny błąd domyślnie");
        stopstate.setRequired(false);
        options.addOption(stopstate);

        Option verbosity = new Option("v", "werbalnosc", true, "Powyżej jakiego poziomu włącznie wypisywać: debug/info/ostrzezenie/blad/fatalny, fatalny błąd domyślnie");
        verbosity.setRequired(false);
        options.addOption(verbosity);

        Option upraszczanie_opt = new Option("u", "upraszczanie", false, "Czy upraszczać formułę");
        upraszczanie_opt.setRequired(false);
        options.addOption(upraszczanie_opt);

        Option testy_we = new Option("T", "TestyTinyGp", true, "Wczytuje plik uczący dla TinyGp i dopisuje wartość wyrażenia podanego jako następną kolumnę");
        testy_we.setRequired(false);
        options.addOption(testy_we);

        Option nazwa_kolumny = new Option("N", "nazwa_kolumny_w_testach", true, "Nazwa kolumny wynikowej w wynikach testów (-T)");
        nazwa_kolumny.setRequired(false);
        options.addOption(nazwa_kolumny);

        Option testy_wy = new Option("O", "TestyTinyGp", true, "Wyjście dla wyników testów");
        testy_wy.setRequired(false);
        options.addOption(testy_wy);

        Option interaktywny_opt = new Option("I", "InteraktywneWykonanie", false, "Dla każdej niezdefiniowanej zmiennej, będzie sie pytał podczas wykonania");
        interaktywny_opt.setRequired(false);
        options.addOption(interaktywny_opt);

        Option pokaz_opt = new Option("p", "pokazuj", false, "Generuje grafy i pokazuje wywołując polecenie dot.");
        pokaz_opt.setRequired(false);
        options.addOption(pokaz_opt);

        Option dzielenie_opt = new Option("D", "dziwne_dzielenie", false, "Używa definicji dzielenia z TinyGp");
        dzielenie_opt.setRequired(false);
        options.addOption(dzielenie_opt);


        String header = "Upraszczacz\n\n";
        String footer = "\nMoże zadziała.";
        CommandLineParser optparser = new DefaultParser();
        HelpFormatter optformatter = new HelpFormatter();
        CommandLine cmd = null;

        try {
            cmd = optparser.parse(options, args);
        } catch (ParseException e) {
            //trzeba by przetłumaczyć komunikaty o błędach (załączając zmienione źródła...)
            System.out.println(e.getMessage());

            optformatter.setSyntaxPrefix("użycie:");
            optformatter.printHelp("java ms.Main", header, options, footer, true);

            System.exit(1);
        }
        //pliki we/wy
        inputFilePath = cmd.getOptionValue("we");
        outputFilePath = cmd.getOptionValue("wy");
        System.out.println("Upraszczacz wyrażeń arytmetycznych.");
        System.out.println("Plik wejściowy:"+inputFilePath);
        //System.out.println("Plik wynikowy:"+outputFilePath);

        //Inicjalizacja globalnych tablic
        Tablice.inicjalizuj();
        //pseudodebugowanie podczas wykonania

        String stopst = cmd.getOptionValue(stopstate);
        if(stopst != null)
        {
            Tablice.podsystem_bledow.setStop_at_severity(SemanticOccurence.Level.zNapisu(stopst, SemanticOccurence.Level.FATAL));
        }

        //tolerancja błędów ostrzezenie/blad/fatalny
        String verb = cmd.getOptionValue(verbosity);
        if(verb != null)
        {
            Tablice.podsystem_bledow.setMute_threshold(SemanticOccurence.Level.zNapisu(verb, SemanticOccurence.Level.INFO));
        }
        testInputFilePath= cmd.getOptionValue(testy_we);
        testOutputFilePath= cmd.getOptionValue(testy_wy);
        String n=cmd.getOptionValue(nazwa_kolumny); if(n!=null && n.length()>0) {nazwa_kolumny_wyniku_w_testach = n;}
        interaktywny = cmd.hasOption(interaktywny_opt);
        upraszczanie = cmd.hasOption(upraszczanie_opt);
        pokazywanie = cmd.hasOption(pokaz_opt);
        dziwnedzielenie = cmd.hasOption(dzielenie_opt);
        PRÓG_DZIWNODZIELENIA = dziwnedzielenie ? 0.001 : -1;
        //otwarcie pliku wejściowego
        CharStream input = null;
        try {
            if(inputFilePath == null || inputFilePath.length()<1)
                input = CharStreams.fromChannel(Channels.newChannel(System.in));

            else
                input = CharStreams.fromPath(Paths.get(inputFilePath), StandardCharsets.UTF_8);


        } catch (IOException e) {
            System.err.println("Nie udało się otworzyć pliku wejściowego. Kończenie");
            System.exit(1);
        }

        SyntaxErrorListener syntaxErrorListener = new SyntaxErrorListener();
        //1.analiza leksykalna
        wyrLexer lexer = new wyrLexer(input);
        lexer.addErrorListener(syntaxErrorListener);
        CommonTokenStream tokens = new CommonTokenStream(lexer);


        //2.analiza syntaktyczna
        wyrParser parser = new wyrParser(tokens);

        parser.addErrorListener(syntaxErrorListener);
        ParseTree tree = parser.program(); // parse; start at prog <label id="code.tour.main.6"/>
        if(syntaxErrorListener.getNumberOfErrors() > 0)
        {
            System.err.println("WYSTĄPIŁY BŁĘDY SKŁADNIOWE, dokładnie "+syntaxErrorListener.getNumberOfErrors()+". Dalsza analiza i generacja nie nastąpi.\n");
            exit(1);
        }

        wyrVisitor<Jednomianowy> konstruktorDrzewa = new KonstrukcjaDrzewaJednomianow();
        Jednomianowy program = (Jednomianowy) konstruktorDrzewa.visit(tree);
        starysilnik silnik = new starysilnik();
        silnik.załaduj(program);
        if(pokazywanie){silnik.pokażDrzewo();}
        if(upraszczanie)
        {
            silnik.optymalizuj();
            if(pokazywanie){silnik.pokażDrzewo();}
        }
        //wypisz formułę
        PrintStream formula_out;
        try{
            if(outputFilePath==null)
            {formula_out=System.out;}
            else {formula_out = new PrintStream(outputFilePath);}
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
            formula_out=System.out;
        }
        formula_out.println( silnik.zwróćKod());
        //uruchom ewentualne testy
        if(testInputFilePath != null ){silnik.setup_fitness_tiny_gp_plus_exec(testInputFilePath,testOutputFilePath, nazwa_kolumny_wyniku_w_testach);}
        //ewentualne wykonanie interaktywne
        if(interaktywny){
            System.out.println("==wykonanie==");
            System.out.println( silnik.wykonaj());
        }
        System.out.println("KONIEC");

        //System.out.println(tree.toStringTree(parser)); // print tree as text <label id="code.tour.main.7"/>

        //walker
        /*ParseTreeWalker walker = new ParseTreeWalker();
        //3.Zebranie nowych nazw typów
        wyrListener zbieracz = new ZbieraczNowychTypow(parser);
        //if(debuger_kompilatora!=null){debuger_kompilatora.podmień(zbieracz, DebugerKompilatora.Przebieg.ZBIERANIE_TYPOW);}
        if(debuger_kompilatora!=null){zbieracz =  (wyrListener) debuger_kompilatora.zmień(zbieracz, DebugerKompilatora.Przebieg.ZBIERANIE_TYPOW); }
        walker.walk( zbieracz, tree );
        //4.Czytanie deklaracji i tworzenie struktur pamięci (typy i ramki stosu procedur)
        wyrListener ustalacz = new UstalaczStruktur(parser);
        if(debuger_kompilatora!=null){ustalacz =  (wyrListener) debuger_kompilatora.zmień(ustalacz, DebugerKompilatora.Przebieg.ZBIERANIE_TYPOW); }
        walker.walk(ustalacz, tree);
        //5.Generacja kodu
        wyrVisitor generator = new GeneratorVisitor();
        if(debuger_kompilatora!=null){generator =  (wyrVisitor) debuger_kompilatora.zmień(generator, DebugerKompilatora.Przebieg.ZBIERANIE_TYPOW); }
        generator.visit(tree);
        //6.Składanie kodu?
        SkladaczKoduAsemblera skladacz = new SkladaczKoduAsemblera(inputFilePath, Tablice.SRODOWISKO, Tablice.externy);
        skladacz.zapiszKodAssembleraDoPliku();
        if(Tablice.generacja_binarnego_obrazu)
        {
            skladacz.uruchom();
        }
        */

    }
}
