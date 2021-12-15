package br.com.dio;

public class Sobrecarga {
    /*
    Sobrecargas: (não confundir com sobrescrita)
    O mesmo método vai se comportar de forma diferente para cada necessidade, mas vai ter o mesmo nome.
    Alterar a assinatura do método.

    converterParaInteiro(float f);
    converterParaInteiro(double d); -> mudou o parâmetro mas o nome se manteve o mesmo.

    println é um exemplo de método sobrecarregado.
     */

    public static void main(String[] args) {
        //Quadrilátero
        System.out.println("Exercício Quadrilátero");
        Quadrilatero.area(6);
        Quadrilatero.area(10,30);
        Quadrilatero.area(20.6,10.4,40);
    }

}
