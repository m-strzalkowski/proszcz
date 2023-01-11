package ms.drzewo.wezly;

import ms.drzewo.Węzeł;
import ms.interpreter.Silnik;
import ms.proces.Nazwa;
import ms.proces.Zmienna;

public class Przypisanie extends Węzeł {
    public int dziecimin(){return 2;}
    public  int dziecimax(){return 2;}
    public Przypisanie(){}
    @Override
    public double policz(Silnik s) {
        var p = s.aktualny();
        Węzeł lewe = dzieci[0];
        if(lewe instanceof Adres)
        {
            Adres a = (Adres) lewe;
            lewe.licz(s);
            Nazwa n =  s.adres;
            s.adres=null;
            if(n instanceof Zmienna)
            {
                Zmienna z = (Zmienna) n;
                return z.zmutuj(dzieci[1].licz(s));
            }
            else{
                System.err.println(n);
                throw new RuntimeException("Name "+a.nazwa+" in given context is not a Variable,thus cannot be modified.");
            }
        }
        //System.err.println("PZYPISANIE DOANONIMOWEGO");
        /*
        if(lewe instanceof Wywołanie)
        {
            Wywołanie w = (Wywołanie) lewe;
            Nazwa n =  s.aktualny().nazwy.get(w.nazwa);
            if(n instanceof Zmienna)
            {
                Zmienna z = (Zmienna) n;
                z.zmutuj(dzieci[1].licz(s));
            }
            else{
                throw new RuntimeException("Name "+w.nazwa+" in given context is not a Variable,thus cannot be modified.");
            }
        }
        */

        return p.pam[p.indeks_pam(dzieci[0].licz(s))] = dzieci[1].licz(s);
    }
    @Override
    public String kodPodrzewa()
    {
        var sb = new StringBuilder("("+dzieci[0].kodPodrzewa());
        sb.append(":=");
        sb.append(dzieci[1].kodPodrzewa());
        sb.append(")");
        return sb.toString();

    }
    @Override
    public String txtRepr(){return ":=";}
}
