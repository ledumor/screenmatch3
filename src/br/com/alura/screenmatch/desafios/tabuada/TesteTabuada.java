package br.com.alura.screenmatch.desafios.tabuada;

import br.com.alura.screenmatch.desafios.tabuada.TabuadaMultiplicacao;

import java.util.Scanner;

public class TesteTabuada {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("informe o numero para calcular a tabuada dos 10");
        int valor = leitura.nextInt();
        TabuadaMultiplicacao tabuada1 = new TabuadaMultiplicacao();
        tabuada1.mostrarTabuada(valor);
    }
}
