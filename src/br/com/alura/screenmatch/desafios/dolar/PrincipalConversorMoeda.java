package br.com.alura.screenmatch.desafios.dolar;

import br.com.alura.screenmatch.desafios.dolar.ConversorMoeda;

import java.util.Scanner;

public class PrincipalConversorMoeda {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double valorDolar;
        double valorCotacao;
        System.out.println("Digite o valor em dolar");
        valorDolar = leitura.nextDouble();
        System.out.println("Digite a cotação do dolar atual");
        valorCotacao = leitura.nextDouble();
        ConversorMoeda cotacao1 = new ConversorMoeda();
        cotacao1.setCotacao(valorCotacao);
        cotacao1.setDolar(valorDolar);
        System.out.println("cotação da moeda é " + cotacao1.getConverterDolarParaReal());

    }
}
