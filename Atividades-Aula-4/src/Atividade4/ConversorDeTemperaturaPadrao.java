package Atividade4;

public class ConversorDeTemperaturaPadrao implements ConversorDeTemperatura {
    private double valorEmCelsius;
    private double valorEmFahrenheit;

    public double getValorEmCelsius() {
        return valorEmCelsius;
    }
    public void setValorEmCelsius(double valorEmCelsius) {
        this.valorEmCelsius = valorEmCelsius;
    }
    public double getValorEmFahrenheit() {
        return valorEmFahrenheit;
    }
    public void setValorEmFahrenheit(double valorEmFahrenheit) {
        this.valorEmFahrenheit = valorEmFahrenheit;
    }



    @Override
    public void celsiusParaFahrenheit() {
         valorEmFahrenheit= (valorEmCelsius * 9/5) + 32;
         System.out.println(String.format("A conversão de %.1f°C para Fahrenheit é de %.1f°F", valorEmCelsius, valorEmFahrenheit));
    }

    @Override
    public void fahrenheitParaCelsius() {
        valorEmCelsius = (valorEmFahrenheit - 32) * 5/9;
        System.out.println(String.format("A conversão de %.1f°F para Celsius é de %.1f°C", valorEmFahrenheit, valorEmCelsius));
    }
}
