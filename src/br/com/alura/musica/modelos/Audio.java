package br.com.alura.musica.modelos;

public class Audio {
    private String titulo;
    private int duracao;
    private  int totalDeReproducoes;
    private  int totalDeCurtidas;
    private  int classificacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }


    public int getTotalDeCurtidas() {
        return totalDeCurtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }


    public void curte(){
        this.totalDeCurtidas ++;
        System.out.println("Total de curtidas = " + getTotalDeCurtidas());
    }

    public void reproduz(){
        this.totalDeReproducoes ++;
        System.out.println("Total de Reproducoes = " + getTotalDeReproducoes());
    }

}
