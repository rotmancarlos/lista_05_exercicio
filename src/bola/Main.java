package bola;

import bola.Bolas;

public class Main {
    public static void main(String[] args) {

        Bolas bolas1 = new Bolas();

        bolas1.circunferencia = "7.0";

        bolas1.cor = "Branca";

        bolas1.marca = "Nike";

        bolas1.material = "Couro";

        bolas1.velocidade = "0.0";

        System.out.println("A marca da bola é: " + bolas1.marca);

        bolas1.exibeaCor();

        bolas1.trocaacor();


        Bolas bolas2 = new Bolas();

        bolas2.circunferencia = "9.0";

        bolas2.cor = "Preta";

        bolas2.marca = "Adidas";

        bolas2.material = "Couro";

        bolas2.velocidade = "0.0";

        System.out.println("A marca da bola é: " + bolas2.marca);

        bolas2.exibeaCor();

        bolas2.trocaacor();

    }

}