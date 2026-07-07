public class ArvoreBEstrela {

    private static abstract class Pagina {
        int n;
        Item chaves[];
    }

    private static class PaginaInt extends Pagina {
        Pagina p[];

        public PaginaInt(int mm) {
            this.n = 0;
            this.chaves = new Item[mm];
            this.p = new Pagina[mm + 1];
        }
    }

    private static class PaginaExt extends Pagina {
        Object registros[];

        public PaginaExt(int mm2) {
            this.n = 0;
            this.chaves = new Item[mm2];
            this.registros = new Object[mm2];
        }
    }

    private Pagina raiz;
    private int mm, mm2;

    // Entram aqui os métodos privados apresentados nos Programas 6.12 e 6.13

    public ArvoreBEstrela(int mm, int mm2) {
        this.raiz = null;
        this.mm = mm;
        this.mm2 = mm2;
    }

    public Object pesquisa(Item chave, ArvoreBEstrela.Pagina raiz2) {
        return this.pesquisa(chave, this.raiz);
    }
}

class Item {
    private final int chave;

    public Item(int chave) {
        this.chave = chave;
    }

    public int compara(Item item) {
        return Integer.compare(this.chave, item.chave);
    }
}