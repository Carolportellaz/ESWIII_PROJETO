private static class LimiteParticoes {
    int i;
    int j;
}

private static LimiteParticoes particao(Item v[], int esq, int dir) {
    LimiteParticoes p = new LimiteParticoes();

    p.i = esq;
    p.j = dir;

    Item x = v[(p.i + p.j) / 2]; // obtém o pivô x

    do {
        while (x.compara(v[p.i]) > 0) {
            p.i++;
        }

        while (x.compara(v[p.j]) < 0) {
            p.j--;
        }

        if (p.i <= p.j) {
            Item w = v[p.i];
            v[p.i] = v[p.j];
            v[p.j] = w;

            p.i++;
            p.j--;
        }
    } while (p.i <= p.j);

    return p;
}

private void ordena(Item v[], int esq, int dir) {
    LimiteParticoes p = particao(v, esq, dir);

    if (esq < p.j) {
        ordena(v, esq, p.j);
    }

    if (p.i < dir) {
        ordena(v, p.i, dir);
    }
}

public static void quicksort(Item v[], int n) {
    ordena(v, 1, n);
}

public class Item{

    public int compara(LimiteParticoes.LimiteParticoesG item) {
        return;
    }

}