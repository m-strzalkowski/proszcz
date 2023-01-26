package fitfunc;

import ms.gp.przystosowanie.BasicFitnessFunction;

import static java.lang.Math.abs;

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
    public double score(double[] a, int alen, double[] b, int blen)
    {
        double[] shorter = alen<=blen?a:b;
        double[] longer = alen>blen?a:b;
        int slen = alen<=blen?alen:blen;
        int llen = alen>blen?alen:blen;
        double acum = 0.0;
        int i;
        for(i=0;i<slen;i++)
        {
            acum+=abs(shorter[i]-longer[i]);
        }
        for(;i<llen;i++){acum+=abs(longer[i]);}
        return acum;
    }
}
