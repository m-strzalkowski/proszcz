package ms.drzewo.wezly;

import ms.Tablice;
import ms.drzewo.Jednomianowy;
import ms.drzewo.Węzeł;
import ms.interpreter.Silnik;

import static java.lang.Double.NaN;

public class BinarneArytm extends Węzeł {
    public int dziecimin(){return 2;}
    public int dziecimax(){return 2;}
    public BinarneArytm(char znak){this.znak=znak;}
    char znak='+';
    @Override
    public double policz(Silnik s) {
        double akum;
        int i = 0;
        switch (znak) {
            case '+':
                akum = 0.0;
                for (var d : dzieci) {
                    akum += d.licz(s);
                }
                return akum;
            case '-':
                akum = NaN;
                if (dzieci.length > 0) {
                    akum = dzieci[0].licz(s);
                }
                for (i = 1; i < dzieci.length; i++) {
                    akum -= dzieci[i].licz(s);
                }
                return akum;
            case '*':
                akum = 1.0;
                for (Węzeł d : dzieci) {
                    double x = d.licz(s);
                    akum *= x;
                    //System.err.println("|"+x+","+akum+"|");
                }
                //if(Double.isNaN(akum)){System.err.println("@NAN@"+internalRepr());}
                return akum;
            case '/':
                akum = NaN;
                if (dzieci.length > 0) {
                    akum = dzieci[0].licz(s);
                }
                for (i = 1; i < dzieci.length; i++) {
                    double mianownik = dzieci[i].licz(s);
                    if (Math.abs(mianownik) <= Tablice.PRÓG_DZIWNODZIELENIA)// 0.001 )
                    {
                    }//pomiń dzielenie
                    else {
                        akum /= mianownik;
                    }
                }
                return akum;
            default:
                throw new RuntimeException("węzeł binarny z arytmetyką:nieznany typ operacji:" + znak);
        }
    }
    @Override
    public String kodPodrzewa()
    {
        //var sb = new StringBuilder("");
        //for(var dz : this.dzieci){sb.append(dz.kodPodrzewa()).append(",");}
        //sb.append("");
        //return sb.toString();
        if(znak=='-'){return "("+dzieci[0].kodPodrzewa()+znak+' '+dzieci[1].kodPodrzewa()+")";}//problem z (-84.9-76.9); STALA,STALA a nie STALA MINUS STALA
        return "("+dzieci[0].kodPodrzewa()+znak+dzieci[1].kodPodrzewa()+")";
    }
    @Override
    public String txtRepr(){return ""+znak;}
}
