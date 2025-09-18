package Atividade3;

public class ContaBancaria {
    //Crie uma classe ContaBancaria✔ com métodos para realizar operações bancárias como depositar()✔, sacar()✔ e consultarSaldo()✔.
    // Em seguida, crie uma subclasse ContaCorrente que herda da classe ContaBancaria.
    // Adicione um metodo específico para a subclasse, como cobrarTarifaMensal()✔, que desconta uma tarifa mensal da conta corrente.✔

    double saldo;



    public void depositar(double valorDepoisto){
        System.out.println("Você está depositando R$ " + valorDepoisto);
        this.saldo += valorDepoisto;
    }

    public void consultarSaldo(){
        System.out.println("Seu saldo é de : " + saldo);
    }

    public void sacar(double valor){
        if (valor < saldo){
            System.out.println("Você tem disponível R$" + saldo +" para o saque");
            System.out.println("Está sacando R$ " + valor);
            this.saldo = saldo - valor;
            System.out.println("Você ficou com R$  " + saldo + " de saldo");
        }else {
            System.out.println("Você não tem saldo suficiente para sacar");
        }
    }

}
