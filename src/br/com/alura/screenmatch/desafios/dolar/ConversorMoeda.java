package br.com.alura.screenmatch.desafios.dolar;

import br.com.alura.screenmatch.desafios.dolar.ConversaoFinanceira;

import java.text.DecimalFormat;

public class ConversorMoeda implements ConversaoFinanceira {
    double dolar;
    double cotacao;

    public double getCotacao() {
        return cotacao;
    }

    public void setCotacao(double cotacao) {
        this.cotacao = cotacao;
    }

    public void setDolar(double dolar) {
        this.dolar = dolar;
    }

    public double getDolar() {
        return dolar;
    }

    public String getConverterDolarParaReal(){
        Double valorConvertido = dolar * cotacao;
        //formatar o valor com pontos e virgulas
        DecimalFormat formato = new DecimalFormat("#,###.00");
        return formato.format(valorConvertido);
    }
}
