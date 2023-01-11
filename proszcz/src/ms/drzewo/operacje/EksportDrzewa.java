package ms.drzewo.operacje;

import ms.drzewo.Jednomianowy;
import ms.drzewo.Węzeł;
import ms.proces.FunkcjaWbudowana;
import ms.proces.Nazwa;
import ms.proces.Proces;
import ms.proces.Zmienna;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public class EksportDrzewa {

    static String fname="src/pyton/in.dot";
    private static int num=0;
    private static int liczbawezlow=0;

    public static void graphhviz(Jednomianowy korzeń)
    {
        liczbawezlow=0;
        num++;
        try {
            File kod = new File(fname+num);
            if (!kod.exists()) {
                //System.out.println(fname+num);
                kod.createNewFile();
            }
            FileWriter fw = new FileWriter(new File(fname+num), StandardCharsets.UTF_8);
            BufferedWriter writer = new BufferedWriter(fw);
            writer.append("digraph G {\n\n");
            writer.append(dot(korzeń));
            writer.append("label = \"węzły:"+liczbawezlow+"\";\n}");
            writer.flush();
            writer.close();

            wydajKomendeCmd("python src/pyton/gviz.py "+fname+num);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    static String dot(Jednomianowy w)
    {
        StringBuilder sb = new StringBuilder();
        sb.append(w.dotRepr());
        if(w.dzieci!=null)
        {
            for (var dz:w.dzieci) {
                sb.append(dot(dz));
            }
        }
        liczbawezlow++;
        return sb.toString();
    }
    public static BiFunction<BufferedWriter,Węzeł,Integer> gviz_wezel = (writer,w)->{
        return null;
    };
    public static void graphviz(Węzeł korzeń)
    {
        graphhviz_otoczka(
                (writer)->{
                    try {
                        writer.append("digraph G {\n\n");
                        writer.append(dot(korzeń));
                        writer.append("label = \"węzły:"+liczbawezlow+"\";\n}");
                    } catch (IOException e) {e.printStackTrace();}
                }
        );
    }
    public static boolean legenda=false;
    public static void graphviz(Proces proces,String tytuł,boolean rekursja)
    {
        graphhviz_otoczka(
                (writer)->{
                    try {
                        writer.append("digraph G {\n\n");
                        dot(writer,proces,tytuł,rekursja?5:0);
                        if(legenda)
                        {
                            writer.append("digraph cluster_legend {\n" +
                                    "    rank = sink;\n" +
                                    "    color=cyan;\n" +
                                    "    \"instruction node\";\n" +
                                    "    \"variable\" [shape=diamond];\n" +
                                    "    \"reference to process\" [shape=egg];\n" +
                                    "    \"built-in function\" [shape=hexagon];\n" +
                                    "    label = \"legend\";\n" +
                                    "  }\n");
                        }
                        writer.append("}");
                    } catch (IOException e) {e.printStackTrace();}
                }
        );
    }


    public static void graphhviz_otoczka(Consumer<BufferedWriter> procedura)
    {
        liczbawezlow=0;
        num++;
        System.out.println("invoking graphviz procedure");
        try {
            File kod = new File(fname+num);
            if (!kod.exists()) {
                //System.out.println(fname+num);
                kod.createNewFile();
            }
            FileWriter fw = new FileWriter(new File(fname+num), StandardCharsets.UTF_8);
            BufferedWriter writer = new BufferedWriter(fw);
            procedura.accept(writer);
            writer.flush();
            writer.close();

            wydajKomendeCmd("python src/pyton/gviz.py "+fname+num);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    static String dot(Węzeł w)
    {
        if(w==null){return "null;";}
        StringBuilder sb = new StringBuilder();
        sb.append(w.dotRepr());
        if(w.dzieci!=null)
        {
            for (var dz:w.dzieci) {
                sb.append(dot(dz));
            }
        }
        liczbawezlow++;
        return sb.toString();
    }
    private static void dot(BufferedWriter wr, Proces p, String tytuł,int i) throws IOException {
        wr.append("subgraph cluster_")
                .append(p.dotId())
                .append(" {")
                .append("label=\"")
                .append(tytuł)
                .append("\";\n").append("node [style=filled;];\n");
        for(String n:p.nazwy.keySet())
        {
            Nazwa nazwa = p.nazwy.get(n);
            if(nazwa instanceof Proces)
            {
                if(i>0)
                {
                    dot(wr,(Proces)nazwa,n,i-1);
                }
                else{
                    wr.append("subgraph cluster_")
                            .append(nazwa.dotId())
                            .append(" {")
                            .append("label=\"")
                            .append(n)
                            .append("\";")
                            .append("\n")
                            .append("ref [shape=egg];");
                    wr.append("}");
                }
            }
            else if(nazwa instanceof FunkcjaWbudowana)
            {
                FunkcjaWbudowana f = (FunkcjaWbudowana) nazwa;
                wr.append("subgraph cluster_")
                        .append(nazwa.dotId())
                        .append(" {")
                        .append("label=\"")
                        .append(n)
                        .append("\";")
                        .append("\n")
                        .append("\"").append(f.kod()).append("\" [shape=hexagon]");
                wr.append("}");
            }
            else if(nazwa instanceof Zmienna)
            {
                Zmienna f = (Zmienna) nazwa;
                wr.append("subgraph cluster_")
                        .append(nazwa.dotId())
                        .append(" {")
                        .append("label=\"")
                        .append(n)
                        .append("\";")
                        .append("\n")
                        .append("\"").append(f.kod()).append("\" [shape=diamond]");
                wr.append("}");
            }
            else {
                wr.append("\n\"Nazwa ").append(n).append(":").append(nazwa.getClass().getName()).append("\" [shape=box];\n");
            }

        }
        wr.append(dot(p.drzewo));
        wr.append("color=black;}");

    }

    public static void wydajKomendeCmd(String komenda) throws IOException {
        ProcessBuilder builder = new ProcessBuilder("cmd.exe", "/C",komenda);
        builder.redirectErrorStream(true);
        Process p = builder.start();
        BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
        String linia;
        while (true) {
            linia = r.readLine();
            if (linia == null) { break; }
            System.out.println(linia);
        }
    }
}
