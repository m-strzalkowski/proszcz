package ms.drzewo.wezly;

import ms.drzewo.Węzeł;
import ms.interpreter.Silnik;
import ms.proces.strumienie.IStrumień;

import static ms.drzewo.Definicje.NUMER_DESKRYPTORA_STANDARDOWEGO_WYJŚCIA;

public class Pisz extends Węzeł {
    public int dziecimin(){return 1;}
    public  int dziecimax(){return 2;}
    public double waga_domyślna(){return 2.0;}
    @Override
    public double policz(Silnik silnik) {
        if(dzieci == null){kontrola();}
        int nr_out=NUMER_DESKRYPTORA_STANDARDOWEGO_WYJŚCIA;
        if(dzieci.length>1){nr_out = (int)dzieci[1].licz(silnik);}
        IStrumień out= silnik.aktualny().daj_deskryptor(nr_out);
        double co=dzieci[0].licz(silnik);
        out.pisz(co);
        return co;
    }
    @Override
    public String kodPodrzewa()
    {
        var sb=new StringBuilder("write");
        if(dzieci!=null&& dzieci.length>0)
        {
            sb.append("(");
            for (var d:dzieci) {
                sb.append(d.kodPodrzewa());
                sb.append(',');
            }
            sb.deleteCharAt(sb.length()-1);//usuwa ostatni przecinek
            sb.append(")");
        }
        return sb.toString();
    }
    @Override
    public String txtRepr(){return "write";}
}
