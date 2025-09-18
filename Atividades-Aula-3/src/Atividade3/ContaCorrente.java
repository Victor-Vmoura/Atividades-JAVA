package Atividade3;

public class ContaCorrente extends  ContaBancaria{

    public void cobrarTarifaMensal(){
        double desconto = 1250;
        saldo = saldo - desconto;

    }
}
