package bola;

public class Bolas {

    String circunferencia;

    String cor;

    String marca;

    String material;

    String velocidade;



    public void exibeaCor(){

        System.out.println("A cor da sua Bola é: " + cor);

    }

    public String trocaacor(){

        System.out.println("Chamando método!!!");
        System.out.println("Exibir o conteúdo!!!");

        return cor;

    }

}

