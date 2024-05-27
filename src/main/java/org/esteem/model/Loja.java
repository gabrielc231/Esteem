package org.esteem.model;

import java.util.ArrayList;

public class Loja {
    private ArrayList<Produto> produtos;

    public Loja() {
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

    public Produto findByNome(String nome) {
        for(Produto produto : produtos) {
            if (produto.getNome().equals(nome));
            return produto;
        }
        return null;
    }

    public Produto findById(int id) {
        for(Produto produto : produtos) {
            if (produto.getId() == id);
            return produto;
        }
        return null;
    }
    
    public ArrayList<Produto> getProdutos() {
        return produtos;
    }
}
