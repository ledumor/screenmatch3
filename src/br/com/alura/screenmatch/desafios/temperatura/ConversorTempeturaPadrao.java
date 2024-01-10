package br.com.alura.screenmatch.desafios.temperatura;

public class ConversorTempeturaPadrao implements ConversorTemperatura{
    @Override
    public void celsiusParaFahrenheit(double celsius) {
        double faren = (celsius * ((double) 9 /5)) + 32;
        System.out.println(" conversao para Fahrenheit = " + faren);
    }

    @Override
    public void fahrenheitParaCelsius(double fanren) {
        double celsius1 = ((fanren - 32) / 1.8);
        System.out.println("conversao para celsius = " + celsius1);

    }
}
