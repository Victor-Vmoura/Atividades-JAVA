public class Carro {

    String modelo;
    int ano;
    String cor;

    public void fichaTecnica(){
        System.out.println("Modelo do Carro: " + modelo);
        System.out.println("Cor do Carro: " + cor);
        System.out.println("Ano do carro: " + ano);
        System.out.println("Idade do carro: " + (2025 - ano));
    }

}
