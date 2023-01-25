package ms.proces.strumienie;

import java.io.InputStream;
import java.util.Scanner;
import java.util.function.Consumer;

import static ms.Tablice.SHARED_STDIN_SCANNER;

public class StrumieńWejściowy implements IStrumień {
    InputStream in;
    Scanner scanner;
    /*public StrumieńWejściowy(InputStream in) {
        this.in = in;
        scanner = new Scanner(in);
    }*/
    public StrumieńWejściowy(Scanner scanner)
    {
        if(scanner==null){this.scanner=SHARED_STDIN_SCANNER();}
        else{this.scanner=scanner;}
    }
    @Override
    public boolean pisz(double co) {
        throw new RuntimeException("STREAM IS READ ONLY:"+in.toString());
    }

    @Override
    public double czytaj()
    {
        //System.out.print("type a double>");
        return scanner.nextDouble();
        //if (scanner.hasNextDouble())
        //{
        //    return scanner.nextDouble();
        //}
        //else throw
    }

    @Override
    public void poCzytaniu(Consumer<Double> zwrotne) {
        throw new RuntimeException("not yet");
    }

    @Override
    public void poKońcu(Consumer<Integer> zwrotne) {
        throw new RuntimeException("not yet");
    }

    @Override
    public double czytaj_lub_nan() {
        System.out.print("type a double>");
        if (scanner.hasNextDouble())
        {
            return scanner.nextDouble();
        }
        else return Double.NaN;
    }

    @Override
    public double czytaj_cyklicznie() {
        throw new RuntimeException("Not iplemented yet");
    }

    @Override
    public boolean resetuj() {
        return false;
    }

    @Override
    public boolean synchronizuj() {
        return true;
    }
}
