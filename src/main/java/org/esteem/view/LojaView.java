package org.esteem.view;

import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import org.esteem.controller.EsteemController;


public class LojaView implements AppView {
    
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
        throw new UnsupportedOperationException("Not supported yet.");
    }


    @Override
    public void showOptions() {
        System.out.println("Loja\n");
        System.out.println("Selecione uma das Opcoes:");
        System.out.println("1: Comprar jogo");
        System.out.println("2: Mostrar jogos disponiveis");
        System.out.println("3: Entrar na Biblioteca");
        System.out.println("4: Entrar no Modo Desenvolvedor");
    }

    @Override
    public int getUserInput() throws Exception {
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

    public void getAnyInput() {
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
    }

    public void showProdutos(ArrayList produtos) {
        for(Object produto : produtos) {
            System.out.println(produto);
        }

    }

    public void displayInputError(){
        System.out.println("Entrada invalida");
    }

    public void enterDevMode(){
        System.out.println("Entrando no Modo Desenvolvedor");
    }


}