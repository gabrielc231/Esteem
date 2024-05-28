package org.esteem.model;

import java.util.ArrayList;

public class Cliente {
    private int id;
    private String nome;
    private Biblioteca biblioteca;
    private Biblioteca myGames;

    public Cliente(int id, String nome, Biblioteca biblioteca, Biblioteca MyGames) {
        this.id = id;
        this.nome = nome;
        this.biblioteca = biblioteca;
        this.myGames = MyGames;
    }
    public Cliente(int id, String nome, Biblioteca biblioteca) {
        this.id = id;
        this.nome = nome;
        this.biblioteca = biblioteca;
        this.myGames = new Biblioteca();
    }
    public Cliente(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.biblioteca = new Biblioteca();
        this.myGames = new Biblioteca();
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
        return myGames.getProdutos();
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

    public Biblioteca getMyGames() {
        return myGames;
    }

    public void addProduto(Produto produto) {
        biblioteca.add(produto);
    }
    public void addMyProduto(Produto produto) {
        myGames.add(produto);
    }

    public Produto removeMyProduto(Produto produto) {
        Produto temp = produto;
        myGames.remove(produto);
        return temp;
    }
}
