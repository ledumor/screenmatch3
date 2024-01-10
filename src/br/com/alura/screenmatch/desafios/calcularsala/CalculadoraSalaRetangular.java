package br.com.alura.screenmatch.desafios.calcularsala;

public class CalculadoraSalaRetangular implements CalculoGeometrico {


    @Override
    public void calcularArea(double altura, double largura) {
        double area = altura * largura;
        System.out.println("Area da sala retangular é " + area);

    }

    @Override
    public void calcularPerimetro(double altura, double largura) {
        double perimetro = 2 * (altura + largura);
        System.out.println("O perimetro da sala retangular é " + perimetro);
    }
}