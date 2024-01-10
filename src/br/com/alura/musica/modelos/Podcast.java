package br.com.alura.musica.modelos;

public class Podcast extends Audio {
    private String Apresentador;
    private String canal;
    private String genero;

    public String getApresentador() {
        return Apresentador;
    }

    public void setApresentador(String apresentador) {
        this.Apresentador = apresentador;
    }

    public String getCanal() {
        return canal;
    }

    public void setCanal(String canal) {
        this.canal = canal;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public int getClassificacao() {
        if (this.getTotalDeReproducoes() > 500) {
            return 10;
        } else {
            return 6;
        }
    }
}
