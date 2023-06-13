package retangulo;

public class Main {

    public static void main(String[] args) {


        Retangulo retangulo = new Retangulo(13.0, 7.0);


        retangulo.retornarLados();


        retangulo.mudarValoresLados(13.0, 5.0);


        retangulo.retornarLados();


        retangulo.calcularPerimetro();


        retangulo.calcularArea();

    }
}