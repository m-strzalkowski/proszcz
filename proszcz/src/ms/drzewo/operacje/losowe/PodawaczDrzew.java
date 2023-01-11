package ms.drzewo.operacje.losowe;

import ms.drzewo.Węzeł;
import ms.drzewo.wezly.PrzezroczystyWęzeł;
import ms.interpreter.Silnik;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Queue;

import static ms.drzewo.operacje.losowe.RóżneLosowe.*;

public class PodawaczDrzew implements IPodawaczDrzew{
    IPodawaczWęzłów podawacz=null;

    public PodawaczDrzew(IPodawaczWęzłów los) {
        this.podawacz = los;
    }

    @Override
    public Węzeł full(int max_depth) {
        return gen_rnd_tree(podawacz,max_depth,false);
    }

    @Override
    public Węzeł grow(int max_depth) {
        return gen_rnd_tree(podawacz,max_depth,true);
    }
    Węzeł gen_rnd_tree(IPodawaczWęzłów los,int  max_d,boolean grow)
    {
        Węzeł w;
        if(max_d ==0 || ( grow && Math.random() < los.ilość_terminali()/los.ilość_wszystkich()))
        {
            w = los.terminal(null,null);
        }
        else{
            w=los.nieterminal(null,null);
            int arity = (int) ((Math.random() * (w.dziecimax() - w.dziecimin())) + w.dziecimin());
            w.dzieci = new Węzeł[arity];
            for(int i=0;i<arity;i++)
            {
                w.dzieci[i]= gen_rnd_tree(los,max_d-1,grow);
            }
            w.kontrola();
        }
        return w;
    }


    @Override
    public Węzeł mutation_point(Węzeł drzewo, Integer bfs_index) {
        Węzeł stary;
        if(bfs_index==null){stary=losowy_z_drzewa(drzewo);}
        else{stary=węzeł_o_numerze_przy_przeszukiwaniu_wszerz(drzewo,bfs_index);}
        if(stary==null){throw new RuntimeException("Could not find a node at "+(bfs_index==null?"random.":bfs_index+"position in bfs of this tree"));}
        Węzeł nowy=podawacz.węzeł(null,null);//zupełnie losowy węzeł.
        //Trzeba dopilnować, by nowy miał odpowiednią ilość dzieci.
        //for(int i=0;i< nowy.dziecimax();i++)
        /*    This method takes the following arguments: a source array, the starting position to copy from the source array, a destination array, the starting position in the destination array, and the number of elements to be copied.

                Let's look at another example of copying a sub-sequence from a source array to a destination:
*/
        //int[] array = {23, 43, 55, 12, 65, 88, 92};
        nowy.dzieci = new Węzeł[Math.min(stary.dzieci.length, nowy.dziecimax())];

        System.arraycopy(stary.dzieci, 0, nowy.dzieci, 0, Math.min(stary.dzieci.length,nowy.dzieci.length));
        if(stary.dzieci.length<nowy.dzieci.length)//Zostały jeszcze dzieci do dogenerowania.
        {
            for(int i=stary.dzieci.length; i<nowy.dzieci.length;i++)
            {
                nowy.dzieci[i]=gen_rnd_tree(podawacz,5,true);
            }
        }
        return drzewo;
    }
    @Override
    public Węzeł mutation_subtree(Węzeł drzewo, int max_depth, Integer bfs_index) {
        Węzeł nowe = grow(max_depth);
        return cross_dcpy(drzewo,bfs_index,nowe,0);
    }

    @Override
    public Węzeł cross_dcpy(Węzeł a, Integer poz_a, Węzeł b, Integer poz_b)
    {
        //jeśli indeks == null - wylosuj
        if(poz_a==null){poz_a = (int) (Math.random() * liczba_wezlow(a));}
        System.out.printf("cross_dcpy(Węzeł %s, Integer %d, Węzeł %s, Integer %d);",a.toString(),poz_a,b.toString(),poz_b);
        Węzeł kopia;
        try {
            Queue<Węzeł> kolejka = new ArrayDeque<Węzeł>();
            //Głęboka kopia drzewa a(wszystkich dzieci), w wyjątkiem wskazanego węzła, gdzie przyłączana jest głęboka kopia poddrzewa z b.
            kopia = new PrzezroczystyWęzeł();kopia.dzieci = new Węzeł[]{a};
            kolejka.add(kopia);
            int i = 0;
            while (!kolejka.isEmpty()) {
                Węzeł w = kolejka.poll();
                if (w.dzieci != null) {
                    for (int j = 0; j < w.dzieci.length; j++) {
                        if(i==poz_a){
                            w.dzieci[j] = deepcopy(b,poz_b);
                        }
                        else{//jeśi to nie ten węzeł, normalnie kopiujemy
                            w.dzieci[j] = (Węzeł) w.dzieci[j].clone();//powinno być po prostu jakieś malloc(w.size_bytes()); memcpy()
                        }
                        i++;
                        kolejka.add(w.dzieci[j]);
                    }
                }
            }
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }

        return kopia.dzieci[0];
    }
    @Override
    public Węzeł deepcopy(Węzeł korzeń, Integer offset_bfs)
    {
        if(offset_bfs==null){offset_bfs = (int) (Math.random() * liczba_wezlow(korzeń));}
        Węzeł kopia;
        try {
            System.out.printf("deepcopy(Węzeł %s, Integer %d);", korzeń.toString(), offset_bfs);
            Queue<Węzeł> kolejka = new ArrayDeque<Węzeł>();
            kolejka.add(korzeń);
            int i = 0;
            //najpierw przechodzimy do wskazanego miejsca w drzewie
            Węzeł wybrany=korzeń;
            if(offset_bfs>0)
            {
                while (!kolejka.isEmpty()) {
                    Węzeł w = kolejka.poll();
                    if (i == offset_bfs) {
                        wybrany = w;
                        break;
                    }
                    i++;
                    if (w.dzieci != null) {
                        Collections.addAll(kolejka, w.dzieci);
                    }
                }
            }
            kolejka.clear();
            //Głęboka kopia całego drzewa (wszystkich dzieci), prócz jego korzenia (sztucznie wprowadzonego, aby skopiował się również korzeń właściwy.)
            kopia = new PrzezroczystyWęzeł();kopia.dzieci = new Węzeł[]{wybrany};
            kolejka.add(kopia);
            //Potem kopiujemy poddrzewo
            while (!kolejka.isEmpty()) {
                Węzeł w = kolejka.poll();
                if (w.dzieci != null) {
                    for (int j = 0; j < w.dzieci.length; j++) {
                        w.dzieci[j] = (Węzeł) w.dzieci[j].clone();//powinno być po prostu jakieś malloc(w.size_bytes()); memcpy()
                        kolejka.add(w.dzieci[j]);
                    }
                }
            }
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }

        return kopia.dzieci[0];
    }
    /*
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
     */
}
