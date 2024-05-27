package org.esteem.model;

public class Produto {
    private int id;
    private String nome;
    private String autor;
    private int preco;

    public Produto(int id,String nome, String autor, int preco) {
        this.id = id;
        this.nome = nome;
        this.autor = autor;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return nome;
    }

    public int getId() {
        return id;
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

    public String getAutor() {
        return autor;
    }

    public int getPreco() {
        return preco;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setPreco(int preco) {
        if (preco < 0) {
            preco *= -1;
        }

        this.preco = preco;
    }
}
