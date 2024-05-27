package org.esteem.controller;

import org.esteem.model.Cliente;
import org.esteem.model.Produto;
import org.esteem.model.Bibloteca;
import org.esteem.view.DeveloperView;

import java.util.ArrayList;
import java.util.List;

public class EsteemController {
    private static int nextId = 1;
    private List<Produto> store;
    private List<Produto> clientes;

    public EsteemController() {
        this.store = new ArrayList<Produto>();
        this.clientes = new ArrayList<Produto>();
    }
    public void ModoDeve(){
        ModoDeveMenu();
    }

    public static int requestNewId() {
        return nextId++;
    }

    public void ModoDeveMenu(DeveloperView developerView,Cliente Cliente){
        developerView.clearInterface();
        while(true){
            developerView.showDeveOptions();
            int imput=developerView.getDeveInput();
            switch(imput){
                case 1:
                    developerView.clearInterface();
                    developerView.GameName();
                    String name = developerView.getDeveInputName();
                    developerView.GamePrice();
                    int price = developerView.getDeveInputprice();
                    int Id = requestNewId();
                    String Deve = Cliente.getNome();
                    Produto game = new Produto(Id, name, Deve, price);
                    //add loja
                    Cliente.addMyProduto(game);
                    developerView.clearInterface();
                    break;
                case 2:
                    developerView.clearInterface();
                    ArrayList<Produto> MyGames = Cliente.getMyProdutos();
                    developerView.clearInterface();
                    developerView.showMyProducts(MyGames);
                    break;
                case 3:
                    //mudar jogo
                case 4:
                    developerView.clearInterface();
                    developerView.SairDeve();
                    return;
                default:
                    developerView.clearInterface();
                    developerView.ErroEntrada();
            }
        }
    }
    public void addProduto(){
    }
    public boolean evaluateGame(Produto game) {
        return true; // Simulated game evaluation, always returns true (game approved)
    }

    public boolean addGameToStore(Produto game) {
        game.setId(requestNewId());
        return store.add(game); // Add the game to the store
    }

    public List<Jogo> getStore() {
        return store;
    }

    public boolean loginUser(String name) {
        for (Cliente cliente : clientes) {
            if (cliente.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public Cliente getClienteByName(String name) {
        for (Cliente cliente : clientes) {
            if (cliente.getName().equals(name)) {
                return cliente;
            }
        }
        return null;
    }

    public void addCliente(Cliente cliente) {
        clientes.add(cliente);
    }
}
