package Atividade4;

public class NumerosPrimos {

    public void verficarPrimo(int numero){
        if (numero <= 1) {
            System.out.println(numero + " não é primo!!");
            return;
        }

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                System.out.println(numero + " não é primo!!");
                return;
            }
        }
        System.out.println(numero + " é primo!!");
    }
}
