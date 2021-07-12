package com.teste.javadoc;

/** Classe que representa um círculo e contém métodos matemáticos*/
public class Circulo {
    /** Propriedade raio */
    private Double raio;

    /** Método de criação do círculo
     * @param raio Double - informe o raio do círculo
     * @throws IllegalArgumentException Não é aceito números nulos e negativos
     * @since 1.0.0
     * @link https://www.devmedia.com.br/construtores-em-java-primeiros-passos/28618
     * @author Enzo Carvalho
     * */
    public Circulo(Double raio) {

        if (raio <= 0){
            throw new IllegalArgumentException();
        }
        this.raio = raio;
    }


    /** Método de calculo da área
     * @return Double - Área
     * @since 1.0.0
     * @author Enzo Carvalho
     * */
    public double calcularArea(){
        return Math.PI * Math.pow(this.raio, 2);
    }

    /** Método de calculo de diametro
     * @return Double - diametro
     * @since 1.0.0
     * @author Enzo Carvalho
     * */
    public double calcularDiametro(){
        return Math.pow(this.raio, 2);
    }

    /** Método de calculo de perimetro
     * @return Double - perimetro
     * @since 1.0.0
     * @author Enzo Carvalho
     * */
    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }
}
