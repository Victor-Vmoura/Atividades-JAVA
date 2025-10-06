package Atividade4;

public class Circulo implements Forma {
    double raio;

    public Circulo(double raioDoCirculo) {
        raio = raioDoCirculo;
    }

    @Override
    public double calculararea() {
        double area = 3.14 * (raio * raio);

        return area;
    }
}
