package retangulo;

import java.util.ArrayList;
import java.util.List;

public class Retangulo {

    Double comprimento;
    Double altura;

    public void mudarValoresLados(Double novoComprimento, Double novaAltura) {
        comprimento = novoComprimento;

        System.out.println("Os valores de comprimento e altura do retangulo foram alterados .");
        altura = novaAltura;

    }
    public Double calcularArea() {
        Double area = comprimento * altura;
        System.out.println("área do retangulo é = " + area);
        return area;
    }

    public Double calcularPerimetro() {
        Double perimetro = 2 * (comprimento + altura);
        System.out.println("Perimetro do retangulo é = " + perimetro);
        return perimetro;
    }

    public List<Object> retornarLados() {
        List<Object> lista = new ArrayList<>();
        lista.add(this.altura);
        lista.add(this.comprimento);
        System.out.println("Retornando os valores dos lados do retangulo: " + lista.get(0) + " E " + lista.get(1));
        return lista;
    }

    public Retangulo(Double comprimento, Double altura) {
        this.comprimento = comprimento;
        this.altura = altura;

    }
}
