import java.io.*;

interface Item {
    int compara(Item t);
}

public class MeuItem implements Item {

    public int chave;
    // outros componentes do registro

    public MeuItem(int chave) {
        this.chave = chave;
    }

    public int compara(Item t) {
        MeuItem item = (MeuItem) t;

        if (this.chave < item.chave)
            return -1;
        else if (this.chave > item.chave)
            return 1;

        return 0;
    }
}