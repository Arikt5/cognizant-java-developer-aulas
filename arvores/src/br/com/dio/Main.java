package br.com.dio;

import br.com.dio.model.Obj;

public class Main {
    /*
    Árvores:
    É uma estrutura de dados bidimensional não linear, enquanto listas, filas e pilhas são lineares.
    Os nós representam modelo de dados hierárquico (dados dependem uns dos outros), onde existem:
    Nó raiz -> o nó que dá origem aos outros.
    pai -> tem descendentes;
    filho -> descendem do nó pai;
    Irmãos -> descendem do mesmo nó pai;
    Nível -> níveis de uma árvore. Começa na raiz como nível 0, e vai descendo.
    Profundidade -> está ligada ao nível. Se vai até nível 3, a profundidade é três.
    Nó folha -> nó que não tem descendentes;
    Nó interno -> diferente do nó folha, eles têm descendentes e estão abaixo da raiz;
    Graus -> indicado pelo número de filhos. Grau 0, 1, 2 e 3
    Sub-árvores -> formada a partir de um nó da árvore principal que tem filhos, que é considerado um ramo;


    Árvore de busca binária:
    Nesse tipo de árvore, os nós maiores ficam à direita e os menores à esquerda.
    Tem-se na implementação a referência para o nó da direita e para o da esquerda.
    Nos nós finais aponta-se para null, nesse caso sabe-se que se está em uma folha.

    Operações básicas em árvores de busca binária:
    Exclusão: Pega o maior elemento da esquerda e substitui pelo maior após ele;
    Adição: testa se o novo nó é maior que o nó raiz para saber onde adicioná-lo na árvore;
    Exibição: entra em um loop que tende a ir para a esquerda onde mostra o nó atual;

    Atravessamento em árvores binárias:
    In-Ordem -> visita o nó à esquerda, exibe o nó e visita o nó à direita; retorna os valores em
    ordem crescente;
    Pré-Ordem -> entra pela raiz e a exibe, visita as sub-árvores à esquerda, depois as da direita,
    e volta em um loop exibindo os valores (traçar diagonais da direita para a esquerda ajuda a saber
    qual a ordem de saída do valor da árvore exibida). Exibe para visitar.
    Pós-Ordem -> Visita para exibir. Contrário do Pré-Ordem.
     */
    public static void main(String[] args) {
        ArvoreBinaria<Obj> minhaArvore = new ArvoreBinaria<Obj>();

        minhaArvore.inserir(new Obj(13));
        minhaArvore.inserir(new Obj(10));
        minhaArvore.inserir(new Obj(25));
        minhaArvore.inserir(new Obj(2));
        minhaArvore.inserir(new Obj(12));
        minhaArvore.inserir(new Obj(20));
        minhaArvore.inserir(new Obj(31));
        minhaArvore.inserir(new Obj(29));
        minhaArvore.inserir(new Obj(32));

        minhaArvore.exibirInOrdem();
        minhaArvore.exibirPreOrdem();
        minhaArvore.exibirPosOrdem();

    }
}
