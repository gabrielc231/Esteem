package org.esteem.controller;

import org.esteem.model.Cliente;
import org.esteem.model.Loja;
import org.esteem.model.Produto;
import org.esteem.model.Biblioteca;
import org.esteem.view.DeveloperView;

import java.util.ArrayList;
import java.util.List;


public class EsteemController {
    private static int nextId = 1;

    public EsteemController() {
        
    }
    public void ModoDeve(){
        //ModoDeveMenu();
    }

    public static int requestNewId() {
        return nextId++;
    }

    public void ModoDeveMenu(DeveloperView developerView,Cliente Cliente,Loja Loja){
        developerView.clearInterface();
        while(true){
            developerView.showOptions();
            int imput=developerView.getUserInput();
            switch(imput){
                case 1:
                    developerView.clearInterface();
                    developerView.GameName();
                    String name = developerView.getDevInputName();
                    developerView.GamePrice();
                    int price = developerView.getDevInputPrice();
                    int Id = requestNewId();
                    String Deve = Cliente.getNome();
                    Produto game = new Produto(Id, name, Deve, price);
                    Loja.add(game);
                    evaluateGame(game);
                    Cliente.addMyProduto(game);
                    break;
                case 2:
                    developerView.clearInterface();
                    ArrayList<Produto> MyGames = Cliente.getMyProdutos();
                    developerView.clearInterface();
                    developerView.showMyProducts(MyGames);
                    break;
                case 3:
                    developerView.clearInterface();
                    String nome;
                    while(true){
                        developerView.JogoAtualizada();
                        developerView.JogoAtualizada();
                        nome = developerView.getDevInputName();
                        switch(imput){
                            case 1:
                                developerView.clearInterface();
                                developerView.GameName();
                                developerView.getDevInputName();
                                //Mudar nome
                                break;
                            case 2:
                                developerView.clearInterface();
                                developerView.GamePrice();
                                developerView.getDevInputPrice();
                                break;
                            case 3:
                                
                                Loja.remove(nome);
                                break;
                            case 4:
                                developerView.clearInterface();
                                return;
                            default:
                                developerView.clearInterface();
                                developerView.ErroEntrada();
                        }
                    }
                case 4:
                    developerView.clearInterface();
                    developerView.SairDev();
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
}
