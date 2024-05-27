package org.esteem.controller;

import java.util.ArrayList;

import org.esteem.model.Biblioteca;
import org.esteem.model.Cliente;
import org.esteem.model.Loja;
import org.esteem.model.Produto;
import org.esteem.view.DeveloperView;


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
    
    public void modoDevMenu(DeveloperView developerView, Cliente Cliente, Loja loja, Biblioteca myGames) {
        developerView.clearInterface();
        while(true){
            developerView.showOptions();
            int input = developerView.getUserInput();
            switch(input){
                case 1:
                    developerView.clearInterface();
                    developerView.displayAskName();
                    String name = developerView.getDevInputName();
                    developerView.displayAskPrice();
                    int price = developerView.getDevInputPrice();
                    int Id = requestNewId();
                    String Dev = Cliente.getNome();
                    Produto game = new Produto(Id, name, Dev, price);
                    loja.add(game);
                    evaluateGame(game);
                    myGames.add(game);
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
                    Produto produto;
                    Produto produtoMy;
                    while(true){
                        developerView.displayAskNameModified();
                        nome = developerView.getDevInputName();
                        produto = loja.findByNome(nome);
                        produtoMy = myGames.findByNome(nome);
                        switch(input){
                            case 1:
                                developerView.clearInterface();
                                developerView.displayAskName();
                                nome=developerView.getDevInputName();
                                produto.setNome(nome);
                                produtoMy.setNome(nome);
                                break;
                            case 2:
                                developerView.clearInterface();
                                developerView.displayAskPrice();
                                developerView.getDevInputPrice();
                                price=developerView.getDevInputPrice();
                                produto.setPreco(price);
                                produtoMy.setPreco(price);

                                break;
                            case 3:
                                loja.remove(produto);
                                myGames.remove(produtoMy);
                                break;
                            case 4:
                                developerView.clearInterface();
                                return;
                            default:
                                developerView.clearInterface();
                                developerView.displayInputError();
                        }
                    }
                case 4:
                    developerView.clearInterface();
                    developerView.exitDev();
                    return;
                default:
                    developerView.clearInterface();
                    developerView.displayInputError();
            }
        }
    }
    public void addProduto(){
    }
    public boolean evaluateGame(Produto game) {
        return true; // Simulated game evaluation, always returns true (game approved)
    }
}
