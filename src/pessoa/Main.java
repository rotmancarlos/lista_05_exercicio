package pessoa;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Rotman",48,1.78);

        pessoa.adicionarPesoInicial(98.0);
        pessoa.crescer();
        pessoa.envelhecer();
        pessoa.engordar(4.0);
        pessoa.emagrecer(3.0);
        pessoa.envelhecer();
        pessoa.mostrarDados();




    }
}
