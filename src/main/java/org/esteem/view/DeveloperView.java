package org.esteem.view;

import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import org.esteem.controller.EsteemController;
import org.esteem.model.Produto;

public class DeveloperView implements AppView {
EsteemController controller;
    public DeveloperView() {
        
    }

    public DeveloperView(EsteemController ec) {
        controller = ec;
    }

    public void modoDevMenu() {
        clearInterface();
        while(true){
            showOptions();
            int input = getUserInput();
            switch(input) {
                case 1:
                    clearInterface();
                    displayAskName();
                    String name = getDevInputName();
                    displayAskPrice();
                    int price = getDevInputPrice();
                    controller.createProduto(name,price);
                    break;
                case 2:
                    clearInterface();
                    ArrayList myGames = controller.listProdutosMyGames();
                    showMyProducts(myGames);
                    getAnyInput();
                    break;
                case 3:
                    clearInterface();
                    while(true){
                        displayAskNameModified();
                        String nome = getDevInputName();
                        Produto produto = controller.searchProdutoLoja(nome);
                        Produto produtoMy = controller.searchProdutoMyGames(nome);
                        switch(input){
                            case 1:
                                clearInterface();
                                displayAskName();
                                nome=getDevInputName();
                                produto.setNome(nome);
                                produtoMy.setNome(nome);
                                break;
                            case 2:
                                clearInterface();
                                displayAskPrice();
                                getDevInputPrice();
                                price=getDevInputPrice();
                                produto.setPreco(price);
                                produtoMy.setPreco(price);
                                break;
                            case 3:
                                controller.removeProdutoLoja(produto);
                                controller.removeProdutoMyGames(produto);
                                break;
                            case 4:
                                clearInterface();
                                return;
                            default:
                                clearInterface();
                                displayInputError();
                        }
                    }
                case 4:
                    clearInterface();
                    exitDevMode();
                    return;
                default:
                    clearInterface();
                    displayInputError();
            }
        }
    }

    @Override
    public void clearInterface() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            }
            else {
                Runtime.getRuntime().exec("clear");
            }
        } catch (IOException | InterruptedException ex) {
            System.out.println("Não pode limpar a tela");
        }

    }

    @Override
    public void registerController(EsteemController ec) {
        this.controller = ec;
    }

    @Override
    public void showOptions() {
        System.out.println("Modo Desenvolvedor\n");
        System.out.println("Selecione uma das Opcoes:");
        System.out.println("1: Colocar jogo na Loja");
        System.out.println("2: Mostrar Meus jogos");
        System.out.println("3: Atualizar jogo");
        System.out.println("4: Sair do Modo Desenvolvedor");
    }

    @Override
    public int getUserInput() {
        int input = -1;
        Scanner sc = new Scanner(System.in);
        try {
            input = Integer.parseInt(sc.nextLine());

        }
        catch(InputMismatchException | NumberFormatException ex) {
            System.out.println("Numero de opcao invalida");
        }

        return input;

    }
    public void displayAskName() {
        System.out.println("Nome do Jogo?\n");
    }
    public void displayAskPrice() {
        System.out.println("Preco do Jogo?\n");
    }

    public void showMyProducts(ArrayList produtos) {
        for(Object produto : produtos) {
            System.out.println(produto);
        }

    }
    public String getDevInputName() {
        String input = "";
        Scanner sc = new Scanner(System.in);
        input = sc.nextLine();
        return input;
    }
    public int getDevInputPrice() {
        Scanner sc = new Scanner(System.in);
        int input = 0;
            try {
                input = Integer.parseInt(sc.nextLine());
            }catch (NumberFormatException e){
                System.out.println("Numero de opção invalida");
            }
        return input;
    }

    public void getAnyInput() {
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
    }

    public void displayAskNameModified(){
        System.out.println("Nome do jogo a ser modificado");
    }

    public void displayInputError(){
        System.out.println("Entrada invalida");
    }
    public void exitDevMode(){
        System.out.println("Saindo do Modo Desenvolvedor");
    }

    
}




