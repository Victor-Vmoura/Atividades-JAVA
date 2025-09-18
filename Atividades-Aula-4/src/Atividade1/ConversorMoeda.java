package Atividade1;

public class ConversorMoeda implements ConversaoFinanceira {

    private double valorEmDolar;
    private double taxaDoDia;

    public double getTaxaDoDia() {return taxaDoDia;}
    public void setTaxaDoDia(double taxaDoDia) {this.taxaDoDia = taxaDoDia;}
    public double getValorEmDolar() {return valorEmDolar;}
    public void setValorEmDolar(double valorEmDolar) {this.valorEmDolar = valorEmDolar;}


    @Override
    public double converterDolarParaReal() {
       double resultado = valorEmDolar * taxaDoDia;
        return resultado;
    }




}
