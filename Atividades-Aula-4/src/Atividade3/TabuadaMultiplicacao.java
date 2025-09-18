package Atividade3;

public class TabuadaMultiplicacao implements Tabuada {

    private int numero;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }



    @Override
    public void mostrarTabuada() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(String.format("%d X %d = %d", numero, i, (numero*i) ));

        }

    }
}
