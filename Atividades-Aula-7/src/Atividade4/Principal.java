package Atividade4;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
//Crie uma interface Forma com um metodo calcularArea().
// Implemente a interface em duas classes, por exemplo, Circulo e Quadrado.
// Em seguida, crie uma lista de formas (objetos da interface Forma) e utilize um loop para calcular e imprimir a área de cada forma.
        ArrayList<Forma> listaDeFormas = new ArrayList<>();

        Quadrado q1 = new Quadrado(10);
        Quadrado q2 = new Quadrado(15);
        Circulo c1 = new Circulo(3.15);
        Circulo c2 = new Circulo(20.3);
        Quadrado q3 = new Quadrado(3.32323);
        Circulo c3 = new Circulo(120);

        listaDeFormas.add(c1);
        listaDeFormas.add(q2);
        listaDeFormas.add(c2);
        listaDeFormas.add(q1);
        listaDeFormas.add(c3);
        listaDeFormas.add(q3);

        for (Forma i : listaDeFormas){
            if (i.getClass() == Quadrado.class){
                System.out.println("Calculando area do Quadrado... " + i.calculararea());
            }else {
                System.out.println("Calculando area do Circulo... " + i.calculararea());
            }
        }





















    }
}
