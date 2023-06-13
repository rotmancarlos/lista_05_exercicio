package ContaCorrente;

public class Main {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente(171, "Imaculada");
        conta.saldo = 800.0;

        conta.exibirDados();
        conta.depositarContaCorrente(13.50);
        conta.sacarContaCorrente(100.0);
        conta.sacarContaCorrente(320.0);

    }
}


