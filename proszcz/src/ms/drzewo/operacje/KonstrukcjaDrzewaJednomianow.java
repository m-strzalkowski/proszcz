package ms.drzewo.operacje;

import ms.drzewo.Jednomianowy;
import ms.parser.wyrBaseVisitor;
import ms.parser.wyrParser;

public class KonstrukcjaDrzewaJednomianow extends wyrBaseVisitor<Jednomianowy> {


    @Override
    public Jednomianowy visitProgram(wyrParser.ProgramContext ctx) {
        return (Jednomianowy) visit(ctx.wyrazenie());
    }
    @Override
    public Jednomianowy visitWyrazenieNawiasy(wyrParser.WyrazenieNawiasyContext ctx) {
        return (Jednomianowy)visit(ctx.wyrazenie());
    }

    @Override
    public Jednomianowy visitWyrazenieZnak(wyrParser.WyrazenieZnakContext ctx) {
        Jednomianowy w = visit(ctx.wyrazenie());
        //Jesli trafimy na minusa, mnożymy podrzewo przez -1.
        if(ctx.znak.getText().equals("-"))
        {
            Jednomianowy r = new Jednomianowy(Jednomianowy.Zawartość.RAZY);
            Jednomianowy z = new Jednomianowy(null,0,-1);
            r.dzieci.add(z);
            r.dzieci.add(w);
            return r;
        }
        else{return w;}
    }

    @Override
    public Jednomianowy visitWyrazenieWywolanie(wyrParser.WyrazenieWywolanieContext ctx) {
        Jednomianowy wz = new Jednomianowy(ctx.wywolanie_funkcji().NAZWA().getText());
        for (var dz:ctx.wywolanie_funkcji().lista_parametrow_aktualnych().wyrazenie()) {
            Jednomianowy dzw = (Jednomianowy) visit(dz);
            dzw.rodzic = wz;
            wz.dzieci.add(dzw);
        }
        return wz;
    }

    @Override
    public Jednomianowy visitWyrazenieAddyt(wyrParser.WyrazenieAddytContext ctx) {

        Jednomianowy wz = new Jednomianowy(Jednomianowy.Zawartość.zNapisu(ctx.addyt.getText()));
        for (var dz:ctx.wyrazenie()) {
            Jednomianowy dzw = (Jednomianowy) visit(dz);
            dzw.rodzic = wz;
            wz.dzieci.add(dzw);
        }
        return wz;
    }

    @Override
    public Jednomianowy visitWyrazenieMult(wyrParser.WyrazenieMultContext ctx) {
        Jednomianowy wz = new Jednomianowy(Jednomianowy.Zawartość.zNapisu(ctx.mult.getText()));
        for (var dz:ctx.wyrazenie()) {
            Jednomianowy dzw = visit(dz);
            dzw.rodzic = wz;
            wz.dzieci.add(dzw);
        }
        return wz;
    }

    @Override
    public Jednomianowy visitWyrazenieStala(wyrParser.WyrazenieStalaContext ctx) {
        return new Jednomianowy(null,0,Double.parseDouble(ctx.stala_atom().STALA().getText())).loc(ctx.start,ctx.stop);
    }

    @Override
    public Jednomianowy visitWyrazenieZmienna(wyrParser.WyrazenieZmiennaContext ctx) {
        return new Jednomianowy(ctx.zmienna().ZMIENNA().getText(),1,1.0).loc(ctx.start,ctx.stop);
    }
}
