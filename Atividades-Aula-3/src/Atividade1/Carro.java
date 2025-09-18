package Atividade1;

public class Carro {
// Crie uma classe Carro com métodos para representar um modelo específico ao longo de três anos✔.
// Implemente métodos para definir o nome do modelo✔, os preços médios para cada ano✔, e calcular e exibir o menor e o maior preço✔.
// Adicione uma subclasse ModeloCarro para criar instâncias específicas, utilizando-a na classe principal para definir preços e mostrar informações.✔

    private String modelo;
    private double precoAnoUm;
    private double precoAnoDois;
    private double precoAnoTres;

    public void exibirInformacoes(){
        System.out.println("O modelo do carro é: " + modelo);
        System.out.println("O menor preco é de: " + calcularMenorpreco());
        System.out.println("O maior preco é de: " + calcularMaiorpreco());
    }

    public void nomeDoModelo(String modelo){
        this.modelo = modelo;
    }

    public void definirPreco(int precoAnoUm, int precoAnoDois, int precoAnoTres){
        this.precoAnoUm = precoAnoUm;
        this.precoAnoDois = precoAnoDois;
        this.precoAnoTres = precoAnoTres;
    }

    private double calcularMenorpreco (){
         double menorPreco = precoAnoUm;

         if(menorPreco > precoAnoDois){
             menorPreco = precoAnoDois;

         }if (menorPreco > precoAnoTres){
             menorPreco =precoAnoTres;
         }

         return menorPreco;
    }

    private double calcularMaiorpreco (){
        double maiorPreco = precoAnoUm;

        if (maiorPreco < precoAnoDois){
            maiorPreco = precoAnoDois;

        }if (maiorPreco < precoAnoTres){
            maiorPreco =precoAnoTres;
        }

        return maiorPreco;
    }












}
