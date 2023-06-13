package quadrado;

public class Quadrado {
    Double lado;
    public void mudarValorLado(Double novoValor) {
        System.out.println("Valor anterior do lado: " + lado);
        lado = novoValor;

        System.out.println("O novo valor do lado é: " + lado);
    }

    public Double retornarLado() {

        System.out.println("Retornar valor do lado: " +lado);
        return lado;

    }

    public Double calcularArea() {

        Double area = lado * lado;

        System.out.println("A área do quadrado é igual a: " + area);
        return area;
    }

    public Quadrado(Double lado) {
        this.lado = lado;
    }
}
