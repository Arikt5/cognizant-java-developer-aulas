package br.com.dio;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Carro> queueCarros = new LinkedList<>();

        queueCarros.add(new Carro("Ford"));
        queueCarros.add(new Carro("Chevrolet"));
        queueCarros.add(new Carro("Fiat"));

        System.out.println(queueCarros.add(new Carro("Peugeot"))); //adiciona ao final da fila. se não conseguir dá erro..
        System.out.println(queueCarros);

        System.out.println(queueCarros.offer(new Carro("Renault"))); //adiciona ao final da fila. se não conseguir retorna false.
        System.out.println(queueCarros);

        System.out.println(queueCarros.peek()); //apenas mostra o primeiro da fila sem remover
        System.out.println(queueCarros);

        System.out.println(queueCarros.poll()); //remove o primeiro da fila.
        System.out.println(queueCarros);

        System.out.println(queueCarros.isEmpty()); //diz se a fila está vazia ou não.

        System.out.println(queueCarros.size()); //diz o tamanho da fila.
    }
}
