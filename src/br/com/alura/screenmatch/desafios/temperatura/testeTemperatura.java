package br.com.alura.screenmatch.desafios.temperatura;

import java.util.Scanner;

public class testeTemperatura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("digite a temperatura");
        double temperatura = leitura.nextDouble();
        System.out.println("informe uma das opções: \n" +
                " <1> - Converter Celsius para > Faren \n" +
                " <2> - Converter Faren para Celsius \n");
        int opcao = leitura.nextInt();
        ConversorTempeturaPadrao convert = new ConversorTempeturaPadrao();
        if (opcao == 1){
            convert.celsiusParaFahrenheit(temperatura);
        } else if (opcao == 2) {
            convert.fahrenheitParaCelsius(temperatura);
        }else {
            System.out.println("opcao invalida");
        }
    }
}
