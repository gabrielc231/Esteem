package org.esteem.view;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BibliotecaView implements AppView {

    @Override
    public void clearInterface(){
        System.out.print("\033c");
    }

    @Override
    public void showOptions() {
        System.out.println("Biblioteca\n");
        System.out.println("Selecione uma das Opções:");
        System.out.println("1: Acessar um jogo");
        System.out.println("2: Mostrar Meus jogos");
        System.out.println("3: Entrar na Loja");
        System.out.println("4: Entrar no Modo Desenvolvedor");   
    }

    @Override
    public int getUserInput() {
        int input = -1;
        Scanner sc = new Scanner(System.in);
        try {
            input = Integer.parseInt(sc.nextLine());

        }
        catch(InputMismatchException | NumberFormatException ex) {
            System.out.println("Número de opção inválida");
        }

        return input;

    }
    public void displayAskName() {
        System.out.println("Nome do Jogo?\n");
    }
    public void displayAskPrice() {
        System.out.println("Preço do Jogo?\n");
    }

    public void showMyProducts(ArrayList produtos) {
        for(Object produto : produtos) {
            System.out.println(produto);
        }

    }
    public String getDevInputName(){
        String input = "";
        Scanner sc = new Scanner(System.in);
        input = sc.nextLine();
        sc.close();
        return input;
    }
    public int getDevInputPrice(){
        Scanner sc = new Scanner(System.in);
        int input = 0;
        while(true) {
            try {
                input = Integer.parseInt(sc.nextLine());
                break;
            }catch (NumberFormatException e){
                System.out.println("Número de opção inválida");
            }
        }
        sc.close();
        return input;
    }
    public void displayAskNameModified(){
        System.out.println("Nome do jogo a ser modificado");
    }

    public void displayInputError(){
        System.out.println("Entrada inválida");
    }
    public void exitDev(){
        System.out.println("Saindo do modo desenvolvedor");
    }
}




