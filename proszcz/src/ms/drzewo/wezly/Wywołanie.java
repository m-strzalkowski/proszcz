package ms.drzewo.wezly;

import ms.bledy.wykonania.NieznanaNazwa;
import ms.drzewo.Węzeł;
import ms.interpreter.Silnik;
import ms.proces.Nazwa;

public class Wywołanie extends Węzeł {
    public int dziecimin(){return _dzmin;}
    public  int dziecimax(){return _dzmax;}
    private int _dzmin=0,_dzmax=4096;
    public void ustaw_arność(int min, int max){_dzmin=min;_dzmax=max;}
    String nazwa = null;
    public Wywołanie(String nazwa){this.nazwa=nazwa;}
    public Wywołanie(String nazwa, Węzeł[] dzieci){this.nazwa=nazwa; this.dzieci=dzieci;}
    @Override
    public double policz(Silnik s) {
        Nazwa n = s.aktualny().nazwy.get(this.nazwa);
        if(n==null){throw new NieznanaNazwa(this, nazwa);}
        //ewaluacja jest odpowiedzialnością Nazwy
        /*double[] wart_arg = null;//wartości argumentów
        if(dzieci!=null && dzieci.length >0)
        {
            //wczesna ewaluacja argumentów
            wart_arg = new double[dzieci.length];
            for(int i=0; i<wart_arg.length;i++)
            {
                wart_arg[i] = dzieci[i].policz(s);
            }
        }*/
        //Niech obiekt będący pod nazwą policzy odpowiedź, dostając niewyliczone jeszcze argumenty.
        return n.policz(s,dzieci);
    }
    @Override
    public String kodPodrzewa()
    {
        var sb = new StringBuilder(nazwa);
        if(dzieci!=null && dzieci.length>0)
        {
            sb.append("(");
            for(var dz : this.dzieci){sb.append(dz.kodPodrzewa()).append(",");}
            sb.deleteCharAt(sb.length()-1);//kasuje ostatni przecinek
            sb.append(");");
        }
        return sb.toString();
    }
    @Override
    public String txtRepr(){return nazwa+"(...)";}
}
