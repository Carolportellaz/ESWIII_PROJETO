
public class ArvoreSBB {

    private static class No {
        Item2 reg;
        No esq, dir;
        byte incE, incD;
    }

    private static final byte Horizontal = 0;
    private static final byte Vertical = 1;

    private No raiz;
    private boolean propSBB;

    // Entram aqui os métodos privados dos Programas 5.4, 5.10, 5.11 e 5.12

    public ArvoreSBB() {
        this.raiz = null;
        this.propSBB = true;
    }

    public Item2 pesquisa(Item2 reg, ArvoreSBB.No raiz2) {
        return this.pesquisa(reg, this.raiz);
    }

    public ArvoreSBB.No insere(Item2 reg, Object object, ArvoreSBB.No raiz2, boolean b) {
        return this.raiz = insere(reg, null, this.raiz, true);
    }

    public ArvoreSBB.No retira(Item2 reg) {
        return this.raiz = this.retira(reg);
    }

    // Entra aqui o método para imprimir a árvore do Programa 5.8
} 

class Item2{
    
    public int compara(Item2 item) {
        return 0;
    }
}
