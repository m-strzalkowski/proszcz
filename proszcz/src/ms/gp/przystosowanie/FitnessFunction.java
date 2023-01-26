package ms.gp.przystosowanie;

import ms.gp.ewolucja.EvolutorAdapter;
import ms.proces.strumienie.StrumieńWyjsciowy;

public interface FitnessFunction{
    void set_verbosity(boolean verbosity);
    void set_adapter(EvolutorAdapter adapter);
    int set_fitness_cases(double[][] fitcases);
    double compute_fitness_of_outputs_for_cases(double[][] outs,int[] outlens, int tree_size, int[] execution_times);
    //DocumentDistance+LongestSubstringMatching
}
