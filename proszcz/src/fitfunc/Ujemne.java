package fitfunc;

import ms.gp.przystosowanie.BasicFitnessFunction;

public class Ujemne extends BasicFitnessFunction {
    @Override
    public double[] expected_output(double[] input)
    {
        var ret = new double[input.length];
        for(int i = 0; i < input.length; ++i) {
            var x = input[i];
            if (x < 0)
                ret[i] = 0;
            ret[i] = x;
        }
        return ret;
    }
}
