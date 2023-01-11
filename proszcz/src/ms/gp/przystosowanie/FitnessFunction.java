package ms.gp.przystosowanie;

import ms.proces.strumienie.StrumieńWyjsciowy;

public interface FitnessFunction{
    double compute_fitness_of_outputs_for_cases(double[][] outs);
    //DocumentDistance+LongestSubstringMatching
}
