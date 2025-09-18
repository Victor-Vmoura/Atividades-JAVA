package Atividade1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Crie uma classe Atividade1.ConversorMoeda que implementa uma interface Atividade1.ConversaoFinanceira com o
        // metodo converterDolarParaReal() para converter um valor em dólar para reais.
        //  A classe deve receber o valor em dólar como parâmetro.


        ConversorMoeda valorEmDolar = new ConversorMoeda();

        valorEmDolar.setValorEmDolar(40);
        System.out.println(valorEmDolar.getValorEmDolar());
        valorEmDolar.converterDolarParaReal();
        valorEmDolar.setTaxaDoDia(5.35);

        System.out.println(valorEmDolar.converterDolarParaReal());




























    }
}