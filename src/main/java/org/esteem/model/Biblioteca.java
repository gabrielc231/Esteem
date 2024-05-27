package org.esteem.model;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Produto> produtos;

    public Biblioteca() {
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
}
