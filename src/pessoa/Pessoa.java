package pessoa;

public class Pessoa {

    String nome;
    Integer idade;
    Double peso;
    Double altura;

    public Double adicionarPesoInicial(Double pesoInicial) {
        peso = pesoInicial;
        System.out.println(" ");
        System.out.println("Você escolheu adicionar seu peso. você tem " + peso + "KG");
        System.out.println(" ");
        return peso;
    }
    public Object envelhecer() {
        idade = idade + 1;
        System.out.println("Parabéns pelo seu aniversário! Agora você tem: " + idade + " ANOS");

        if (idade < 21) {
            altura = altura + 0.005;
            System.out.printf("Você cresceu 0.5cm! Sua altura atual é: ");
            System.out.printf("%,.3f", altura);
            System.out.println(" ");
            System.out.println(" ");
            return altura;
        } else {
            System.out.println("Você não ganhou altura.");
            System.out.println(" ");
        }
        return idade;
    }

    public Double engordar(Double quilosAMais){
        peso = peso + quilosAMais;
        System.out.println("Você engordou " + quilosAMais + "KG. seu peso atual é: " + peso);
        System.out.println(" ");
        return peso;
    }

    public Double emagrecer (Double quilosAMenos) {
        peso = peso - quilosAMenos;
        System.out.println("Você emagreceu " + quilosAMenos + "KG. Seu peso atual é " + peso);
        System.out.println(" ");
        return peso;
    }

    public void crescer() {
        if (idade < 47) {
            System.out.println("Você precisa envelhecer para crescer. Aguarde a data do seu aniversário");
            System.out.println(" ");
        } else {
            System.out.println("Você não tem mais idade para crescer :( ");
            System.out.println(" ");
        }
    }
    public void mostrarDados(){
        System.out.println("DADOS DA PESSOA");
        System.out.println("--------------------------");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Peso: " + peso + "kg");
        System.out.printf("Altura: ");
        System.out.printf("%,.3f", altura);
        System.out.println(" ");
        System.out.println("--------------------------");

    }
    public Pessoa(String nome, Integer idade, Double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        peso = 0.0;

    }


}
