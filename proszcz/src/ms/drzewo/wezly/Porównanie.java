package ms.drzewo.wezly;

import ms.Tablice;
import ms.bledy.wykonania.NieznanaNazwa;
import ms.bledy.wykonania.NieznanaOperacja;
import ms.drzewo.Węzeł;
import ms.interpreter.Silnik;

import static java.lang.Double.NaN;
import static java.lang.Math.abs;

public class Porównanie extends Węzeł {
    public int dziecimin(){return 2;}
    public  int dziecimax(){return 2;}
    public Porównanie(char znak){this.znak=znak;}
    public Porównanie(Węzeł lewy, Węzeł prawy){dzieci=new Węzeł[]{lewy,prawy};}
    char znak='~';
    @Override
    public double policz(Silnik s) {
        double akum;
        int i = 0;
        double l=dzieci[0].licz(s),r=dzieci[1].licz(s), rozn=l-r,a=abs(rozn);
        switch (znak) {
            case '~':
                 if(a<s.aktualny().DOKLADNOSC_POROWNANIA){return a;}else{return -a;}
            case '!':
                if(a>=s.aktualny().DOKLADNOSC_POROWNANIA){return a;}else{return -a;}
            case '<':
                if(l<r) {return a;}else {return -a;}
            case '>':
                if(l>r) {return a;}else {return -a;}
            default:
                throw new NieznanaOperacja(this,"porównanie:nieznany rodzaj:" + znak);
        }
    }
    /*konwersja z ~=,~!=,>,< z gramatyki do wewnęrznej reprezentacji i z powrotem*/
    public static String typOp_ze_znaku(char znak){
        return switch (znak){
            case '~' -> "~=";
            case '!' -> "!~=";
            case '<' -> "<";
            case '>' -> ">";
            default -> throw new IllegalStateException("Unexpected value: " + znak);
        };
    }
    public static char znak_z_typuOp(String op)
    {
        return switch (op){
            case "~="->'~' ;
            case  "!~="-> '!' ;
            case   "<" ->'<';
            case   ">" ->'>';
            default -> throw new IllegalStateException("Unexpected value: " + op);
        };
    }
    @Override
    public String kodPodrzewa()
    {
        return "("+dzieci[0].kodPodrzewa()+typOp_ze_znaku(znak)+dzieci[1].kodPodrzewa()+")";
    }
    @Override
    public String txtRepr(){return typOp_ze_znaku(znak);}
}
