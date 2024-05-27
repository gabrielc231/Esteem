package org.esteem.model;

import java.util.ArrayList;

public class ProdutosLoja {
    private ArrayList<Produto> produtos;
    
    public ProdutosLoja() {
        produtos =  new ArrayList<>();
    }

    public Produto add(Produto novo) {
        produtos.add(novo);

        return novo;
    }

    public Produto remove(Produto removido) {
        Produto temp = removido;
        produtos.remove(removido);

        return temp;
    }

    public ArrayList<Produto> get() {
        return produtos;
    }
}
