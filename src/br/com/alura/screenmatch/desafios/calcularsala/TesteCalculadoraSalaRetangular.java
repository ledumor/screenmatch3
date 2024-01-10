package br.com.alura.screenmatch.desafios.calcularsala;

import br.com.alura.screenmatch.desafios.calcularsala.CalculadoraSalaRetangular;

import java.util.Scanner;

public class TesteCalculadoraSalaRetangular {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite comprimento da parade");
        double altura = leitura.nextDouble();
        System.out.println("Digite largura da parade");
        double largura = leitura.nextDouble();
        CalculadoraSalaRetangular sala1 = new CalculadoraSalaRetangular();
        sala1.calcularArea(altura, largura);
        sala1.calcularPerimetro(altura, largura);
    }
}
