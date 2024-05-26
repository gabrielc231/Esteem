package org.esteem.model;

import java.util.ArrayList;

public class ProdutosLoja {
    ArrayList<Produto> produtos =  new ArrayList<>();
    
    public Produto addProduto(Produto novo) {
        produtos.add(novo);

        return novo;
    }

    public Produto removeProduto(Produto removido) {
        Produto temp = removido;
        produtos.remove(removido);

        return temp;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }
}
