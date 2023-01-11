package ms.drzewo.operacje;

import ms.Tablice;
import ms.bledy.SemanticOccurence;
import ms.drzewo.Węzeł;
import ms.drzewo.operacje.losowe.IPodawaczDrzew;
import ms.drzewo.operacje.losowe.IPodawaczWęzłów;
import ms.drzewo.operacje.losowe.PodawaczDrzew;
import ms.interpreter.Silnik;
import ms.interpreter.Środowisko;
import ms.parser.proszczBaseVisitor;
import ms.parser.proszczParser;
import ms.proces.Nazwa;
import ms.proces.Proces;

import java.util.Arrays;

import static ms.Tablice.pokazywanie;
import static ms.drzewo.Definicje.BFS;
import static ms.drzewo.Definicje.DFS;
import static ms.drzewo.operacje.losowe.RóżneLosowe.węzeł_o_numerze_przy_przeszukiwaniu_wszerz;
import static ms.interpreter.Środowisko.*;

public class WykonywaczDodatków  extends proszczBaseVisitor<Integer> {
    private  Silnik silnik=null;
    private IPodawaczWęzłów los=null;
    public WykonywaczDodatków(Silnik silnik,IPodawaczWęzłów podawacz)
    {
        this.silnik=silnik;
        this.los=podawacz;
    }

    @Override
    public Integer visitDodatek(proszczParser.DodatekContext ctx) {
        visitChildren(ctx);
        return 0;
    }

    @Override
    public Integer visitPokaz_generatory(proszczParser.Pokaz_generatoryContext ctx) {
         silnik.out.println(los.toString());
         return 0;
    }

    @Override
    public Integer visitWaga(proszczParser.WagaContext ctx) {
        double waga =  ((int)Double.parseDouble(ctx.STALA().getText()));
        Double min=null;
        Double max=null;
        Integer roundexp = null;
        if(ctx.atrybut_wagi()!=null)
        {
            for(var at:ctx.atrybut_wagi())
            {
                double wartosc = Double.parseDouble(at.STALA().getText());
                switch(at.typ.getText())
                {
                    case "min": min=wartosc;break;
                    case "max": max=wartosc;break;
                    case "roundexp": roundexp=(int)wartosc;break;
                }
            }
        }
        for(var des:ctx.desygnat_wagi())
        {
            double polimorf = des.STALA()!=null?Double.parseDouble(ctx.STALA().getText()):0;//moze istniec kilka wersji jednego elelmentu języka
            //double polimorf = ctx.wartosc().STALA()!=null?Double.parseDouble(ctx.wartosc().STALA().getText()):0;//moze istniec kilka wersji jednego elelmentu języka
            String id = null;
            if(des.NAPIS_DOSL()!=null) {id = des.NAPIS_DOSL().getText().substring(1,des.NAPIS_DOSL().getText().length()-1);}
            else if(des.NAZWA()!=null){id = des.NAZWA().getText();}
            String nazwa_polimorfa =id+"["+(int)polimorf+"]";
            var gen = podst_generatory.get(id);
            if(polimorf>1)
            {
                System.err.println("REGISTER A POLYMORPHISM OF ELEMENT ALREADY PRESENT:"+id+polimorf);
                if(!domyślny_podawacz.zarejestrowane(nazwa_polimorfa)){
                    domyślny_podawacz.duplikuj(id,nazwa_polimorfa);
                }
                id=nazwa_polimorfa;
            }
            if(des.NAPIS_DOSL()!=null)
            {
                System.err.println("REGISTER NODE:"+id);

                if(gen==null){silnik.out.println("AVAILABLE BUILT IN NAMES:\n"); for(var g:podst_generatory.keySet()){silnik.out.print(g+",");} throw new RuntimeException("There is no node generator with such name:"+id);}
                domyślny_podawacz.mutuj(id,waga,min,max,min,max,roundexp);
            }
            else if(des.NAZWA()!=null)
            {
                System.err.println("REGISTER CALL:"+id);

                if(!domyślny_podawacz.zarejestrowane(id))
                {
                    if(gen!=null){Tablice.podsystem_bledow.zglosZdarzenie(new SemanticOccurence(
                            SemanticOccurence.Level.WARN,
                            des.NAZWA().getSymbol(),
                            "You attempted to register a weight of call of name '"+id+"' but standard generator is for it defined. (Probably because it is a language keyword.) Therefore, only weight and other parameters shall be changed."
                    ));}
                    else{
                        domyślny_podawacz.rejestruj(generator_generatorów_wywołań_nazwy(id),id);
                    }
                }
                domyślny_podawacz.mutuj(id,waga,min,max,min,max,roundexp);

            }
            domyślny_podawacz.przelicz();
        }
        return 0;
    }

