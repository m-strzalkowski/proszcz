package ms.interpreter;

import ms.Tablice;
import ms.bledy.SemanticOccurence;
import ms.bledy.SyntaxErrorListener;
import ms.bledy.ZdarzenieWykonania;
import ms.drzewo.Węzeł;

import static java.lang.Double.NaN;
import static ms.bledy.SemanticOccurence.Level.ERROR;
import static ms.bledy.SemanticOccurence.Level.WARN;

import ms.drzewo.operacje.KonstruktorProgramów;
import ms.parser.proszczVisitor;
import ms.proces.Nazwa;
import ms.proces.Proces;
import ms.parser.proszczLexer;
import ms.parser.proszczParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintStream;
import java.util.*;

public class Silnik implements ISilnik{

    public Proces główny=new Proces(null);
    private Stack<Proces> stos = new Stack<Proces>();
    public void naStos(Proces p){stos.add(p);}
    public Proces zeStosu(){return stos.pop();}
    public boolean stosPusty(){return stos.empty();}
    public Proces aktualny(){return stos.peek();}

    public Nazwa adres = null;//Adres zwracany przez aktualny węzeł.

    //public Stack<String> lwartosci = new Stack<>();//do konstrukcji typu .a.b.c:=2
    //public Proces aktualny=null;

    public double ostatnia_wartość_zwracana=NaN;
    public int liczba_wykonanch_wezłów=0;
    public int limit_wykonanch_wezłów=4096;

    public double[] argumenty = null;

    public PrintStream out = null;//potrzebny do wypisywania.
    public Silnik(PrintStream out) {
        this.out = out;
    }
    public Silnik(){this(System.out);}

    public boolean trace=false;


    /*
    private void załaduj_argumenty(double [] argumenty) {
        System.out.println("==załaduj argumenty==");
        this.argumenty = argumenty;
        System.out.println("==/załaduj argumenty==");

    }
    */

    public void optymalizuj()
    {
        throw new RuntimeException("Not yet implemented");
        //Optymalizator opt = new Optymalizator(prog);
        //opt.spłaszczanie();
        //opt.redukcje();
    }
    public void pokażDrzewo()
    {
        throw new RuntimeException("Not yet implemented");
        //EksportDrzewa.graphhviz(this.prog);
    }
    public String zwróćKod()
    {
        return this.główny.kod(this,true);
    }



    static String SEP=" ";//separator w csv

    public void setup_fitness_tiny_gp_plus_exec(String inname, String outname, String pred_col_name) {
        try {
            int i,j;
            String line;

            BufferedReader in =
                    new BufferedReader(
                            new
                                    FileReader(inname));
            PrintStream out;
            if(outname==null)
            {out=System.out;}
            else {out = new PrintStream(outname);}

            line = in.readLine();
            StringTokenizer tokens = new StringTokenizer(line);
            int varnumber = Integer.parseInt(tokens.nextToken().trim());
            int randomnumber = Integer.parseInt(tokens.nextToken().trim());
            double minrandom =	Double.parseDouble(tokens.nextToken().trim());
            double maxrandom =  Double.parseDouble(tokens.nextToken().trim());
            int fitnesscases = Integer.parseInt(tokens.nextToken().trim());
            double[][] targets = new double[fitnesscases][varnumber+2];//jeden na wynik oryginalny, drugi na wyliczony
            if (varnumber + randomnumber >= 110 )
                System.out.println("too many variables and constants");
            //Nagłówek pliku wynikowego
            for(i=1;i<varnumber+1;i++){out.print("X"+i+SEP);} out.print("cel"+SEP);out.print(pred_col_name+"\n");
            for (i = 0; i < fitnesscases; i ++ ) {
                line = in.readLine();
                if(line==null){break;}
                tokens = new StringTokenizer(line);
                for (j = 0; j <= varnumber; j++) {
                    targets[i][j] = Double.parseDouble(tokens.nextToken().trim());
                    //
                }
                //this.załaduj(targets[i]);
                //ramka.pisz(System.out);

                double wynik = this.uruchom(null, targets[i]);
                out.print(line);
                out.print(SEP+wynik+"\n");
            }
            in.close();
            out.flush();
            if(outname != null){out.close();}
        }
        catch(FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("IN:"+inname+":OUT:"+ outname+ ":ERROR: Please provide a data file");
            System.exit(0);
        }
        catch(Exception e ) {
            e.printStackTrace();
            //System.out.println(e.getMessage());
            System.out.println("ERROR: Incorrect data format");
            System.exit(0);
        }
    }



    public static ParseTree parsingProgramu(String tekstProgramu)
    {
        //1.Analiza leksykalna
        proszczLexer lexer = new proszczLexer(CharStreams.fromString(tekstProgramu));
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        //2.analiza syntaktyczna
        proszczParser parser = new proszczParser(tokens);
        SyntaxErrorListener syntaxErrorListener = new SyntaxErrorListener();
        parser.addErrorListener(syntaxErrorListener);
        ParseTree tree = parser.program(); // parse; start at prog <label id="code.tour.main.6"/>
        int nume = syntaxErrorListener.getNumberOfErrors();
        if (nume > 0) {
            System.err.println("THERE "+(nume>1?"WERE":"WAS")+" DETECTED " + nume + " SYNTAX ERROR"+(nume>1?"S":"")+". Analysis will not proceed.\n");
            System.err.println("incomplete tree:");
            System.err.println(tree.toStringTree(parser));
            return null;
        }
//        System.err.println(syntaxErrorListener.getNumberOfErrors());
//        System.err.println("|"+tekstProgramu+"|");
        //System.out.println("AST:"+tree.toStringTree(parser)); // print tree as text <label id="code.tour.main.7"/>
        return tree;
    }



