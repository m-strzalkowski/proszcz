package fitfunc;

import ms.gp.przystosowanie.BasicFitnessFunction;

public class Dodawanie extends BasicFitnessFunction {
    @Override
    public double[] expected_output(double[] input)
    {
        double acum=0;int i;
        for(i=0;i<input.length;i++){acum+=input[i];}
        var ret = new double[1];
        ret[0]=acum;
        return ret;
    }
}
