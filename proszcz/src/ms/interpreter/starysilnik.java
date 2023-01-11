package ms.interpreter;

import ms.Tablice;
import ms.drzewo.Jednomianowy;
import ms.drzewo.operacje.EksportDrzewa;
import ms.interpreter.optymalizacje.Optymalizator;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.function.Function;

import static java.lang.Double.NaN;
import static java.lang.Math.*;

public class starysilnik {
    private Jednomianowy prog=null;
    private Ramka ramka_nadrz=null;

    private Ramka ramka=null;
    private Jednomianowy pp=null;//Program pointer (zamiast Program Counter)
    public int załaduj(double [] argumenty)
    {
        //System.out.println("==załaduj==");
        ramka_nadrz = ramka = new Ramka();
        if(argumenty != null)
        {
            for (int i = 0; i < argumenty.length; i++)
            {
                //System.out.println("X" + (i+1)+":" +argumenty[i]);
                ramka.ustawZmienną("X" + (i+1), argumenty[i]);
            }
        }
        //System.out.println("==/załaduj==");
        return 0;
    }
    public void załaduj(Jednomianowy program)
    {
        ramka_nadrz = ramka = new Ramka();
        prog = program;
    }
    public void optymalizuj()
    {
        Optymalizator opt = new Optymalizator(prog);
        opt.spłaszczanie();
        opt.redukcje();
    }
    public void pokażDrzewo()
    {
        EksportDrzewa.graphhviz(this.prog);
    }
    public String zwróćKod()
    {
        return this.prog.kodPodrzewa();
    }
    public double wykonaj()
    {
        if(prog == null)return NaN;
        else{return policz(prog);}
    }
    static Function<String, Double> informuj = (x) ->{ System.err.println("NIEUSTAWIONA ZMIENNA:"+x); return NaN;};
    Function<String, Double> zapytaj = (x) ->{
        //var c = System.console();
        Scanner in = new Scanner(System.in);

        double r=NaN;
        while(Double.isNaN(r))
        {
            System.out.print("Co podstawić za zmienną "+x+"?");
            try {
                //r = Double.parseDouble(c.readLine());
                r = Double.parseDouble(in.nextLine());
            }
            catch (Exception e)
            {
                e.printStackTrace();
                System.out.println("Coś źle wpisałeś, spróbuj jeszcze raz:");
            }
        }
        ramka.ustawZmienną(x,r);//ustawia zmienną na przyszłość
        return r;
    };
    Function<String, Double> nieustawionazwienna = Tablice.interaktywny ? zapytaj : informuj;
    private double policz(Jednomianowy w)
    {
        double x = ppolicz(w);
        if(Double.isNaN(x) || Double.isInfinite(x)){
            System.err.print("ZWRACA NaN|INF:"+w.internalRepr()+"|"+w.txtRepr());
            for (var d:w.dzieci)
            {
                System.err.print("("+d.internalRepr()+"|"+d.txtRepr()+"="+ ")");
            }
            System.err.println();
        }
        return x;
    }
    private double ppolicz(Jednomianowy w)
    {
        nieustawionazwienna = Tablice.interaktywny ? zapytaj : informuj;
        double akum; int i=0;
        switch (w.zawartość)
        {
            case PLUS:
                akum=0.0;for (Jednomianowy d:w.dzieci) {akum+=policz(d);}
                return akum;
            case MINUS:
                akum=NaN;
                if(w.dzieci.size()>0){akum=policz(w.dzieci.get(0));}
                i=0;for(var d: w.dzieci)
                {
                    if(i<1){++i;continue;}//pomiń ten pierwszy
                    akum-=policz(d);
                }
                return akum;
            case RAZY:
                akum=1.0;for (Jednomianowy d:w.dzieci) {
                    double x =policz(d);
                    akum*=x;
                    //System.err.println("|"+x+","+akum+"|");
                }
                if(Double.isNaN(akum)){System.err.println("@NAN@"+w.internalRepr());}
                return akum;
            case DZIEL:
                akum=NaN;
                if(w.dzieci.size()>0){akum=policz(w.dzieci.get(0));}
                i=0;for(var d: w.dzieci)
                {
                    if(i<1){++i;continue;}//pomiń ten pierwszy
                    double mianownik = policz(d);
                    if ( Math.abs( mianownik ) <= Tablice.PRÓG_DZIWNODZIELENIA)// 0.001 )
                    {}//pomiń dzielenie
                    else {akum/=mianownik;}
                }
                //tez nie tu
                return akum;
            case JEDNOMIAN:
                if(w.zm==null){return w.wt;}
                double odcz = ramka.odczytZmiennej(w.zm);
                if(Double.isNaN(odcz)){odcz=nieustawionazwienna.apply(w.zm);}
                //System.out.println("odcz"+odcz);
                //return w.wt * ((w.zm==null)?(1.0):(pow( ((Double.isNaN(odcz))?(nieustawionazwienna.apply(w.zm)):(odcz)) , w.st)));
                //return w.wt * ((w.zm==null)?(1.0):(pow( ((Double.isNaN(odcz))?(nieustawionazwienna.apply(w.zm)):(odcz)) , (abs(odcz)<Tablice.PRÓG_DZIWNODZIELENIA  && w.st<0)?(1):(w.st) )));
                return (w.wt *


                                ((abs(odcz)<Tablice.PRÓG_DZIWNODZIELENIA  && w.st<0)?
                                        (odcz):
                                        (pow(odcz , w.st ))
                                )
                );
                //nie tu.
            /*
            case JEDNOMIAN:

                double odcz = ramka.odczytZmiennej(w.zm);
                if(Double.isNaN(odcz)){odcz=nieustawionazwienna.apply(w.zm);}
                System.out.println("odcz"+odcz);
                //return w.wt * ((w.zm==null)?(1.0):(pow( ((Double.isNaN(odcz))?(nieustawionazwienna.apply(w.zm)):(odcz)) , w.st)));
                //return w.wt * ((w.zm==null)?(1.0):(pow( ((Double.isNaN(odcz))?(nieustawionazwienna.apply(w.zm)):(odcz)) , (abs(odcz)<Tablice.PRÓG_DZIWNODZIELENIA  && w.st<0)?(1):(w.st) )));
                return w.wt * (
                        (w.zm==null)
                                ?(1.0)
                                :

                                ((abs(odcz)<Tablice.PRÓG_DZIWNODZIELENIA  && w.st<0)?(odcz):
                                        (pow(odcz , w.st ))
                                )
                );
                //nie tu.
             */
            case FUNKCJA:
                switch(w.nazwaFunkcji)
                {
                    case "cos":
                    case "COS": return cos(policz(w.dzieci.get(0)));
                    case "sin":
                    case "SIN": return sin(policz(w.dzieci.get(0)));
                    case "log":
                    case "LOG":
                    {
                        double arg;
                        if(w.dzieci.size()<1){return 0;}
                        if((arg = policz(w.dzieci.get(0)))<0.001){return arg;}
                        return log(arg);
                    }
                    default: System.err.println("NIEROZPOZNANA FUNKCJA:"+w.internalRepr()+"TO PODDRZEWO ZWRÓCI NaN."); return NaN;
                }
            default: System.err.println("NIEROZPOZNANA INSTRUKCJA:"+w.internalRepr()+"TO PODDRZEWO ZWRÓCI NaN."); return NaN;
        }
    }
    static String SEP=" ";//separator w csv

