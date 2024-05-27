package org.esteem.controller;

import org.esteem.model.Cliente;
import org.esteem.model.Jogo;

import java.util.ArrayList;
import java.util.List;

public class EsteemController {
    private static int nextId = 1;
    private List<Jogo> store;
    private List<Cliente> clientes;

    public EsteemController() {
        this.store = new ArrayList<Jogo>();
        this.clientes = new ArrayList<Cliente>();
    }

    public static int requestNewId() {
        return nextId++;
    }

    public boolean evaluateGame(Jogo game) {
        return true; // Simulated game evaluation, always returns true (game approved)
    }

    public boolean addGameToStore(Jogo game) {
        game.setId(requestNewId());
        return store.add(game); // Add the game to the store
    }

    public List<String> viewMyGames(String userName) {
        List<String> myGames = new ArrayList<String>();
        for (Jogo jogo : store) {
            if (jogo.getDeveloperName().equals(userName)) {
                myGames.add("ID: " + jogo.getId() + ", Name: " + jogo.getName() + ", Price: $" + jogo.getPrice());
            }
        }
        return myGames;
    }

    public List<String> viewAllGames() {
        List<String> allGames = new ArrayList<String>();
        for (Jogo jogo : store) {
            allGames.add("ID: " + jogo.getId() + ", Name: " + jogo.getName() + ", Developer: " + jogo.getDeveloperName() + ", Price: $" + jogo.getPrice());
        }
        return allGames;
    }

    public String getSuccessMessage() {
        return "The game has been successfully added to the store!";
    }

    public String getDenialMessage() {
        return "The publication of the game has been denied.";
    }

    public String getErrorMessage() {
        return "Error adding the game to the store.";
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
