package fitfunc;

import ms.gp.przystosowanie.BasicFitnessFunction;

import static ms.drzewo.Definicje.PRAWDA;

public class Boolowska extends BasicFitnessFunction {

    @Override
    public double[] expected_output(double[] input) {
        var v = input;
        double[] t = new double[1];
        t[0]=(PRAWDA(v[0]) && PRAWDA(v[1]))?1.0:-1.0;
        //System.err.println(t[0]);
        return t;
    }
}
