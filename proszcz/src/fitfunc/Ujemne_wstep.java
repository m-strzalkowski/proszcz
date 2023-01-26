package fitfunc;

import ms.gp.przystosowanie.BasicFitnessFunction;

public class Ujemne_wstep extends BasicFitnessFunction {
    @Override
    public double[] expected_output(double[] input)
    {
        return input;
    }

    @Override
    public double score(double[] a, int alen, double[] b, int blen)
    {
        double len = alen;
        double acum = 0.0;
        if(len > blen)
        {
            acum = 5. * (len - blen);
            len = blen;
        }

        int i;
        for(i=0;i<len;i++)
        {
            if(a[i] < 0)
            {
                if(b[i] < 0)
                    acum += 3.;
                else if(b[i] == 0)
                    acum += 0.;
                else acum += 1.;
            }
            else if(a[i] != b[i])
                acum += 5.;
        }

        return acum;
    }
}
