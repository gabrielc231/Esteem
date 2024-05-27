package org.esteem.model;

import java.util.ArrayList;

public class Cliente {
    private int id;
    private String nome;
    private Biblioteca biblioteca;
    private Biblioteca MyGames= new Biblioteca();

    public Cliente(int id, String nome, Biblioteca biblioteca, Biblioteca MyGames) {
        this.id = id;
        this.nome = nome;
        this.biblioteca = biblioteca;
        this.MyGames = MyGames;
    }

    @Override
    public String toString() {
        return  "\nId: "+id+
                "\nNome:"+nome;
    }

    public int getId() {
        return id;
    }

    public ArrayList<Produto> getProdutosDisponiveis() {
        return biblioteca.getProdutos();
    }
    public ArrayList<Produto> getMyProdutos() {
        return MyGames.getProdutos();
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void addProduto(Produto produto) {
        biblioteca.add(produto);
    }
    public void addMyProduto(Produto produto) {
        MyGames.add(produto);
    }

}
