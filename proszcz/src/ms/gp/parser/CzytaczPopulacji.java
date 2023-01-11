package ms.gp.parser;

import ms.drzewo.Węzeł;
import ms.drzewo.operacje.KonstruktorProgramów;
import ms.drzewo.operacje.losowe.IPodawaczWęzłów;
import ms.gp.parser.populacja.populacjaBaseVisitor;
import ms.gp.parser.populacja.populacjaParser;
import ms.interpreter.Silnik;
import ms.interpreter.Środowisko;
import ms.parser.proszczLexer;
import ms.parser.proszczParser;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;

import static ms.gp.ewolucja.Ewolutor.parsingParametryczny;

public class CzytaczPopulacji extends KonstruktorProgramów {
    //Silnik silnik;
    //KonstruktorProgramów konstruktorProgramów;
    ArrayList<Węzeł> pop;

    public CzytaczPopulacji(Silnik silnik, IPodawaczWęzłów podawacz) {
        super(silnik, podawacz);
    }


    public Węzeł[] czytajPopulację(ParseTree tree)
    {

        pop = new ArrayList<Węzeł>();
        System.err.println(tree.toStringTree());
        this.visitPopulacja((populacjaParser.PopulacjaContext) tree);
        return pop.toArray(pop.toArray(new Węzeł[0]));
    }

    public Węzeł visitPopulacja(populacjaParser.PopulacjaContext ctx) {
        System.err.println("visitPopulacja");
        //silnik = new Silnik();
        //konstruktorProgramów= new KonstruktorProgramów(silnik, Środowisko.domyślny_podawacz);
        pop = new ArrayList<Węzeł>();
        int zadeklarowana_wielkosc = (int) Double.parseDouble(ctx.STALA().getText());
        System.err.format("osobnik %d\n",ctx.osobnik().size());
        for (var osobnik:ctx.osobnik()) {
            visitOsobnik(osobnik);
        }
        System.err.println("LENGTH%%%%"+pop.size());
        return  null;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     * @return
     */
     public Węzeł visitOsobnik(populacjaParser.OsobnikContext ctx) {
         System.err.println("visitOsobnik");
        //ParseTree ptree = parsingParametryczny(ctx.wyrazenie().getText(), proszczLexer.class, proszczParser.class, "wyrazenie");
         pop.add( this.visit(ctx.wyrazenie()));
        return null;
    }
}
