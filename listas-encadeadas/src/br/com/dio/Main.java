package br.com.dio;

public class Main {
    /*
    Listas Encadeadas:
    referência do primeiro nó aponta para o segundo, o segundo para o terceiro, e o terceiro, se for o último,
    aponta para null. Tem a referência de entrada da lista apontando para o primeiro nó.

    Métodos:

    add(); -> adiciona um nó e tem que se informar onde se quer adicionar esse nó;
    remove(); -> tira um nó.
    isEmpty(); - verifica se a lista está vazia.
    get(); -> pega uma cópia do nó e o referencia, sem retirá-lo da lista.
     */

    public static void main(String[] args) {
        ListaEncadeada<String> minhaListaEncadeada = new ListaEncadeada<>();

        minhaListaEncadeada.add("teste1");
        minhaListaEncadeada.add("teste2");
        minhaListaEncadeada.add("teste3");
        minhaListaEncadeada.add("teste4");

        System.out.println(minhaListaEncadeada.get(0));
        System.out.println(minhaListaEncadeada.get(1));
        System.out.println(minhaListaEncadeada.get(2));
        System.out.println(minhaListaEncadeada.get(3));

        System.out.println(minhaListaEncadeada);

        System.out.println(minhaListaEncadeada.remove(3));

        System.out.println(minhaListaEncadeada);
    }
}
