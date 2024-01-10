package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelos.Titulo;

public class Recomendacao {
    private String recomendacao;

    public void filtra(Classificavel classificavel){
        if (classificavel.getClassificacao() >= 4){
            System.out.println("Está na lista de favoritos " );
        }else if (classificavel.getClassificacao() >= 2) {
            System.out.println("filme bem avaliado ");
        } else {
            System.out.println("baixa classificacao ");
        }
    }

}
