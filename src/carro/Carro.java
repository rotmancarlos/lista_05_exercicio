package carro;

public class Carro {
    Integer qtdePortas;
    String modelo;
    String marca;
    Double potencia;

    public void ligarCarro() {
        System.out.println("Pronto para partir!!!!");
    }

    public void desligarCarro() {
        System.out.println("Chegamos ao seu destino, até a próxima viagem!");
    }
    public Carro(Integer qtdePortas, String modelo, String marca) {
        this.qtdePortas = qtdePortas;
        this.modelo = modelo;
        this.marca = marca;
        this.potencia = 2.0;
    }
}
