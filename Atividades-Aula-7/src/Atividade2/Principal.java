package Atividade2;

public class Principal {
    public static void main(String[] args) {
        //Crie uma classe Animal e uma classe Cachorro que herda de Animal.
        // Em seguida, crie um objeto da classe Cachorro e faça o casting para a classe Animal.

        Cachorro c1 = new Cachorro();
        c1.setNome("Ronin");
        c1.setLatido("AUAUAUAUAUUAUUUU");
        c1.setPelo("liso");
        c1.setCor("Cinza");
        c1.setPeso(3);

        Animal c2 = (Animal) c1;

        if( c2 instanceof Cachorro){
            Cachorro c3 = (Cachorro) c2;
            System.out.println("INstaciado");
        }
        else{
            System.out.println("Nao tem como instaciar");
        }







    }
}
