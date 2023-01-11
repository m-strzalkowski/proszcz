package ms.drzewo;

import org.antlr.v4.runtime.Token;

import java.util.LinkedList;
import java.util.List;

import static java.lang.Math.abs;

/*
Odpowiada węzłowi drzewa składniowego programu. W przeciwienstwie do drzewa produkowanego przez antlr, zakłada się tu mutowalmość tego konstruktu.
 */
public class Jednomianowy {
    public Jednomianowy rodzic=null;
    public List<Jednomianowy> dzieci=new LinkedList<>();//TODO ZAMIENIĆ NA TABLICĘ

    public Zawartość zawartość=Zawartość.JEDNOMIAN;
    public String nazwaFunkcji=null;
    //kodowanie jednomianu
    public String zm=null;//nazwa zmiennej
    public int st=0;//stopień jednomianu
    public double wt=.0;//wartość współczynnika przed zmienną

    public Token start=null;
    public Token stop=null;
    public Jednomianowy loc(Token start, Token stop){this.start=start;this.stop=stop;return this;}

    public Jednomianowy(Zawartość z) {
        zawartość=z;
    }

    public Jednomianowy(String nazwaFunkcji) {
        this.nazwaFunkcji = nazwaFunkcji;
        zawartość=Zawartość.FUNKCJA;
    }

    public Jednomianowy(String zm, int st, double wt) {
        this.zm = zm;
        this.st = st;
        this.wt = wt;
        zawartość=Zawartość.JEDNOMIAN;
    }

    public String kodPodrzewa()
    {
        switch(zawartość){
            case FUNKCJA: {
                return nazwaFunkcji+ "( "+dzieci.get(0).kodPodrzewa()+" )";
            }
            case JEDNOMIAN:{
                if(zm==null || st==0)
                {
                    return ""+wt;
                }
                else{
                    var znak = (st>0)?("*"):("/");
                    String środek;
                    if(wt==1 && st>0){środek=""+zm;}
                    else{
                        środek = "("+wt+znak+zm+")";
                    }

                    return "(".repeat(abs(st)-1)+środek+(znak+zm+")").repeat(abs(st)-1);
                }
            }
            case PLUS,RAZY,DZIEL,MINUS:{
                return "( "+dzieci.get(0).kodPodrzewa()+" "+zawartość+" "+dzieci.get(1).kodPodrzewa()+" )";
            }
            default:{return "(???)";}
        }
    }
    public String txtRepr(){
        return switch (zawartość){
            case FUNKCJA -> this.nazwaFunkcji;
            case JEDNOMIAN -> ""+wt+((zm==null)?(""):(zm+((st==1)?(""):("^"+st))));
            default -> zawartość.toString();
        };
    }
    public String internalRepr(){return "["+zawartość+ "]("+zm+","+st+","+wt+")";}
    public String dotId(){return "N"+System.identityHashCode(this);}
    public String dotRepr()
    {
        StringBuilder sb = new StringBuilder();
        for (var dz:dzieci) {
            sb.append(this.dotId());
            sb.append(" -> ");
            sb.append(dz.dotId());
            sb.append(";\n");
        }
        sb.append(this.dotId());
        sb.append("[label=\"");
        sb.append(this.txtRepr());
        sb.append("\"];\n");
        return sb.toString();
    }

    public enum Zawartość{
        JEDNOMIAN(1), PLUS(2),MINUS(3),RAZY(4),DZIEL(5),FUNKCJA(6);
        private final Integer numerek;

        Zawartość(Integer numerek) {
            this.numerek = numerek;
        }
        public String toString()
        {
            return switch (numerek) {
                case 1 -> "JEDNOMIAN";
                case 2 -> "+";
                case 3 -> "-";
                case 4 -> "*";
                case 5 -> "/";
                case 6 -> "FUNKCJA";
                default -> "?";
            };
        }

        public static Zawartość zNapisu(String napis)
        {
            return switch (napis) {
                case "+", "PLUS" -> PLUS;
                case "-", "MINUS" -> MINUS;
                case "*", "RAZY" -> RAZY;
                case "/", "DZIEL" -> DZIEL;
                case "fun", "FUNKCJA" -> FUNKCJA;
                case "JEDNOMIAN" -> JEDNOMIAN;
                default -> throw new RuntimeException("Napisu \""+napis+"\" nie da się przekonwertować do typu Zawartość");
            };
        };
    }
}
