package Atividade4;

public class Quadrado implements Forma {
    double lado;

    public Quadrado(double ladoQuadrado) {
        lado = ladoQuadrado;

    }

    @Override
    public double calculararea() {
        double area = lado*lado;
        return area;
    }
}

