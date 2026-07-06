public class PasseioCavalo {

    private int n;      // Tamanho do lado do tabuleiro
    private int a[], b[], t[][];

    public PasseioCavalo(int n) {
        this.n = n;

        a = new int[8];
        b = new int[8];
        t = new int[n][n];

        a[0] = 2;  b[0] = 1;
        a[1] = 1;  b[1] = 2;
        a[2] = -1; b[2] = 2;
        a[3] = -2; b[3] = 1;
        a[4] = -2; b[4] = -1;
        a[5] = -1; b[5] = -2;
        a[6] = 1;  b[6] = -2;
        a[7] = 2;  b[7] = -1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                t[i][j] = 0;
            }
        }
    }

    public boolean tenta(int i, int x, int y) {
        int u, v, k;
        boolean conseguiu;

        k = -1;
        conseguiu = false;

        do {
            k = k + 1;
            conseguiu = false;

            u = x + a[k];
            v = y + b[k];

            // Teste para verificar se os limites do tabuleiro
            // estão sendo respeitados.
            if ((u >= 0) && (u < n) && (v >= 0) && (v < n)) {

                if (t[u][v] == 0) {
                    t[u][v] = i;

                    if (i == (n * n)) {
                        // tabuleiro está cheio
                        conseguiu = true;
                    }

                    if (tenta(i + 1, u, v)) {
                        // tenta novo movimento
                        if (t[u][v] != 0) {
                            // não sucedeu após reg. anterior
                            conseguiu = true;
                        }
                    }
                }
            }
        } while (!conseguiu && (k != 7));

        return conseguiu;
    }

    public void imprimePasseio() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("\t" + this.t[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        PasseioCavalo passeioCavalo = new PasseioCavalo(8);

        boolean q = passeioCavalo.tenta(2, 0, 0);

        if (q) {
            passeioCavalo.imprimePasseio();
        } else {
            System.out.println("Sem solução");
        }
    }
}