    @Override
    public Integer visitWezel_dod(proszczParser.Wezel_dodContext ctx) {
        Węzeł w;
        if(ctx.par_dod()!=null)
        {
            w = los.węzeł(ctx.par_dod().size()>0?Double.parseDouble( ctx.par_dod(0).STALA().getText()):null,
                    ctx.par_dod().size()>1?Double.parseDouble( ctx.par_dod(1).STALA().getText()):null);
        }else{w=los.węzeł(null,null);}
        silnik.out.println(w.txtRepr());
        //if(pokazywanie){EksportDrzewa.graphviz(w);}
        return 0;
    }

    @Override
    public Integer visitNieterm_dod(proszczParser.Nieterm_dodContext ctx) {
        Węzeł w;
        if(ctx.par_dod()!=null)
        {
            w = los.nieterminal(ctx.par_dod().size()>0?Double.parseDouble( ctx.par_dod(0).STALA().getText()):null,
                    ctx.par_dod().size()>1?Double.parseDouble( ctx.par_dod(1).STALA().getText()):null);
        }else{w=los.nieterminal(null,null);}
        silnik.out.println(w.txtRepr());
        //if(pokazywanie){EksportDrzewa.graphviz(w);}
        return 0;
    }

    @Override
    public Integer visitTerm_dod(proszczParser.Term_dodContext ctx) {
        Węzeł w;
        if(ctx.par_dod()!=null)
        {
            w = los.terminal(ctx.par_dod().size()>0?Double.parseDouble( ctx.par_dod(0).STALA().getText()):null,
                    ctx.par_dod().size()>1?Double.parseDouble( ctx.par_dod(1).STALA().getText()):null);
        }else{w=los.terminal(null,null);}
        silnik.out.println(w.txtRepr());
        //if(pokazywanie){EksportDrzewa.graphviz(w);}
        return 0;
    }


    @Override
    public Integer visitGeneracja(proszczParser.GeneracjaContext ctx) {
        IPodawaczDrzew drzeworób = new PodawaczDrzew(Środowisko.domyślny_podawacz);
        Węzeł drzewo;
        if(ctx.typ.getText() == "full"){drzewo=drzeworób.full((int)Double.parseDouble(ctx.glebokosc().STALA().getText()));}
        else{drzewo=drzeworób.grow((int)Double.parseDouble(ctx.glebokosc().STALA().getText()));}
        return wsadz_drzewo_do_procesu_o_nazwie(drzewo, ctx.cel_dodatku());
    }

    private Węzeł proboj_znalezc_drzewo_w_procesie(String nazwa,String fmt_porazka)
    {
        Nazwa n =silnik.główny.nazwy.get(nazwa);
        if(n instanceof Proces)
        {
            return ((Proces) n).drzewo;

        }
        else silnik.out.printf(fmt_porazka,nazwa);
        return null;
    }

    @Override
    public Integer visitMutacja(proszczParser.MutacjaContext ctx) {
        IPodawaczDrzew drzeworób = new PodawaczDrzew(Środowisko.domyślny_podawacz);
        Węzeł a = proboj_znalezc_drzewo_w_procesie(ctx.zrodlo_dodatku().NAZWA().getText(),"Could not extract tree from name %s because it is not a process.\n");
        proszczParser.Poz_dodatekContext pd =null;
        Integer a_poz = ((pd=ctx.poz_dodatek())!=null) ? Integer.parseInt(pd.STALA().getText()) : null;
        int maks_gl = Integer.parseInt(ctx.glebokosc().STALA().getText());
        Węzeł drzewo;
        if(a==null){silnik.out.print("failed."); return 1;}
        switch(ctx.typ.getText())
        {
            case "s":
            case "subtree":
                drzewo = drzeworób.mutation_subtree(a,maks_gl,a_poz);
                break;
            default:
                silnik.out.println("mutate:unknown prefix:"+ctx.typ.getText());
                return 1;
        }
        return wsadz_drzewo_do_procesu_o_nazwie(drzewo, ctx.cel_dodatku());
    }

