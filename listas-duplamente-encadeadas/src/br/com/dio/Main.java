package br.com.dio;

public class Main {
    /*
    Listas duplamente encadeadas:
    Cada nó dessa lista possui duas referências: uma ref. para o nó da frente e uma ref para o nó de trás.
    Tem-se duas refs de entrada da lista: uma para o primeiro nó, outra para o último nó, e os dois apontam
    também para null.

    Métodos:

    add(elemento); -> passa-se o nó que se quer add;
    add(index, elemento); -> sobrecarga onde também se passa o índice de onde se quer add o nó; adiciona o
    nó em qqer lugar da lista.
    remove(index); -> remover um nó pelo índice apenas;
    get(index); -> obter o nó pelo índice;
     */

    public static void main(String[] args) {
        ListaDuplamenteEncadeada<String> minhaListaEncadeada = new ListaDuplamenteEncadeada<>();

        minhaListaEncadeada.add("c1");
        minhaListaEncadeada.add("c2");
        minhaListaEncadeada.add("c3");
        minhaListaEncadeada.add("c4");
        minhaListaEncadeada.add("c5");
        minhaListaEncadeada.add("c6");
        minhaListaEncadeada.add("c7");

        System.out.println(minhaListaEncadeada);

        minhaListaEncadeada.remove(3);
        minhaListaEncadeada.add(3,"99");

        System.out.println(minhaListaEncadeada);

        System.out.println(minhaListaEncadeada.get(3));
    }
}
