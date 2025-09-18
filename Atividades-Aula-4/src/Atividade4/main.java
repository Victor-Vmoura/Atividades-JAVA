package Atividade4;

public class main {
    public static void main(String[] args) {
//Crie uma interface ConversorTemperatura com os métodos celsiusParaFahrenheit() e fahrenheitParaCelsius().
// Implemente uma classe ConversorTemperaturaPadrao que implementa essa interface com as fórmulas de conversão e exibe os resultados.

        ConversorDeTemperaturaPadrao temperatura1 = new ConversorDeTemperaturaPadrao();

        temperatura1.setValorEmCelsius(100);
        temperatura1.celsiusParaFahrenheit();

        temperatura1.setValorEmFahrenheit(27);
        temperatura1.fahrenheitParaCelsius();



















    }
}
