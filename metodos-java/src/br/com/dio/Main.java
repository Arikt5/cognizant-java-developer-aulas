package br.com.dio;

public class Main {
    public static void main(String[] args) {
        /*
        Método:
        Deve ser criado dentro de uma classe.

        criação:
        <?visibilidade><?tipo><?modificador> retorno nome (<?parâmetros?>)<?exceções?>corpo
        retorno, nome, parênteses e corpo são obrigatórios.

        VISIBILIDADE: public/ protected/ pivate (orientação a objeto)
        TIPO: concreto / abstrato (orientação a objeto)
        MODIFICADOR: static / final (orientação a objeto)
        RETORNO: tipo de dado -> qualquer tipo de dado primitivo, obj ou classe / void -> não retorna nada,
        executa apenas e nada mais é feito.
        NOME: nome que é fornecido ao método -> regra para definir o nome do método
        PARÂMETROS: parâmetros que pode receber -> se forem usados, estarão dentro dos parênteses. Se não forem
        usados, os parênteses estarão vazios.
        EXCEÇÕES: exceções que pode lançar -> labels que ele pode disparar.
        CORPO: códigos que possiu vazio (orientação a objeto)

        V R N P C são os mais utilizados.

        exemplos:

        public String getNome() {} -> retorna string, sem parâmetro

        public double calcularTotalNota() {} -> retorna double, sem parâmetro

        public int verificarDistancia(int coordenada1, int coodenada2) {} ->  retorna int, com parâmetros
        sendo tipos primitivos

        public abstract void executar(); -> retorna nada, corpo vazio (não abre chaves)

        public void alterarFabricante(Fabricante fabricante) {} -> Fabricante (obj) como parâmetro

        public Relatorio gerarDadosAnaliticos(Cliente cliente, List<Compra> compras) {} -> tipos de dados
        complexos como parâmetros

        public static R N(P) {}

        Forma de utilizar:
        Tem que chamar o método para utilizá-lo. Ele não funciona sozinho. Chama-se a partir de uma
        classe ou obj.

        nome_da_classe.nome_do_metodo(); ou nome_da_classe.nome_do_metodo(...);

        nome_do_objeto.nome_do_metodo(); ou nome_do_objeto.nome_do_metodo(...);

        Math.random(); ou Math.sqrt(4);

        usuario.getEmail(); ou usuarioAlterarEndereco(endereco);

        Classe tem a primeira letra em maiúsculo e obj tem a primeira letra e minúsculo.

        Particularidades:
        Assinatura: forma única de identificar o método: nome + parâmetros. Se não tiver os parâmetros, será
        os parênteses.

        Construtor e Destrutor: métodos especiais usados na Orientação a Objetos. Construtor cria objs e o
        destrutor os destrói.

        Mensagem: ato de executar o método. Pode ser direcionada a obj ou classe.

        Passagem de parâmetros pode ser por valor (cópia) ou por referência (endereço).

        valor:
        int i = 10;
        public void fazerAlgo (int i){ -> foi criada uma cópia do i, tudo o que se fizer aqui dentro não vai refletir fora
            i = i + 10;
            System.out.println("Valor de i dentro: "  + i);
        }
        System.out.println("Valor de i fora: "  + i);

        referência -> (orientação a obj) seria o oposto da passagem por valor.
        */

        //os exercícios executarão aqui

        //Calculadora
        System.out.println("Exercício Calculadora");
        Calculadora.soma(7,9);
        Calculadora.subtracao(20,40);
        Calculadora.multiplicacao(200,50.9);
        Calculadora.divisao(400,40.7);

        //Mensagem
        System.out.println("Exercício Mensagem");
        Menssagem.obterMensagem(8);
        Menssagem.obterMensagem(15);
        Menssagem.obterMensagem(22);

        //Emprestimo
        System.out.println("Exercício Empréstimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());//-> passando método como parâmetro;
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(100,5);

    }
}
