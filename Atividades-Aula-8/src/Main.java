import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Crie uma classe ContaBancaria com propriedades como número da conta e saldoMaior.
        // Em seguida, crie uma lista de contas bancárias com diferentes saldos.
        // Utilize um loop para encontrar e imprimir a conta com o maior saldoMaior.

        ArrayList<ContaBancaria> listaContas = new ArrayList<>();

        ContaBancaria conta1 = new ContaBancaria(345, 11.20);
        ContaBancaria conta2 = new ContaBancaria(001, 1100.2030);
        ContaBancaria conta3 = new ContaBancaria(043, 546.50);
        ContaBancaria conta4 = new ContaBancaria(323, 10000.500);



        listaContas.add(conta1);
        listaContas.add(conta2);
        listaContas.add(conta3);
        listaContas.add(conta4);

        double saldoMaior = 0;
        int contaMaior = 0;
        for (ContaBancaria i : listaContas){

            if (i.getSaldo() > saldoMaior){
                saldoMaior = i.getSaldo();
                contaMaior = i.getNumeroDaConta();
            }
        }
        System.out.println(String.format("O maior saldo é da conta %d e seu saldo é de R$%.2f", contaMaior, saldoMaior));
























    }
}