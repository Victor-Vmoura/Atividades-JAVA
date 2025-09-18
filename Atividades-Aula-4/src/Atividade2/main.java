package Atividade2;

public class main {
    public static void main(String[] args) {

//Crie uma classe CalculadoraSalaRetangular que implementa uma
//interface CalculoGeometrico com os métodos calcularArea() e calcularPerimetro() para calcular a área e o perímetro de uma sala retangular.
//A classe deve receber altura e largura como parâmetros.

    CalculadoraSalaRetangular sala1 = new CalculadoraSalaRetangular();
    sala1.setAltura(200);
    sala1.setLargura(150);

    System.out.println(sala1.calcularPerimetro());
    System.out.println(sala1.calcularArea());


    }
}
