class ContaBancaria {
    private double saldo;

    public ContaBancaria(double saldoInicial) {
        saldo = saldoInicial;
    }

    public void deposito(double valor) {
        saldo = saldo + valor;
    }

    public void saque(double valor) {
        saldo = saldo - valor;
    }

    public void imprime() {
        System.out.println("saldo=" + saldo);
    }
}

class AplicacaoBancaria {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria(200.00);

        System.out.print("Antes da movimentacao, ");
        conta1.imprime();

        conta1.deposito(50.00);
        conta1.saque(70.00);

        System.out.print("Depois da movimentacao, ");
        conta1.imprime();
    }
}