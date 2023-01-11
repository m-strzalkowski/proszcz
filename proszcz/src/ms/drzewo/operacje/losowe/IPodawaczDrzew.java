package ms.drzewo.operacje.losowe;

import ms.drzewo.Węzeł;

public interface IPodawaczDrzew {
    Węzeł full(int maks_głębokość);
    Węzeł grow(int maks_głębokość);

    Węzeł mutation_subtree(Węzeł drzewo, int max_depth, Integer bfs_index);

    Węzeł mutation_point(Węzeł drzewo, Integer bfs_index);

    Węzeł cross_dcpy(Węzeł a, Integer poz_a, Węzeł b, Integer poz_b);

    Węzeł deepcopy(Węzeł drzewo, Integer offset_bfs);
}
