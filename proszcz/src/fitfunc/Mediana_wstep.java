package fitfunc;

import ms.gp.przystosowanie.BasicFitnessFunction;

import static java.lang.Math.abs;

public class Mediana_wstep extends BasicFitnessFunction {
    @Override
    public double[] expected_output(double[] input)
    {
        return input;
    }
    @Override
    public double score(double[] a, int alen, double[] b, int blen)
    {
        if(b.length == 0)
            return 1.;

        if(a[0] == b[0])
            return 0.;
        if(a[1] == b[0])
            return 0.;
        if(a[2] == b[0])
            return 0.;
        return 1.;
    }
}
