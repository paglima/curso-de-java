package Produtos;

import java.math.BigDecimal;

public class Produto implements Comparable<Produto>{

    private Integer codigo;
    private String descricao;
    private BigDecimal preco;

    public Produto(String descricao, String preco, Integer codigo) {
        this.descricao = descricao;
        this.preco = new BigDecimal(preco);
        this.codigo = new Integer(codigo);

    }

    public int compareTo(Produto outro) {
        if (outro == null) {
            return -1;
        }
        if (this.codigo < outro.codigo) {
            return -1;
        }
        if (this.codigo > outro.codigo) {
            return 1;
        }
        return 0;
    }

    public Integer getCodigo() {
        return codigo;
    }

    @Override
    public boolean equals(Object outro) {
        if (outro == null) {
            return false;
        }
        if (this.getClass() != outro.getClass()) {
            return false;
        }
        final Produto novo = (Produto) outro;
        if (this.codigo != novo.codigo && (this.codigo == null || !this.codigo.equals(novo.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + (this.codigo != null ? this.codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return this.descricao+" R$"+this.preco+" cod:"+this.codigo;
    }
}