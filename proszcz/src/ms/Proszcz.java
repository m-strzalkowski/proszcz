package ms;

import ms.bledy.SemanticOccurence;
import ms.bledy.ZdarzenieWykonania;
import ms.drzewo.Jednomianowy;
import ms.drzewo.operacje.KonstrukcjaDrzewaJednomianow;
import ms.interpreter.Silnik;
import ms.interpreter.starysilnik;
import ms.parser.wyrVisitor;
import org.apache.commons.cli.*;

import java.io.*;
import java.util.Locale;
import java.util.Scanner;

import static ms.Tablice.*;
import static ms.bledy.SemanticOccurence.Level.WARN;

/**
 * Główna klasa wywołująca interpreter
 */
public class Proszcz {

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

        Option interaktywny_opt = new Option("I", "InteraktywneWykonanie", false, "Dla każdej niezdefiniowanej zmiennej, będzie sie pytał podczas wykonania");
        interaktywny_opt.setRequired(false);
        options.addOption(interaktywny_opt);

        Option pokaz_opt = new Option("p", "pokazuj", false, "Generuje grafy i pokazuje wywołując polecenie dot.");
        pokaz_opt.setRequired(false);
        options.addOption(pokaz_opt);

        Option dzielenie_opt = new Option("D", "dziwne_dzielenie", false, "Używa definicji dzielenia z TinyGp");
        dzielenie_opt.setRequired(false);
        options.addOption(dzielenie_opt);


        String header = "Proszcz - interpreter\n\n";
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
        System.out.println("Interpeter.");
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

        interaktywny = cmd.hasOption(interaktywny_opt);
        upraszczanie = cmd.hasOption(upraszczanie_opt);
        pokazywanie = cmd.hasOption(pokaz_opt);
        dziwnedzielenie = cmd.hasOption(dzielenie_opt);
        PRÓG_DZIWNODZIELENIA = dziwnedzielenie ? 0.001 : -1;
        //otwarcie pliku wejściowego
        InputStream input = System.in; File file = null;
        try {
            if(inputFilePath == null || inputFilePath.length()<1)
                input = System.in;

            else {
                file = new File(inputFilePath);
                input = new FileInputStream(file);//CharStreams.fromPath(Paths.get(inputFilePath), StandardCharsets.UTF_8);
            }


        } catch (IOException e) {
            System.err.println("Nie udało się otworzyć pliku wejściowego. Kończenie");
            System.exit(1);
        }
        PrintStream stream_out;
        try{
            if(outputFilePath==null)
            {stream_out=System.out;}
            else {stream_out = new PrintStream(outputFilePath);}
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
            stream_out=System.out;
        }

        interpretacja_interaktywna_do_n_pustych_linii(null,input, stream_out,2);
        System.out.println("KONIEC");



    }

    public static void interpretacja_interaktywna_do_n_pustych_linii(Silnik silnik,InputStream input, PrintStream stream_out,int maks_puste_linie) {
        if(silnik ==null){silnik = new Silnik(stream_out);}
        var scanner = new Scanner(input);
        StringBuilder sb = new StringBuilder();
        //wczytuje wiersze z wejścia, jeśli napotka pusty wiersz, wykonuje to, co wczytał, jeśli dwa puste - kończy.
        int pustewiersze=0;
        while(pustewiersze<=maks_puste_linie)
        {
            //if(interaktywny){ System.out.print(">");}
            String wiersz = scanner.nextLine();
            sb.append(wiersz);
            sb.append("\n");
            if(sb.length() < 1){++pustewiersze; continue;}
            if(wiersz.length() < 1)
            {
                pustewiersze=0;
                //wykonaj komendę
                try {
                    System.out.println(sb.toString());

                    silnik.wykonaj_tekst(sb.toString());

                    //if(interaktywny){silnik.wykonaj_tekst("ls LASTRET");}
                    //if(pokazywanie){silnik.pokażDrzewo();}
                    //System.out.println( silnik.zwróćKod());
                }
                catch (ZdarzenieWykonania ex)
                {

                    if(ex.getSeverity().worseOrEqual(WARN))
                    {
                        switch (ex.getMessage().toLowerCase(Locale.ROOT))
                        {
                            case "exit":
                            case "halt":
                                stream_out.println("exitting...");
                                return;
                        }
                    }
                    System.err.println("INTERACTIVE CATCHED:"+ex.getSeverity());
                    ex.printStackTrace();

                }
                catch(Throwable t){t.printStackTrace();}//tu akurat uzasadnione łapanie wszystkiego
                sb.setLength(0);//czyści bufor.
            }

        }
    }


}
