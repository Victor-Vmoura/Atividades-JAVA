import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//Crie uma classe Produto com atributos como nome, preco, e quantidade.
// Em seguida, crie uma lista de objetos Produto utilizando a classe ArrayList.
// Adicione alguns produtos, imprima o tamanho da lista e recupere um produto pelo índice.

        ArrayList<Produto> listaProdutos = new ArrayList<>();
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o nome do novo Produto");
        Produto novoProduto = new Produto(ler.next());
        System.out.println("Você deseja Adicionar o produto a lista? Digite 1 para sim e 2 para não");
        int decide = ler.nextInt();
        if (decide == 1) {
            System.out.println("Adicionado Produto a lista");
            listaProdutos.add(novoProduto);
        }else{
            System.out.println("Não adicionando o produto a lista");
        }

        Produto produto1 = new Produto("Bombril");
        Produto produto2 = new Produto("Assolam");
        Produto produto3 = new Produto("Detergente");
        Produto produto4 = new Produto("Veja");

        listaProdutos.add(produto1);
        listaProdutos.add(produto2);
        listaProdutos.add(produto3);
        listaProdutos.add(produto4);


        System.out.println(listaProdutos.size());
        System.out.println("Lista de produtos");
        for (Produto i : listaProdutos){
            System.out.println(i.getNomeProduto());
            //System.out.println("\n");
        }
        System.out.println("Recuperando Produto pelo Índice \n");
        System.out.println(listaProdutos.get(2).getNomeProduto());

    }
}