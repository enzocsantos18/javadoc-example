package com.teste.javadoc;

public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(2.0);
        double area = circulo.calcularArea();
        double diametro = circulo.calcularDiametro();
        double perimetro = circulo.calcularPerimetro();

        System.out.println("Area: " + area);
        System.out.println("Diametro: " + diametro);
        System.out.println("Perimetro: " + perimetro);


    }
}