    @Override
    public Integer visitKrzyzowanie(proszczParser.KrzyzowanieContext ctx) {
        IPodawaczDrzew drzeworób = new PodawaczDrzew(Środowisko.domyślny_podawacz);
        //Ekstrakcja argumentów
        Węzeł a = proboj_znalezc_drzewo_w_procesie(ctx.krzyzowanie_arg(0).NAZWA().getText(),"Could not extract tree from name %s because it is not a process.\n");
        proszczParser.Poz_dodatekContext pd =null;
        Integer a_poz = (pd=ctx.krzyzowanie_arg(0).poz_dodatek())!=null? Integer.parseInt(pd.STALA().getText()):null;

        Węzeł b = proboj_znalezc_drzewo_w_procesie(ctx.krzyzowanie_arg(1).NAZWA().getText(),"Could not extract tree from name %s because it is not a process.\n");
        Integer b_poz = (pd=ctx.krzyzowanie_arg(1).poz_dodatek())!=null? Integer.parseInt(pd.STALA().getText()):null;

        if(a==null || b==null){silnik.out.println("Execution of 'cross' command thwarted by inability to find tree(s) in a process(es) with specified names."); return 1;}

        Węzeł drzewo = drzeworób.cross_dcpy(a,a_poz,b,b_poz);
        return wsadz_drzewo_do_procesu_o_nazwie(drzewo, ctx.cel_dodatku());
    }

    private Integer wsadz_drzewo_do_procesu_o_nazwie(Węzeł drzewo, proszczParser.Cel_dodatkuContext cel_dodatkuContext) {
        silnik.out.println(drzewo.kodPodrzewa());
        if(pokazywanie){
            EksportDrzewa.graphviz(drzewo);}
        if(cel_dodatkuContext !=null)
        {
            String nazwa = cel_dodatkuContext.NAZWA().getText();
            Nazwa n =silnik.główny.nazwy.get(nazwa);
            if(n instanceof Proces)
            {
                ((Proces) n).drzewo = drzewo;
                silnik.out.println("Swapped tree in "+nazwa);
                return 0;
            }
            else silnik.out.println("Could not swap tree in "+nazwa+" because it is not a process.");
        }
        return 1;
    }

    @Override
    public Integer visitKopiowanie_dod(proszczParser.Kopiowanie_dodContext ctx) {
        IPodawaczDrzew drzeworób = new PodawaczDrzew(Środowisko.domyślny_podawacz);
        //Ekstrakcja argumentów
        //Ekstrakcja argumentów
        Węzeł a = proboj_znalezc_drzewo_w_procesie(ctx.NAZWA().getText(),"Could not extract tree from name %s because it is not a process.\n");
        proszczParser.Poz_dodatekContext pd =null;
        Integer a_poz = (pd=ctx.poz_dodatek())!=null? Integer.parseInt(pd.STALA().getText()):null;
        if(a==null){silnik.out.println("Execution of 'dcpy' command thwarted by inability to find tree(s) in a process(es) with specified names."); return 1;}
        //System.out.println("deepcopy("+a+","+a_poz+")");
        Węzeł drzewo = drzeworób.deepcopy(a,a_poz);
        return wsadz_drzewo_do_procesu_o_nazwie(drzewo, ctx.cel_dodatku());
    }

    @Override
    public Integer visitPokoloruj(proszczParser.PokolorujContext ctx) {
        long col=0;
        if(ctx.KOLOR_HTML()!=null)
        {
            col = Integer.parseInt(ctx.KOLOR_HTML().getText().substring(1),16);
        }
        if(ctx.KOLOR_HTML_KROTKI()!=null)
        {
            String s = ctx.KOLOR_HTML_KROTKI().getText().substring(1);
            char[] bytes = new char[s.length()*2];
            for(int i=0;i<s.length();i++){bytes[2*i]=bytes[2*i+1]=s.charAt(i);}
            col = Integer.parseInt(new String(bytes),16);

        }
        for(var t : ctx.NAZWA())
        {
            Nazwa n = silnik.główny.nazwy.get(t.getText());
            if(n==null || !(n instanceof Proces))
            {
                Tablice.podsystem_bledow.zglosZdarzenie(new SemanticOccurence(SemanticOccurence.Level.ERROR,ctx.start,ctx.start.getLine(),ctx.start.getCharPositionInLine(),
                        "Name is null or not a Process"));
            }
            else{
                Proces p = (Proces) n;
                long finalCol = col;
                if(ctx.poz_dodatek()!=null)
                {
                    Węzeł w = węzeł_o_numerze_przy_przeszukiwaniu_wszerz(p.drzewo,(int)Double.parseDouble(ctx.poz_dodatek().STALA().getText()));
                    System.out.println("AT"+(int)Double.parseDouble(ctx.poz_dodatek().STALA().getText())+"..."+w);
                    if(w!=null)w.kolor = col;
                }
                else{
                    //pokoloruj drzewo
                    BFS(p.drzewo,(x)->{x.kolor= finalCol; return x;},false);
                }
            }
        }
        return 0;
    }
}
