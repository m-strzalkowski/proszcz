package fitfunc;

import ms.gp.przystosowanie.BasicFitnessFunction;

import static java.lang.Math.abs;

public class Ujemne extends BasicFitnessFunction {//ujemne zamienia na zero
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

    @Override
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
            if(shorter[i] != longer[i])
                acum += 5.;
        }
        //for(;i<llen;i++){acum+=abs(longer[i]);}
        return acum;
    }
}
