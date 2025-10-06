package Atividade1;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        //Crie um ArrayList de strings e utilize um loop foreach para percorrer e imprimir cada elemento da lista.
        ArrayList<String> lista = new ArrayList<>();

        lista.add("Paulo");
        lista.add("Jean");
        lista.add("Karla");
        lista.add("Alfredo");

        for (String i: lista){
            System.out.println(i.toString());

        }
    }
}
