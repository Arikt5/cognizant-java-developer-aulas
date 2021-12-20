package br.com.dio;

public class Main {
    /*
    Listas Circulares:
    parecida com uma lista de encadeamento simples. Diferença: referência do último obj aponta para o
    primeiro, e não para null.
    Primeiro elemento chama cauda e o último cabeça. Terá uma referência de entrada para a cauda.

    Métodos:
    remove();
    add(elemento); -> referencia o nó de entrada da cauda pro novo nó, e aponta a referência de nó da cabeça
    para o novo nó.
    get();
    isEmpty();
     */
    public static void main(String[] args) {
        ListaCircular<String> minhaListaCircular = new ListaCircular<>();

        minhaListaCircular.add("c0");
        System.out.println(minhaListaCircular);

        minhaListaCircular.remove(0);
        System.out.println(minhaListaCircular);

        minhaListaCircular.add("c1");
        System.out.println(minhaListaCircular);

        minhaListaCircular.add("c2");
        minhaListaCircular.add("c3");
        System.out.println(minhaListaCircular);

        //System.out.println(minhaListaCircular.get(0));
        //System.out.println(minhaListaCircular.get(1));
        //System.out.println(minhaListaCircular.get(2));
        //System.out.println(minhaListaCircular.get(3));

        for(int i = 0; i < 20; i++){
            System.out.println(minhaListaCircular.get(i));
        }
    }
}