    public void setup_fitness_tiny_gp_plus_exec(String inname, String outname, String pred_col_name) {
        try {
            int i,j;
            String line;

            BufferedReader in =
                    new BufferedReader(
                            new
                                    FileReader(inname));
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
            double[][] targets = new double[fitnesscases][varnumber+2];//jeden na wynik oryginalny, drugi na wyliczony
            if (varnumber + randomnumber >= 110 )
                System.out.println("too many variables and constants");
            //Nagłówek pliku wynikowego
            for(i=1;i<varnumber+1;i++){out.print("X"+i+SEP);} out.print("cel"+SEP);out.print(pred_col_name+"\n");
            for (i = 0; i < fitnesscases; i ++ ) {
                line = in.readLine();
                if(line==null){break;}
                tokens = new StringTokenizer(line);
                for (j = 0; j <= varnumber; j++) {
                    targets[i][j] = Double.parseDouble(tokens.nextToken().trim());
                    //
                }
                this.załaduj(targets[i]);
                //ramka.pisz(System.out);
                double wynik = this.wykonaj();
                out.print(line);
                out.print(SEP+wynik+"\n");
            }
            in.close();
            out.flush();
            if(outname != null){out.close();}
        }
        catch(FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("IN:"+inname+":OUT:"+ outname+ ":ERROR: Please provide a data file");
            System.exit(0);
        }
        catch(Exception e ) {
            e.printStackTrace();
            //System.out.println(e.getMessage());
            System.out.println("ERROR: Incorrect data format");
            System.exit(0);
        }
    }

}
