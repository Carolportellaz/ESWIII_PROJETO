import java.io.*;

public class OrdenacaoExterna {

    private int ordemIntercal;

    public OrdenacaoExterna(int ordemIntercal) {
        this.ordemIntercal = ordemIntercal;
    }

    public void ordeneExterno() {
        int nBlocos = 0;
        RandomAccessFile arqEntrada, arqSaida;
        RandomAccessFile arrArqEnt[] = new RandomAccessFile[ordemIntercal];
        boolean fim;
        int low, high, lim;

        nBlocos = 0;
        arqEntrada = abrirArquivoASerOrdenado();

        do { // Formação inicial dos nBlocos ordenados
            nBlocos++;
            fim = enchePaginas(nBlocos, arqEntrada);
            ordeneExterno();
            arqSaida = abreArqSaida(nBlocos);
            descarregaPaginas(arqSaida);
            fechaArq(arqSaida);
        } while (!fim);

        fechaArq(arqEntrada);

        low = 0;
        high = nBlocos - 1;

        while (low < high) { // Intercalação dos nBlocos ordenados
            lim = minimo(low + ordemIntercal - 1, high);
            abreArqEntrada(arrArqEnt, low, lim);
            high++;
            arqSaida = abreArqSaida(high);
            intercala(arrArqEnt, low, lim, arqSaida);
            fechaArq(arqSaida);

            for (int i = low; i < lim; i++) {
                fechaArq(arrArqEnt[i]);
                apague_Arquivo(arrArqEnt[i]);
            }

            low += ordemIntercal;
        }

        // Mudar o nome do arquivo high para o nome fornecido pelo usuario;
    }

    private void apague_Arquivo(RandomAccessFile randomAccessFile) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'apague_Arquivo'");
    }

    private void intercala(RandomAccessFile[] arrArqEnt, int low, int lim, RandomAccessFile arqSaida) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'intercala'");
    }

    private void abreArqEntrada(RandomAccessFile[] arrArqEnt, int low, int lim) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'abreArqEntrada'");
    }

    private int minimo(int i, int high) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'minimo'");
    }

    private void descarregaPaginas(RandomAccessFile arqSaida) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'descarregaPaginas'");
    }

    private void fechaArq(RandomAccessFile arqSaida) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'fechaArq'");
    }

    private RandomAccessFile abreArqSaida(int nBlocos) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'abreArqSaida'");
    }

    private boolean enchePaginas(int nBlocos, RandomAccessFile arqEntrada) {
        return false;
    }

    private RandomAccessFile abrirArquivoASerOrdenado() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'abrirArquivoASerOrdenado'");
    }
}