package ms.proces.strumienie;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.function.Consumer;

import static java.lang.Double.NaN;

//reprezentuje strumien doubli (we/wy).
public class StrumieńZTablicą implements IStrumień{
    final int MAX = 100;
    public double[] tab = new double[MAX];
    int itr = 0;//do czytania
    int itw = 0;//do pisania

    public double czytaj()
    {
       return tab[itr++];
    }

    @Override
    public void poCzytaniu(Consumer<Double> zwrotne) {
        return;
    }

    @Override
    public void poKońcu(Consumer<Integer> zwrotne) {
        return;
    }

    public double czytaj_cyklicznie()
    {
        double tmp = tab[itr];
        itr = (itr + 1)%MAX;
        return tmp;
    }

    @Override
    public boolean synchronizuj() {
        return false;
    }

    public boolean czykoniec()
    {
        if(itr < MAX)
            return false;
        return true;
    }
    public double czytaj_lub_nan()
    {
        if(czykoniec())
            return NaN;
        return tab[itr++];
    }

    //true, jeśli da sie pisać
    public boolean pisz(double co)
    {
        if(itw >= MAX)
            return false;
        tab[itw++] = co;
        return true;
    }

    public void zapisz_plik(String nazwa) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(nazwa, false));
        for(int i = 0; i < itw; ++i)
        {
            writer.write(Double.toString(tab[i]));
            writer.write(" ");
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < itw; ++i)
        {
            sb.append(tab[i]).append(" ");
        }
        return sb.toString();
    }

    Scanner scanner;
    File plik;
    public StrumieńZTablicą(){}
    public StrumieńZTablicą(File plik_) throws IOException {
        plik = plik_;
        if(!plik.exists())
        {
            plik.createNewFile();
        }
        scanner = new Scanner(plik);
        while (scanner.hasNextDouble())
        {
            pisz(scanner.nextDouble());
        }
    }
    public StrumieńZTablicą(String dane) {
        scanner = new Scanner(dane);
        while (scanner.hasNextDouble())
        {
            pisz(scanner.nextDouble());
        }
    }

    public static void main(String[] args) {

    }
}
