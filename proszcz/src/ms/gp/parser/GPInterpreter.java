package ms.gp.parser;

import ms.drzewo.Węzeł;
import ms.gp.ewolucja.Ewolutor;
import ms.gp.parser.gen.ProszczGPBaseVisitor;
import ms.gp.parser.gen.ProszczGPParser;
import ms.gp.przypadki.ZarządcaPrzypadków;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.apache.commons.lang.StringEscapeUtils;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import java.io.IOException;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.Path;
import java.util.List;
import java.util.Objects;

import static java.lang.System.exit;
import static ms.gp.przypadki.ZarządcaPrzypadków.FormatPrzypadkow.NIEROZPOZNANY;
import static ms.gp.przypadki.ZarządcaPrzypadków.FormatPrzypadkow.TINYGP;

public class GPInterpreter extends ProszczGPBaseVisitor<Void> {
    private static Logger log = LogManager.getLogger(GPInterpreter.class);
    PrintStream wy = System.out;
    Ewolutor ew;
    boolean interaktywny=false;

    public GPInterpreter(Ewolutor ew, PrintStream wy,boolean interaktywny) {
        this.wy = wy;
        this.ew=ew;
        this.interaktywny=interaktywny;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Void visitPlik(ProszczGPParser.PlikContext ctx) {
        this.ew.interpretery.push(this);
        log.debug("visitPlik");
        for (var ch:ctx.children) {
            try{
                visit(ch);
            }
            catch(RuntimeException ex)
            {
                if(Objects.equals(ex.getMessage(), "RESUME")){wy.println("ending interactive session.");this.ew.interpretery.pop(); return null;}
                ex.printStackTrace();
                System.err.println(" ERROR EXECUTING LINE "+ctx.start.getLine());
                if(!this.interaktywny)
                {
                    System.err.println(" EXECUTE PROPER COMMAND IN INTERACTIVE SESSION.");
                    ew.interpretuj_stdin();
                }

            }
        }
        this.ew.interpretery.pop();
        return null;
        //return visitChildren(ctx);
    }

    /**
     * @return argument z reguł typu: w: /'cośtam' (NAZWA|NAPIS_DOSL);/ (tylko jedna nazwa/napis_dosl, inaczej antlr generuje NAZWA(int) zamiast NAZWA(void)).
     * Nie udało mie sie znaleźć /bezrefleksyjnego/ sposobu na zapisanie kodu:
     * ctx.NAZWA()!=null?ctx.NAZWA().getText():ctx.NAPIS_DOSL().getText().replaceAll("^\"|\"$","");
     * ponieważ różne podklasy ParserRuleContext nie implementują żadnych wspólnych interfejsów i a.NAZWA != b.NAZWA mimo że a,b extends ParserRuleCOntext
     */
    public String tekstZJedynejNAZWYLubNAPISU(ParserRuleContext ctx)
    {
        Class<?> ctxclass = ctx.getClass();
        java.lang.reflect.Method NAZWA=null,NAPIS_DOSL=null;
        TerminalNode nazwa=null, napis_doslowny=null;
        try {
            NAZWA = ctxclass.getMethod("NAZWA");//, param1.class, param2.class, ..);
            NAPIS_DOSL = ctxclass.getMethod("NAPIS_DOSL");//, param1.class, param2.class, ..);
        } catch (SecurityException | NoSuchMethodException e) { e.printStackTrace();exit(1); }
        if(NAZWA==null){  System.err.println("NAZWA==null"); exit(1);}
        if(NAPIS_DOSL==null){  System.err.println("NAPIS_DOSL==null"); exit(1);}
        ParseTree tree=null;
        try {
            //tree = (ParseTree) method.invoke(parser);
            //method.invoke(obj, arg1, arg2,...);
            nazwa = (TerminalNode) NAZWA.invoke(ctx);
            napis_doslowny = (TerminalNode) NAPIS_DOSL.invoke(ctx);
        } catch (IllegalArgumentException | IllegalAccessException | InvocationTargetException e) { e.printStackTrace();exit(1);}
        return nazwa!=null?nazwa.getText():napis_doslowny.getText().replaceAll("^\"|\"$","");
    }
    public double[] STALEzKontekstu(ParserRuleContext ctx)
    {

        Class<?> ctxclass = ctx.getClass();
        java.lang.reflect.Method STALA=null;
        List<TerminalNode> stale=null, napis_doslowny=null;
        try {
            STALA = ctxclass.getMethod("STALA");//, param1.class, param2.class, ..);
        } catch (SecurityException | NoSuchMethodException e) { e.printStackTrace();exit(1); }
        if(STALA==null){  System.err.println("STALA==null"); exit(1);}
        ParseTree tree=null;
        try {
            //tree = (ParseTree) method.invoke(parser);
            //method.invoke(obj, arg1, arg2,...);
            stale = (List<TerminalNode>)  STALA.invoke(ctx);
        } catch (IllegalArgumentException | IllegalAccessException | InvocationTargetException e) { e.printStackTrace();exit(1);}
        int i=0; double[] ret = new double[stale.size()];
        for (var stala: stale) {
            try {
                ret[i] = Double.parseDouble(stala.getText());
            }
            catch(NumberFormatException ex)
            {
                ret[i] = Double.NaN;
            }
            i++;
        }
        return ret;
    }
    public int[] intSTALEZKontektu(ParserRuleContext ctx)
    {
        double[] t = STALEzKontekstu(ctx);
        int[] ret = new int[t.length];
        for(int i=0;i<t.length;i++){ret[i] = (int)t[i]; if(!Double.isFinite(t[i])){return null;}}
        return ret;
    }
    @Override
    public Void visitEcho(ProszczGPParser.EchoContext ctx) {
        //String arg =ctx.NAZWA()!=null?ctx.NAZWA().getText():ctx.NAPIS_DOSL().getText().replaceAll("^\"|\"$","");
        String arg = tekstZJedynejNAZWYLubNAPISU(ctx);
        arg = StringEscapeUtils.unescapeJava(arg);
        System.out.println(arg);
        return null;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Void visitInstrukcja(ProszczGPParser.InstrukcjaContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Void visitUstaw_nazwe(ProszczGPParser.Ustaw_nazweContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Void visitUstaw_katalog(ProszczGPParser.Ustaw_katalogContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Void visitWykonaj_skrypt(ProszczGPParser.Wykonaj_skryptContext ctx) {
        ew.interpretuj_plik(tekstZJedynejNAZWYLubNAPISU(ctx));
        return null;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Void visitPrzypadki(ProszczGPParser.PrzypadkiContext ctx) {
        String arg = tekstZJedynejNAZWYLubNAPISU(ctx);
        String sciezka;
        try {
            sciezka = ew.sciezka_pliku(arg).toRealPath().toString();
        } catch (IOException e) {
            sciezka = ew.sciezka_pliku(arg).toString();
        }
        ZarządcaPrzypadków.FormatPrzypadkow format = TINYGP;
        for (ProszczGPParser.Opcja_przypadkowContext opt:ctx.opcja_przypadkow()) {
            String s = opt.getText().trim();
            ZarządcaPrzypadków.FormatPrzypadkow f = ZarządcaPrzypadków.FormatPrzypadkow.zNapisu(s, NIEROZPOZNANY);
            if(f != NIEROZPOZNANY){format = f;}
        }
        System.err.println("PATH:"+sciezka);
        ew.zcas.wczytaj(sciezka,format);
        return null;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Void visitOpcja_przypadkow(ProszczGPParser.Opcja_przypadkowContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Void visitPisz_przypadki(ProszczGPParser.Pisz_przypadkiContext ctx) {
        //ew.zcas.
        int[] stale = intSTALEZKontektu(ctx);
        if(stale!=null && stale.length==2){ew.zcas.pisz(wy,stale[0], stale[1]);}
        else{ew.zcas.pisz(wy);}
        return null;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Void visitFunkcja_przystosowania(ProszczGPParser.Funkcja_przystosowaniaContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Void visitFprzyst_klasa(ProszczGPParser.Fprzyst_klasaContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Void visitSrodowisko(ProszczGPParser.SrodowiskoContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Void visitListuj_srodowiska(ProszczGPParser.Listuj_srodowiskaContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Void visitRozmiar_populacji(ProszczGPParser.Rozmiar_populacjiContext ctx) {
        ew.zpop.empty_and_resize(ctx.NAZWA().getText(), Integer.parseInt(ctx.STALA().getText()));
        return null;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Void visitInicjalizacja_populacji(ProszczGPParser.Inicjalizacja_populacjiContext ctx) {
        ew.zpop.inicjalizacja(ctx.typ.getText(),ctx.NAZWA().getText(), (int) Double.parseDouble(ctx.STALA().getText())); return null;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Void visitZapis_populacji(ProszczGPParser.Zapis_populacjiContext ctx) {
        String nazwa_pop = ctx.NAZWA().getText();
        if(ctx.zapis_populacji_gdzie()==null)//listowanie populacji
        {
            int[] stale = intSTALEZKontektu(ctx);
            if(stale!=null && stale.length==2){ew.zpop.pisz(nazwa_pop,wy,stale[0], stale[1]);}
            else{ew.zpop.pisz(nazwa_pop,wy);}
        }
        else{
            String gdzie = tekstZJedynejNAZWYLubNAPISU(ctx.zapis_populacji_gdzie());
            wy.println("Writing population to "+gdzie);
            try {
                ew.zpop.zapisz_do_pliku(nazwa_pop,ew.sciezka_pliku(gdzie).toAbsolutePath().toString());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Void visitOdczyt_populacji(ProszczGPParser.Odczyt_populacjiContext ctx) {
        String nazwa_pop = ctx.NAZWA().getText();
        String gdzie = tekstZJedynejNAZWYLubNAPISU(ctx.odczyt_populacji_gdzie());
        wy.println("Reading population from "+gdzie);
        ew.zpop.czytaj_z_pliku(nazwa_pop, ew.sciezka_pliku(gdzie).toAbsolutePath().toString());
        return null;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Void visitListuj_populacje(ProszczGPParser.Listuj_populacjeContext ctx) {
        ew.zpop.listuj_populacje(wy);return null;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Void visitNastepne(ProszczGPParser.NastepneContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Void visitStatystyki(ProszczGPParser.StatystykiContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Void visitNr_obecnej_generacji(ProszczGPParser.Nr_obecnej_generacjiContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Void visitInspekcja(ProszczGPParser.InspekcjaContext ctx) {
        ew.interpretuj_stdin();return null;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Void visitKoniec_inspekcji(ProszczGPParser.Koniec_inspekcjiContext ctx) {
        throw new RuntimeException("RESUME");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Void visitInspekcja_srodowiska(ProszczGPParser.Inspekcja_srodowiskaContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Void visitZakoncz(ProszczGPParser.ZakonczContext ctx) {
        wy.println("HALTING SYSTEM");
        exit(0);
        return null;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Void visitWstrzykniecie_osobnika_do_srodowiska(ProszczGPParser.Wstrzykniecie_osobnika_do_srodowiskaContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Void visitWaga_operatora_genetycznego(ProszczGPParser.Waga_operatora_genetycznegoContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Void visitListuj_operatory_genetyczne(ProszczGPParser.Listuj_operatory_genetyczneContext ctx) { return visitChildren(ctx); }
}
