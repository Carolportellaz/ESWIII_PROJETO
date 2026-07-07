public class TabelaHash {

    static class Celula {
        String chave;
        Object item;

        public Celula(String chave, Object item) {
            this.chave = chave;
            this.item = item;
        }

        public boolean equals(Object obj) {
            Celula cel = (Celula) obj;
            return chave.equals(cel.chave);
        }
    }

    private int M; // tamanho da tabela
    private Lista tabela[];
    private int pesos[];

    // Entram aqui os métodos privados dos Programas 5.19 e 5.20

    public TabelaHash(int m, int maxTamChave) {
        this.M = m;
        this.tabela = new Lista[this.M];

        for (int i = 0; i < this.M; i++) {
            this.tabela[i] = new Lista();
        }

        this.pesos = this.geraPesos(maxTamChave);
    }

    private int[] geraPesos(int maxTamChave) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'geraPesos'");
    }

    public Object pesquisa(String chave) {
        int i = this.h(chave, this.pesos);

        if (this.tabela[i].vazia()) {
            return null; // pesquisa sem sucesso
        } else {
            Celula cel = (Celula) this.tabela[i].pesquisa(new Celula(chave, null));

            if (cel == null) {
                return null; // pesquisa sem sucesso
            } else {
                return cel.item;
            }
        }
    }

    private int h(String chave, int[] pesos2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'h'");
    }

    public void insere(String chave, Object item) {
        if (this.pesquisa(chave) == null) {
            int i = this.h(chave, this.pesos);
            this.tabela[i].insere(new Celula(chave, item));
        } else {
            System.out.println("Registro ja esta presente");
        }
    }

    public void retira(String chave) throws Exception {
        int i = this.h(chave, this.pesos);

        Celula cel = (Celula) this.tabela[i].retira(new Celula(chave, null));

        if (cel == null) {
            System.out.println("Registro nao esta presente");
        }
    }
}

class Lista{

    public boolean vazia() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'vazia'");
    }

    public TabelaHash.Celula retira(TabelaHash.Celula celula) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'retira'");
    }

    public void insere(TabelaHash.Celula celula) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insere'");
    }

    public TabelaHash.Celula pesquisa(TabelaHash.Celula celula) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'pesquisa'");
    }

}