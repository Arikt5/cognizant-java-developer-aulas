package br.com.dio;

public class Retornos {
    public static void main(String[] args) {
        /*
        Retornos:
        É uma instrução de interrupção. É muito atrelado a método.
        Seu conteúdo tem que ser compatível com o dado do método.
        se ele é void, pode ter ou não um return vazio.
        */

        //Quadrilátero
        System.out.println("Exercício Retornos");

        double areaQuadrado = Quadrilatero.area(6);
        System.out.println("Área do quadrado: " + areaQuadrado);

        double areaRetangulo = Quadrilatero.area(10,30);
        System.out.println("Área do retângulo: " + areaRetangulo);

        double areaTrapezio = Quadrilatero.area(20.6,10.4,40);
        System.out.println("Área do trapézio: " + areaTrapezio);
    }
}
