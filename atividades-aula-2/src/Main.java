//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Calculadora numero = new Calculadora();
        Pessoa p1 = new Pessoa();
        Musica novaMusica = new Musica();
        Carro carro1 = new Carro();
        p1.olaMundo();

        System.out.println(numero.numero(10));

        novaMusica.avalia(10);
        novaMusica.avalia(5);
        novaMusica.avalia(10);
        novaMusica.fichaTecnica();

        carro1.ano = 1996;
        carro1.cor = "Verde";
        carro1.modelo = "Hb20";

        carro1.fichaTecnica();





    }
}