package Atividade3;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
//        Crie uma classe Produto com propriedades como nome e preço.
//        Em seguida, crie uma lista de produtos e utilize um loop para calcular e imprimir o preço médio dos produtos.

        ArrayList<Produto> lista = new ArrayList<>();

        Produto produto1 = new Produto("Balança", 2.99);
        Produto produto2 = new Produto("Fone de ouvido", 2.50);
        Produto produto3 = new Produto("Casaco", 100);
        lista.add(produto1);
        lista.add(produto2);
        lista.add(produto3);

        int iterador = 0;
        double somalista = 0;

        for (Produto i : lista){
            iterador++;
            somalista += i.getPreco();
        }
        System.out.println(String.format("A média dos produtos em reais é de R$ %.2f", (somalista/iterador)));


    }
}
