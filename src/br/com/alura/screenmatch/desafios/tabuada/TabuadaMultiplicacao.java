package br.com.alura.screenmatch.desafios.tabuada;

import br.com.alura.screenmatch.desafios.tabuada.Tabuada;

public class TabuadaMultiplicacao implements Tabuada {
    @Override
    public void mostrarTabuada(int valor) {
        System.out.println("calculando tabualada do numero = " + valor);
        for (int i = 1; i <= 10; i++) {
            int resultado = valor * i;
            System.out.println(valor + " x " + i + " = " + resultado);
        }
    }
}
