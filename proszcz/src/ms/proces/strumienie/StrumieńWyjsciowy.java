package ms.proces.strumienie;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.function.Consumer;

public class StrumieńWyjsciowy implements IStrumień {
    OutputStream os;
    public StrumieńWyjsciowy(OutputStream _os)
    {
        os=_os;
    }
    @Override
    public boolean pisz(double co) {
        try {
            //os.write( Double.toString(co).getBytes(StandardCharsets.UTF_8));
            os.write( ("WRITE("+Double.toString(co)+")").getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public double czytaj() {
        throw new RuntimeException("STREAM IS WRITE ONLY:"+os.toString());
    }

    @Override
    public void poCzytaniu(Consumer<Double> zwrotne) {
        throw new RuntimeException("STREAM IS WRITE ONLY:"+os.toString());
    }

    @Override
    public void poKońcu(Consumer<Integer> zwrotne) {
        throw new RuntimeException("??"+os.toString());
    }

    @Override
    public double czytaj_lub_nan() {
        throw new RuntimeException("STREAM IS WRITE ONLY:"+os.toString());
    }

    @Override
    public double czytaj_cyklicznie() {
        throw new RuntimeException("STREAM IS WRITE ONLY:"+os.toString());
    }

    @Override
    public boolean synchronizuj() {
        try {
            os.flush();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    /*
    scanner = new Scanner(dane);
        while (scanner.hasNextDouble())
    {
        pisz(scanner.nextDouble());
    }
    */

}
