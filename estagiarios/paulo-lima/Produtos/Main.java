package Produtos;


/*
 Crie um pacote produtos. Dentro dele crie a classe Produto
 com os atributos codigo (Integer), descricao (String) e preco (BigDecimal).
 Crie para ela os métodos equals e hashCode (baseados no codigo),  e faça com
 que implemente Comparable<Produto> baseando o compareTo na descrição.
 Sobrescreva também o método toString. Crie uma classe BuscaProdutos com um
 atributo TreeSet de produtos e com os métodos obterProduto(Integer codigo),
 exibirProdutos() e cargaInicial(). O método carga inicial será chamado para
 inicializar o treeset com alguns produtos.
 Crie uma exceção chamada ProdutoNaoEncontradoException que será lançada
 quando obterProduto não encontrar o produto referente ao código informado.
 Crie um método main para testar tudo que foi feito
*/
public class Main {

    public static void main(String[] args) throws Exception {
        BuscaProduto busca = new BuscaProduto();
        busca.cargaInicial();
        busca.exibirProdutos();
        System.out.println(busca.obterProduto(59603));
       // System.out.println(busca.obterProduto(12312));
        Produto microondas = new Produto("microondas","120.30",63452);
        Produto celular = new Produto("celular","350.80",14239);
        System.out.println(celular.compareTo(celular));
        System.out.println(celular.compareTo(microondas));
        System.out.println(celular.equals(microondas));
        System.out.println(celular.equals(celular));
        System.out.println(celular.hashCode());
        System.out.println(microondas.hashCode());
    }
}