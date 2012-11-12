package Produtos;

import java.util.Iterator;
import java.util.TreeSet;

public class BuscaProduto {

    private TreeSet<Produto> listaDeProdutos;

    public BuscaProduto() {
        this.listaDeProdutos = new TreeSet<Produto>();
    }

    public Produto obterProduto(Integer codigo) throws Exception{
        Iterator percorreLista = listaDeProdutos.iterator();
        Produto p;
        while(percorreLista.hasNext()){
            p = (Produto) percorreLista.next();
            if(p.getCodigo().equals(codigo)){
                return p;
            }
        }
        throw new Exception("ProdutoNaoEcontradoException");
    }
    public void exibirProdutos(){
        System.out.println(listaDeProdutos);
    }
    public void cargaInicial(){
        listaDeProdutos.add(new Produto("PS3","900.78",87158));
        listaDeProdutos.add(new Produto("Panela","15.84",59603));
        listaDeProdutos.add(new Produto("TV","845.29",27845));
        listaDeProdutos.add(new Produto("Liquidificador","78.45",90752));
        listaDeProdutos.add(new Produto("Calculadora","50.00",39156));
    }
}