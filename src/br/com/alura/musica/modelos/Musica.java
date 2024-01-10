package br.com.alura.musica.modelos;

public class Musica extends Audio {
    private String host;
    private String descricao;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    @Override
    public int getClassificacao() {
        if (this.getTotalDeReproducoes() > 100) {
            return 10;
        } else {
            return 6;
        }
    }
}
