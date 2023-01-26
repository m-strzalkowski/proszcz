package fitfunc;

import ms.gp.ewolucja.EvolutorAdapter;
import ms.gp.ewolucja.Ewolutor;
import ms.gp.przystosowanie.BasicFitnessFunction;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import static ms.drzewo.Definicje.PRAWDA;

public class BoolowskaLosowa extends BasicFitnessFunction {
    private static ArrayList<Double> expected_values = new ArrayList<>();
    boolean values_computed=false;
    int case_counter=0;
    PrintStream out = System.out;

    @Override
    public void set_adapter(EvolutorAdapter adapter) {
        super.set_adapter(adapter);
        try {
            out = new PrintStream(((Ewolutor)this.adapter.getInternalObject()).sciezka_pliku("function.csv").toAbsolutePath().toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public int set_fitness_cases(double[][] fitcases) {
        super.set_fitness_cases(fitcases);
        values_computed=true;
        case_counter=0;
        return 0;
    }
    @Override
    public double[] expected_output(double[] input) {
        var v = input;
        double[] t = new double[1];
        if(!values_computed){//losuje wartości tylko raz
            expected_values.add((Math.random()>=0.5)?1.0:-1.0);
            out.print("@"+case_counter+" ");
            out.print(Arrays.toString(input));
            out.println(expected_values.get(expected_values.size()-1));
        }
        t[0]=expected_values.get(case_counter);
        case_counter++;
        //System.err.println(t[0]);
        return t;
    }
}
