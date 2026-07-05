package cap1;

class Empregado {
    protected float salario;

    public float salarioMensal() {
        return salario;
    }

    public void imprime() {
        System.out.println("Empregado");
    }
}

class Secretaria extends Empregado {
    private int velocidadeDeDigitacao;

    @Override
    public void imprime() {
        System.out.println("Secretaria");
    }
}

class Gerente extends Empregado {
    private float bonus;

    @Override
    public float salarioMensal() {
        return salario + bonus;
    }

    @Override
    public void imprime() {
        System.out.println("Gerente");
    }
}

public class Polimorfismo {
    public static void main(String[] args) {
        Empregado empregado = new Empregado();
        Empregado secretaria = new Secretaria();
        Empregado gerente = new Gerente();

        empregado.imprime();
        secretaria.imprime();
        gerente.imprime();
    }
}
