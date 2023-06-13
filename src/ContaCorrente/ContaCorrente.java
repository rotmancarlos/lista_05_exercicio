package ContaCorrente;

public class ContaCorrente {

    Integer contaCorrente;
    String correntista;
    Double saldo;

    public void exibirDados () {
        System.out.println("Informações sobre atualizada sobre sua conta corrente");
        System.out.println("------------------------------");
        System.out.println("Nome do correntista: " + correntista);
        System.out.println("Número da conta-corrente: " + contaCorrente);
        System.out.println("Saldo em conta: " + saldo);
        System.out.println("------------------------------");
    }
    public Double depositarContaCorrente(Double valorDeposito) {
        System.out.println("Deposito realizado de R$" + valorDeposito);
        saldo = saldo + valorDeposito;
        System.out.println("Seu saldo em conte é R$ "+ saldo);
        System.out.println("------------------------------");
        return saldo;

    }
    public Double sacarContaCorrente(Double valorSaque) {
        if(saldo > valorSaque) {
            saldo = saldo - valorSaque;
            System.out.println("Você realizou saque R$" + valorSaque);
            System.out.println("Seu saldo atual: R$" + saldo);
            System.out.println("------------------------------");
            return saldo;
        } else {
            System.out.println("Saldo insuficiente para saldo.");
            System.out.println("Seu saldo é de: R$" + saldo);
            System.out.println("------------------------------");
            return saldo;
        }
    }
    public ContaCorrente(Integer contaCorrente, String correntista) {
        this.contaCorrente = contaCorrente;
        this.correntista = correntista;
        this.saldo = 0.0;
    }
}
