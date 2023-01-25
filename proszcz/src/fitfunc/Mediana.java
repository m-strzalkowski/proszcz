package fitfunc;

import ms.gp.przystosowanie.BasicFitnessFunction;

public class Mediana extends BasicFitnessFunction {
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
}