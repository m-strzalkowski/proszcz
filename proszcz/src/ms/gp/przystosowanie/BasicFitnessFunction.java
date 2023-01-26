package ms.gp.przystosowanie;

import static java.lang.Math.abs;

public abstract class BasicFitnessFunction implements FitnessFunction{
    private double[][] fitcases=null;
    private double [][] expected_outputs=null;
    private boolean verbosity = false;
    public abstract double[] expected_output(double[] input);
    public void set_verbosity(boolean verbosity){this.verbosity=verbosity;}
    void calculate_expected_outputs()
    {
        expected_outputs = new double[fitcases.length][];
        for(int i=0;i<fitcases.length;i++)
        {
            expected_outputs[i] = expected_output(fitcases[i]);
        }
    }
    @Override
    public int set_fitness_cases(double[][] fitcases) {
        this.fitcases = fitcases;
        calculate_expected_outputs();
        return 0;
    }

    public abstract double score(double[] a, int alen, double[] b, int blen);

    double simple_vector_distance(double[] a, int alen, double[] b, int blen) {
        return score(a, alen, b, blen);
        /*
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
        */

    }
    double square_vector_distance(double[] a, int alen, double[] b, int blen) {
        double[] shorter = alen<=blen?a:b;
        double[] longer = alen>blen?a:b;
        int slen = Math.min(alen, blen);
        int llen = Math.max(alen, blen);
        double acum = 0.0;
        int i;
        for(i = 0; i < slen; i++)
        {
            double r = shorter[i]-longer[i];
            acum+=r*r;
        }
        for(; i < llen; i++)
        {
            acum += longer[i] * longer[i];
        }
        return acum;
    }


    double fitness_of_single_case(int index, double[] out,int outlen)
    {
        if(verbosity) {
            System.out.format("case:%d\n", index);
            System.out.print("\ninputs:");for (int i = 0; i < fitcases[index].length; i++) {System.out.format("%f ", fitcases[index][i]);}
            System.out.print("\nexpect:");for (int i = 0; i < expected_outputs[index].length; i++) {System.out.format("%f ", expected_outputs[index][i]);}
            System.out.format("\noutput[%d]:",outlen);for (int i = 0; i < outlen; i++) {System.out.format("%f ", out[i]);}
        }
        double fit = simple_vector_distance(expected_outputs[index],expected_outputs[index].length, out,outlen);
        if(verbosity)System.out.format("\nfitness for case %d:%f\n",index,fit);
        return fit;
    }


    double fitness_as_mean(double[][] outs, int[]outlens)
    {
        double acum=0.0;
        for(int i=0;i<fitcases.length;i++)
        {
            double v = fitness_of_single_case(i,outs[i],outlens[i]);
            acum+=v;
        }
        return acum/fitcases.length;
    }
    @Override
    public double compute_fitness_of_outputs_for_cases(double[][] outs,int[] outlens, int tree_size, int[] execution_times) {
        if(verbosity) System.out.format("CASE:%d outs\n",outs.length);
        double computed_fitness = fitness_as_mean(outs,outlens);
        if(tree_size>100) {computed_fitness *= tree_size/100.0;}
        if(!Double.isFinite(computed_fitness)) {computed_fitness = Double.MAX_VALUE;}
        if(verbosity) System.out.format("FITNESS:%f\n",computed_fitness);
        return computed_fitness;
    }
}
