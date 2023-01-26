package ms.gp.przypadki;

import ms.bledy.SemanticOccurence;
import ms.drzewo.Węzeł;
import ms.gp.ewolucja.Ewolutor;
import org.apache.commons.lang.ArrayUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;
import java.util.function.Consumer;

import static java.lang.Integer.max;
import static java.lang.Integer.min;
import static ms.drzewo.operacje.losowe.RóżneLosowe.liczba_wezlow;

public class ZarządcaPrzypadków {
    public double[][] cases;
    static String SEP=" ";//separator w csv
    public void wczytaj(String sciezka_pelna,FormatPrzypadkow format)
    {
        cases = switch (format){
            case TINYGP -> setup_fitness_tiny_gp(sciezka_pelna,null,"");
            case  TYLKO_WEKTORY_WE-> czytaj_same_wektory_we(sciezka_pelna,false);
            default -> throw new IllegalStateException("Unexpected value: " + format);
        };
    }
    public void generuj(double wartosc_min, double wartosc_maks, double krok, int wymiary)
    {
        var newcases = new ArrayList<double[]>();
        multi_iter((args)->{
            newcases.add(args.stream().mapToDouble(Double::doubleValue).toArray());
        },null,wartosc_min,wartosc_maks,krok,wymiary);
        cases = newcases.toArray(new double[0][0]);
    }
    public static void multi_iter(Consumer<List<Double>> procedure, List<Double> args, double minval,double maxval, double step, int maxcount)
    {
        if(args==null){args = new ArrayList<>();}
        if(args.size() == maxcount)
        {
            procedure.accept(args);
        }
        if(args.size()<1 || args.size()<maxcount)
        {
            args.add(0.0);
            double val = minval;
            for(int i=0;(val = minval + i*step)<=maxval;i+=1)
            {
                //val = minval + i*step;
                args.set(args.size()-1, val);
                multi_iter(procedure,args,minval,maxval,step,maxcount);
            }
            args.remove(args.size()-1);
        }
    }
    private double[][] czytaj_same_wektory_we(String sciezka_pelna,boolean zgub_ostatnia_kolumne)
    {
        ArrayList<double[]> listy = new ArrayList<double[]>();
        String linia;
        try {
            BufferedReader we =
                    new BufferedReader(
                            new FileReader(sciezka_pelna));
            while((linia = we.readLine())!=null)
            {
                ArrayList<Double> lista = new ArrayList<>();
                var tokens = new StringTokenizer(linia);
                while(tokens.hasMoreTokens())
                {
                    lista.add(Double.parseDouble(tokens.nextToken().trim()));
                }
                if(zgub_ostatnia_kolumne){lista.remove(lista.size()-1);}
                double[] t=new double[lista.size()]; for(int i=0;i<t.length;i++) {t[i]=lista.get(i);}
                listy.add(t);
            }
            double[][] wynik = new double[listy.size()][]; for(int j=0;j<wynik.length;j++) {wynik[j]=listy.get(j);}
            return wynik;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }

    }
    private double[][] setup_fitness_tiny_gp(String inname, String outname, String pred_col_name)
    {
        double[][] targets=null;
        try {
            int i,j;
            String line;

            BufferedReader in =
                    new BufferedReader(
                            new FileReader(inname));
            PrintStream out;
            if(outname==null)
            {out=System.out;}
            else {out = new PrintStream(outname);}

            line = in.readLine();
            StringTokenizer tokens = new StringTokenizer(line);
            int varnumber = Integer.parseInt(tokens.nextToken().trim());
            int randomnumber = Integer.parseInt(tokens.nextToken().trim());
            double minrandom =	Double.parseDouble(tokens.nextToken().trim());
            double maxrandom =  Double.parseDouble(tokens.nextToken().trim());
            int fitnesscases = Integer.parseInt(tokens.nextToken().trim());
            targets = new double[fitnesscases][varnumber+0];//jeden na wynik oryginalny, drugi na wyliczony
            if (varnumber + randomnumber >= 110 )
                System.out.println("too many variables and constants");
            //Nagłówek pliku wynikowego
            for(i=1;i<varnumber+1;i++){out.print("X"+i+SEP);} out.print("cel"+SEP);out.print(pred_col_name+"\n");
            for (i = 0; i < fitnesscases; i ++ ) {
                line = in.readLine();
                if(line==null){break;}
                tokens = new StringTokenizer(line);
                for (j = 0; j < varnumber; j++) {
                    targets[i][j] = Double.parseDouble(tokens.nextToken().trim());
                    //
                }
                //this.załaduj(targets[i]);
                //ramka.pisz(System.out);
                //double wynik = this.wykonaj();
                out.print(line);
                //out.print(SEP+wynik+"\n");
            }
            in.close();
            out.flush();
            if(outname != null){out.close();}
        }
        catch(FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("IN:"+inname+":OUT:"+ outname+ ":ERROR: Please provide a data file");
            throw new RuntimeException("IN:"+inname+":OUT:"+ outname+ ":ERROR: Please provide a data file");
        }
        catch(Exception e ) {
            e.printStackTrace();
            //System.out.println(e.getMessage());
            System.out.println("ERROR: Incorrect data format (expected TinyGP input)");
            throw new RuntimeException("ERROR: Incorrect data format (expected TinyGP input)");
        }
        return targets;
    }
    public void pisz( PrintStream wy, int od_poczatku, int od_konca)
    {
        int i=0,w=0;
        if(cases==null){wy.println("error:cases is null");return;}
        wy.format("==FITNESS CASES==\n");
        int k= min(od_poczatku, cases.length);
        int wielkosc,srednia=0,minim=Integer.MAX_VALUE,maxim=Integer.MIN_VALUE;
        StringBuilder reprezentacja = new StringBuilder();
        for(;i< cases.length;i++)
        {
            reprezentacja = new StringBuilder();
            if(cases[i]!=null)
            {
                wielkosc =cases[i].length;
                for (int j=0;j<cases[i].length;j++){reprezentacja.append(" ").append(cases[i][j]);}
            }
            else{
                wielkosc = 0;
                reprezentacja.append("NULL");
            }
            srednia+=wielkosc;
            minim = min(minim,wielkosc);
            maxim = max(maxim,wielkosc);
            w++;
            wy.format("%d[%d]:%s\n",i,wielkosc,reprezentacja.toString());
            if(i>=od_poczatku)
            {
                if(i<cases.length-od_konca){wy.println("\t...");}
                i=max(i, cases.length-od_konca);
            }
        }
        /*
        if(i<pop.length-od_konca){wy.println("\t...");}
        i=max(i, pop.length-od_konca);
        for(;i< pop.length;i++)
        {
            if(pop[i]!=null)
            {
                wielkosc =liczba_wezlow(pop[i]);
                srednia+=wielkosc;
                min = min(min,wielkosc);
                max = max(max,wielkosc);
                wy.format("%d[%d]:%s\n",i,wielkosc,(pop[i]!=null)?(pop[i].kodPodrzewa()):(pop[i]));
            }
        }*/
        wy.format("== statistics ==\n");
        wy.format("= printed fitness cases' length: min:%d average:%f max%d (among %d specimens) =\n",minim, ((double)srednia)/cases.length,maxim,w);
        wy.format("==%d fitness cases in total==\n",cases.length);
    }
    public void pisz(PrintStream wy){pisz(wy,5,5);}
    public enum FormatPrzypadkow {
        NIEROZPOZNANY(-1),
        TINYGP(1),
        TYLKO_WEKTORY_WE(2);

        private final Integer form;

        FormatPrzypadkow(int form) {
            this.form = form;
        }
        @Override
        public String toString(){
            return switch (form) {
                case -1 -> "UNRECOGNIZED";
                case 2 -> "TINYGP";
                case 3 -> "ONLY VECTORS OF INPUTS";
                default -> "?UNSUPPRTED FORMAT?";
            };
        }
        public String opisy(){
            return switch (form) {
                case 2 -> "TINYGP FORMAT:\n varnumber randomnumber minrandom maxrandom fitnesscases_count\n((FLOAT){varbumber/*times*/} FLOAT?\\n){fitnesscases}";
                case 3 -> "PLAIN_VECTORS_OF_INPUTS:(FLOAT* \\n)*";
                default -> "?UNSUPPRTED FORMAT?";
            };
        }
        public static FormatPrzypadkow zNapisu(String napis, FormatPrzypadkow domyślny)
        {
            return switch (napis) {
                case "TINYGP", "TinyGP","tinygp" -> FormatPrzypadkow.TINYGP;
                case "PLAIN_VECTORS_OF_INPUTS", "plain","PLAIN" -> FormatPrzypadkow.TYLKO_WEKTORY_WE;
                default -> domyślny;
            };
        }
    }
}
