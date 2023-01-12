package ms.gp.ewolucja;

import ms.drzewo.Węzeł;
import ms.gp.przypadki.ZarządcaPrzypadków;

import java.io.PrintStream;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

import static java.lang.StrictMath.abs;
import static ms.gp.ewolucja.ZarządcaOperatorów.OperatorGenetyczny.*;

public class ZarządcaOperatorów {
    public double NIEDUZO = 0.0001;
    private Map<OperatorGenetyczny,Double> prawdopodobieństwa = new HashMap<>(
            Map.of(
                    CROSS,          0.8,
                    SIMPLE_MUTATE,  0.15,
                    TRANSFER,       0.05
                    )
    );
    private double[] kumulatywna = null;//do jakiej wartości ma byc losowane operatory[i]
    private OperatorGenetyczny[] operatory = null;
    private SplittableRandom generator = new SplittableRandom(System.currentTimeMillis() / 1000L);
    public void pisz(PrintStream wy)
    {
        wy.println("= GENETIC OPERATORS =");
        wy.println("no\tproability\tname");
        for(int i=0;i<kumulatywna.length;i++)
        {
            wy.format("%d %4f %4f %s\n",i,prawdopodobieństwa.get(operatory[i]),kumulatywna[i],operatory[i].toString());
        }
        wy.format("=  %d GENETIC OPERATORS ACTIVE =",operatory.length);
    }
    public boolean ustaw(String nazwa_operatora, double prowdopodob)
    {
        OperatorGenetyczny op = zNapisu(nazwa_operatora,NIEROZPOZNANY);
        if(op==NIEROZPOZNANY){return false;}
        prawdopodobieństwa.put(op,prowdopodob);
        buduj_prawdopodobieństwa();
        return true;
    }
    public Double odczytaj(String nazwa_operatora){return prawdopodobieństwa.get(zNapisu(nazwa_operatora,NIEROZPOZNANY));}
    public void buduj_prawdopodobieństwa()
    {
        //var v = prawdopodobieństwa.entrySet().toArray(new Map.Entry<OperatorGenetyczny,Double>[0]);
        var posortowane = prawdopodobieństwa.entrySet().stream()
                .sorted(Comparator.comparing(Map.Entry::getValue, Comparator.reverseOrder()))
                .filter(c -> abs(c.getValue())> NIEDUZO)
                /*.map(Map.Entry::getKey)*/.collect(Collectors.toList());
        kumulatywna = new double[posortowane.size()];
        operatory = new OperatorGenetyczny[posortowane.size()];
        double wartosc,akumulator=0; int i=0;
        for (var elem:posortowane) {
            akumulator+=elem.getValue();
            kumulatywna[i]=akumulator;
            operatory[i] = elem.getKey();
            i++;
        }
        if(abs(akumulator-1.0)>NIEDUZO)
        {
            for(i=0;i<kumulatywna.length;i++)
            {kumulatywna[i]/=akumulator;}
        }
        kumulatywna[kumulatywna.length-1]=1.0;
    }
    /**
     * @return
     */
    public OperatorGenetyczny losuj()
    {
        double odcięcie = generator.nextDouble();
        //System.out.format("odc:%f\n",odcięcie);
        double akumulator=0.0; int i=0;
        /*while(akumulator<=odcięcie && i<operatory.length) {
            System.out.format("i:%d ac:%f\n",i,akumulator);
            akumulator+=kumulatywna[i++];
        }
        */
        while(kumulatywna[i]<=odcięcie && i<operatory.length) {
            //System.out.format("i:%d cum:%f\n",i,kumulatywna[i]);
            i++;
            //akumulator+=kumulatywna[i++];
        }
        //System.out.format("end:i:%d ac:%f\n",i,kumulatywna[i]);
        //System.out.println(operatory[i]);
        return operatory[i];
    }
    //test
    public static void main(String[] args)
    {
        ZarządcaOperatorów z = new ZarządcaOperatorów();
        z.buduj_prawdopodobieństwa();
        z.pisz(System.out);
        for(int i=0;i<100;i++){System.out.print(z.losuj().id);}
    }
    public enum OperatorGenetyczny {
        NIEROZPOZNANY(-1),
        CROSS(1),
        SIMPLE_MUTATE(2),
        TRANSFER(3);

        private final int id;

        OperatorGenetyczny(int id) {
            this.id = id;
        }
        @Override
        public String toString(){
            return switch (id) {
                case -1 -> "UNRECOGNIZED";
                case 1 -> "PLAIN_CROSSOVER";
                case 2 -> "PLAIN_MUTATION";
                case 3 -> "TRANSFER";
                default -> "?UNSUPPRTED FORMAT?";
            };
        }
        /*
        public String opisy(){
            return switch (id) {
                case 2 -> "TINYGP FORMAT:\n varnumber randomnumber minrandom maxrandom fitnesscases_count\n((FLOAT){varbumber} FLOAT?\\n){fitnesscases}";
                case 3 -> "PLAIN_VECTORS_OF_INPUTS:(FLOAT* \\n)*";
                default -> "?UNSUPPRTED FORMAT?";
            };
        }
        */
        public static OperatorGenetyczny zNapisu(String napis, OperatorGenetyczny domyślny)
        {
            return switch (napis.toLowerCase(Locale.ROOT)) {
                case "plain_crossover","plain-crossover", "cross","crossover" -> CROSS;
                case "plain_mutation","plain-mutation", "mutate","mutation" -> SIMPLE_MUTATE;
                case "trans", "transfer"->TRANSFER;
                default -> domyślny;
            };
        }
    }
}
