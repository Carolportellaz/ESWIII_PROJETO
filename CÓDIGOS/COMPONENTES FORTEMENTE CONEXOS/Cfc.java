public class Cfc {

    private static class TempoTermino {
        private int numRestantes, t[];
        private boolean restantes[];

        public TempoTermino(int numVertices) {
            t = new int[numVertices];
            restantes = new boolean[numVertices];
            numRestantes = numVertices;
        }

        public int maxTT() {
            int vMax = 0;

            while (!this.restantes[vMax]) {
                vMax++;
            }

            for (int i = 0; i < this.t.length; i++) {
                if (this.restantes[i]) {
                    if (this.t[i] > this.t[vMax]) {
                        vMax = i;
                    }
                }
            }

            return vMax;
        }
    }

    private Grafo grafo;

    public Cfc(Grafo grafo) {
        this.grafo = grafo;
    }

    private void visitaDfs(Grafo grafo, int u, TempoTermino tt) {
        tt.restantes[u] = false;
        tt.numRestantes--;

        System.out.println(" Vertice: " + u);

        if (!grafo.listaAdjVazia(u)) {
            Grafo.Aresta a = grafo.primeiroListaAdj(u);

            while (a != null) {
                int v = a.v2();

                if (tt.restantes[v]) {
                    this.visitaDfs(grafo, v, tt);
                }

                a = grafo.proxAdj(u);
            }
        }
    }
}
