package org.esteem.model;

import java.util.ArrayList;

public class Carrinho {
    ArrayList<Produto> produtos;

    public Carrinho() {
        produtos = new ArrayList<>();
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

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public int getCusto() {
        int custo = 0;
        for (Produto item : produtos) {
            custo += item.getPreco();
        }
        return custo;
    }
}
