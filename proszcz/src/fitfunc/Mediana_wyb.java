package fitfunc;

import ms.gp.przystosowanie.BasicFitnessFunction;

public class Mediana_wyb extends BasicFitnessFunction {
public class Mediana extends BasicFitnessFunction {//mediana trzech
    @Override
    public double[] expected_output(double[] input)
    {
        double a = Math.min(input[0], input[1]);
        double b = Math.min(input[2], input[1]);
        double c = Math.min(input[2], input[0]);

        double d = Math.max(a,b);
        double e = Math.max(c,d);

        var ret = new double[1];
        ret[0]=e;
        return ret;
    }

    @Override
    public double score(double[] a, int alen, double[] b, int blen)
    {
        if(alen == 0 || blen == 0)
            return 5.;
        if(a[0] == b[0])
            return 0.;
        return 1.;
    }
}