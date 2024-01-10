package br.com.alura.screenmatch.desafios;

public class ModeloCarro extends Carro {
    // Pode adicionar propriedades específicas do modelo se necessário
    String modeloDoCarro;
    int anoModelo;

    public String getModeloDoCarro() {
        return modeloDoCarro;
    }

    public int getAnoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(int anoModelo) {
        this.anoModelo = anoModelo;
    }

    public void setModeloDoCarro(String modeloDoCarro) {
        this.modeloDoCarro = modeloDoCarro;
    }
}