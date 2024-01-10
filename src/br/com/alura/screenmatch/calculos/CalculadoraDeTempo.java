package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }
    // ctrl+ '/' - inibir bloco
//    public void incluirTempo(Filme f) {
//        tempoTotal += f.getDuracaoEmMinutos();
//    }
//    public void incluirTempo(Serie f) {
//        tempoTotal += f.getDuracaoEmMinutos();
//    }
    // utilizando polimorfismo - utilizando a classe mae 'titulo' para calcular, pois filme e serie tem durancao
    public void incluiTempo(Titulo titulo){
        System.out.println("Adicionando duração do titulo = " + titulo.getNome() +
                " >> " + titulo.getDuracaoEmMinutos() );
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
