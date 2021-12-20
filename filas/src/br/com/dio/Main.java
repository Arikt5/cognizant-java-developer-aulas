package br.com.dio;

public class Main {
    /*
    Filas:
    O primeiro que chega sempre é o primeiro a sair. FIFO -> First in First Out.
    A informação do nó é um obj. O começo da fila guarda uma refrência de nó, e o último da fila (o cara
    da frente) aponta para null.
    Métodos:

   .enqueue() -> coloca um nó na entrada da fila  e faz a referência de nó apontar para ele.

   .dequeue() -> tira o primeiro da fila (o carinha lá da frente), e faz o anterior apontar para null.

   .isEmpty -> testar se está vazio.
   */

    public static void main(String[] args) {
        Fila minhaFila = new Fila();

        minhaFila.enqueue(new No("primeiro"));
        minhaFila.enqueue(new No("segundo"));
        minhaFila.enqueue(new No("terceiro"));
        minhaFila.enqueue(new No("quarto"));

        System.out.println(minhaFila);

        System.out.println(minhaFila.dequeue());

        System.out.println(minhaFila);

        minhaFila.enqueue(new No("ultimo"));

        System.out.println(minhaFila);

    }
}
