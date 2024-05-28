package org.esteem.controller;

import java.util.ArrayList;

import org.esteem.model.Biblioteca;
import org.esteem.model.Carrinho;
import org.esteem.model.Cliente;
import org.esteem.model.Loja;
import org.esteem.model.Produto;
import org.esteem.view.AppView;


public class EsteemController {
    private AppView view;
    private Carrinho carrinho;
    private Biblioteca biblioteca;
    private Cliente cliente;
    private Biblioteca myGames;
    private Loja loja;
    private int nextId;

    public EsteemController(AppView view) {
        nextId = 0;
        this.view = view;
    }

    public EsteemController() {
        nextId = 0;
    }

    public EsteemController(Cliente c, Loja l) {
        nextId = 0;
        setCliente(c);
        setLoja(l);
    }

    public int requestNewId() {
        return nextId++;
    }

    public void setLoja(Loja l) {
        loja = l;
    }

    public void setCliente(Cliente c) {
        cliente = c;
        carrinho = cliente.getCarrinho();
        myGames = cliente.getMyGames();
    }

    public String getClienteNome() {
        return cliente.getNome();
    }

    public Produto createProduto(String nome, int preco) {
        Produto novo = new Produto(nextId,nome,cliente.getNome(),preco);
        myGames.add(novo);
        return loja.add(novo);
    }

    public Produto createProduto(Produto produto) {
        return loja.add(produto);
    }

    public Produto updateProduto(String nomeProduto, String nome) {
        Produto atualizado = loja.findByNome(nomeProduto);
        atualizado.setNome(nome);
        return atualizado;
    }

    public Produto addProdutoBiblioteca(Produto produto) {
        return biblioteca.add(produto);
    }

    public Produto addProdutoLoja(Produto produto) {
        return createProduto(produto);
    }

    public Produto searchProdutoLoja(String nome) {
        return loja.findByNome(nome);
    }

    public Produto searchProdutoBiblioteca(String nome) {
        return biblioteca.findByNome(nome);
    }

    public Produto searchProdutoMyGames(String nome) {
        return myGames.findByNome(nome);
    }

    public Produto removeProdutoLoja(Produto produto) {
        return loja.remove(produto);
    }

    public Produto removeProdutoMyGames(Produto produto) {
        return myGames.remove(produto);
    }

    public ArrayList<Produto> listProdutosLoja() {
        return loja.getProdutos();
    }

    public ArrayList<Produto> listProdutosBiblioteca() {
        return biblioteca.getProdutos();
    }

    public ArrayList<Produto> listProdutosMyGames() {
        return myGames.getProdutos();
    }

    public ArrayList<Produto> listProdutosCarrinho() {
        return carrinho.getProdutos();
    }
    

    public boolean evaluateProduto(Produto produto) {
        return true; // Simulação da avaliação do jogo, sempre retorna verdadeiro
    }
}
