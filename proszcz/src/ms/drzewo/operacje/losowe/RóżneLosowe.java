package ms.drzewo.operacje.losowe;

import ms.drzewo.Węzeł;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

import static ms.drzewo.Definicje.BFS;

public class RóżneLosowe {
    public static Węzeł losowy_z_drzewa(Węzeł korzeń){
        return węzeł_o_numerze_przy_przeszukiwaniu_wszerz(korzeń, (int) (Math.random() * liczba_wezlow(korzeń)));
    }
    /*
    public static Węzeł węzeł_o_numerze_przy_przeszukiwaniu_wszerz(Węzeł korzeń, int num) {
        AtomicInteger i= new AtomicInteger(0);
        AtomicReference<Węzeł> w=new AtomicReference<Węzeł>();
        BFS(korzeń,(x)->{
            i.getAndIncrement();if(i.get()==num){
                w.set(x);} return x;},false);
        return w.get();
    }
    public static int liczba_wezlow(Węzeł korzeń) {
        AtomicInteger i= new AtomicInteger(0);
        BFS(korzeń,(x)->{
            i.getAndIncrement(); return x;},false);
        return i.get();
    }
    */
    public static Węzeł węzeł_o_numerze_przy_przeszukiwaniu_wszerz(Węzeł korzeń, int num) {
        Queue<Węzeł> kolejka = new ArrayDeque<Węzeł>();
        kolejka.add(korzeń);
        int i=0;
        while(!kolejka.isEmpty())
        {
            Węzeł w = kolejka.poll();
            if(i==num){return w;}i++;
            if(w.dzieci!=null){
                Collections.addAll(kolejka, w.dzieci);
            }
        }
        return null;
    }
    public static int liczba_wezlow(Węzeł korzeń) {
        Queue<Węzeł> kolejka = new ArrayDeque<Węzeł>();
        kolejka.add(korzeń);
        int i=0;
        while(!kolejka.isEmpty())
        {
            Węzeł w = kolejka.poll();
            i++;
            if(w.dzieci!=null){
                Collections.addAll(kolejka, w.dzieci);
            }
        }
        return i;
    }
}
