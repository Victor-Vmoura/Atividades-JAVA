package Atividade3;

public class main {
    public static void main(String[] args) {

//    ContaBancaria vitor = new ContaBancaria();
//    vitor.depositar(1500);
//    vitor.depositar(1500);
//
//    vitor.consultarSaldo();
//    vitor.sacar(1500);
//    vitor.consultarSaldo();
//    vitor.depositar(25000);
//    vitor.sacar(12000);

    ContaCorrente vitorcc = new ContaCorrente();
    vitorcc.depositar(12000);
    vitorcc.cobrarTarifaMensal();
    vitorcc.consultarSaldo();



    }
}