    public void listuj_krótko(String nazwa) {
        Nazwa n;if(nazwa==null){n=główny;}
        else{n= główny.szukaj_nazwy(nazwa);}

        if(n==null){out.println("/*not found "+nazwa+" */");return;}
        out.println(n.kod(this,false));
    }

    public void listuj(String nazwa) {
        Nazwa n;if(nazwa==null){n=główny;}
        else{n= główny.szukaj_nazwy(nazwa);}
        if(n==null){out.println("/*not found "+nazwa+" */");return;}
        out.println(n.kod(this,true));
    }

    public void import_(Proces p, String nazwa, Silnik s) {
        //najpierw szuka w głównym zakresie silnika, potem w środowisku
        //if(Objects.equals(nazwa, "^")){}
        if(s.główny.nazwy.containsKey(nazwa))
        {
            p.nazwy.put(nazwa, s.główny.nazwy.get(nazwa));
        }
        else if(Środowisko.biblioteka_nazw.containsKey(nazwa)){
            p.nazwy.put(nazwa, Środowisko.biblioteka_nazw.get(nazwa));
        }
        else{
            Tablice.podsystem_bledow.zglosZdarzenie(new SemanticOccurence(ERROR,p.drzewo.start,"trying to import name "+nazwa+" which does not exist in MAIN namespace of current engine or among library names.."));
        }
    }

    public void deport(Proces p, String nazwa) {
        if(p.nazwy.containsKey(nazwa))
        {
            p.nazwy.remove(nazwa);
        }
        else{
            Tablice.podsystem_bledow.zglosZdarzenie(new SemanticOccurence(ERROR,p.drzewo.start,"trying to deport name "+nazwa+"which does not exist in current namespace."));
        }
    }

    /*--- METODY Z INTERFEJSU ---*/

    @Override
    public Nazwa daj_proces(String nazwa){
        return główny.szukaj_nazwy(nazwa);
    }
    @Override
    public void przypnij(String nazwa,Proces proces)
    {
        if(nazwa!=null)
        {
            główny.nazwy.put(nazwa,proces);
        }
        else{
            główny=proces;
        }
    }

    public void przypnij(Proces proces)
    {
        przypnij(null,proces);
    }
    @Override
    public void inicjuj(String nazwa)
    {
        Nazwa n;if(nazwa==null){n=główny;}
        else{n= główny.szukaj_nazwy(nazwa);}
        n.inicjuj(this);
    }
    @Override
    public void załaduj(String nazwa,Proces p)
    {
        przypnij(nazwa, p);
        inicjuj(nazwa);
    }

    @Override
    public void przygotuj(String nazwa)
    {
        Nazwa n;if(nazwa==null){n=główny;}
        else{n= główny.szukaj_nazwy(nazwa);}
        n.inicjuj(this);
        this.liczba_wykonanch_wezłów=0;
    }
    @Override
    public double uruchom(String nazwa, double[] argumenty) {
        przygotuj(nazwa);
        this.argumenty = argumenty;
        Nazwa n;if(nazwa == null){n=główny;}
        else{n= główny.szukaj_nazwy(nazwa);}
        stos.push(główny);
            double ret = n.policz(this, argumenty);
        stos.pop();
        this.argumenty = null;
        return ret;
    }

    @Override
    public double uruchom(String nazwa)
    {
        return uruchom(nazwa);
    }

    @Override
   public double wykonaj(String nazwa, double[] argumenty){
        przygotuj(nazwa);
        return uruchom(nazwa, argumenty);
    }
    @Override
    public double wykonaj(String nazwa){
        return wykonaj(nazwa, null);
    }

@Override
    public double wykonaj_tekst(String tekst) {
        ParseTree ptree = parsingProgramu(tekst);
        if(ptree==null){return NaN;}//parsowanie sie ne powiodło
        proszczVisitor<Węzeł> konstruktorProgramów = new KonstruktorProgramów(this,Środowisko.domyślny_podawacz);
        //try {
            konstruktorProgramów.visit(ptree);
        //}
        /*catch (ZdarzenieWykonania ex)
        {
            if(ex.getSeverity().worseOrEqual(WARN))
            {
                switch (ex.getMessage().toLowerCase(Locale.ROOT))
                {
                    case "exit":
                    case "halt": return this.ostatnia_wartość_zwracana;
                    default:ex.printStackTrace();throw ex;
                }
            }
            else{
                ex.printStackTrace();
            }
        }
        */
        return this.ostatnia_wartość_zwracana;
    }

    @Override
    public void resetuj() {
        this.stos.clear();
        this.ostatnia_wartość_zwracana = NaN;
        this.liczba_wykonanch_wezłów=0;
        this.główny = null;
    }

}
