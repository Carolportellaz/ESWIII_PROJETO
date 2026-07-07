public class Dijkstra {

    private int antecessor[];
    private double p[];
    private Grafo grafo;

    public Dijkstra(Grafo grafo) {
        this.grafo = grafo;
    }

    public void obterArvoreCMC(int raiz) throws Exception {
        int n = this.grafo.numVertices();
        this.p = new double[n]; // peso dos vértices
        int vs[] = new int[n + 1];

        this.antecessor = new int[n];

        for (int u = 0; u < n; u++) {
            this.antecessor[u] = -1;
            p[u] = Double.MAX_VALUE; // ∞
            vs[u + 1] = u; // Heap indireto deve ser construído
        }

        p[raiz] = 0;

        FPHeapMinIndireto heap = new FPHeapMinIndireto(p, vs);
        heap.constroi();

        while (!heap.vazio()) {
            int u = heap.retiraMin();

            if (!this.grafo.listaAdjVazia(u)) {
                Grafo.Aresta adj = grafo.primeiroListaAdj(u);

                while (adj != null) {
                    int v = adj.v2();

                    if (this.p[v] > (this.p[u] + adj.peso())) {
                        this.antecessor[v] = u;
                        heap.diminuiChave(v, this.p[u] + adj.peso());
                    }

                    adj = grafo.proxAdj(u);
                }
            }
        }
    }

    public int antecessor(int u) {
        return this.antecessor[u];
    }

    public double peso(int u) {
        return this.p[u];
    }

    public void imprimeCaminho(int origem, int v) {
        if (origem == v) {
            System.out.println(origem);
        } else if (this.antecessor[v] == -1) {
            System.out.println("Nao existe caminho de " + origem + " ate " + v);
        } else {
            imprimeCaminho(origem, this.antecessor[v]);
            System.out.println(v);
        }
    }
}

class FPHeapMinIndireto{

    public FPHeapMinIndireto(double[] p, int[] vs) {
        //TODO Auto-generated constructor stub
    }

    public void diminuiChave(int v, double d) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'diminuiChave'");
    }

    public int retiraMin() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'retiraMin'");
    }

    public boolean vazio() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'vazio'");
    }

    public void constroi() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'constroi'");
    }

}