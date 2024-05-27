package org.esteem.view;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DeveloperView implements AppView {
    
    @Override
    public void clearInterface() {
        System.out.print("\033c");
    }

    @Override
    public void showDeveOptions() {
        System.out.println("Modo desenvolvedor\n");
        System.out.println("Selecione uma das Opções:");
        System.out.println("1: colocar jogo");
        System.out.println("2: Mostrar Meus jogos");
        System.out.println("3: Atualiasr jogo");
        System.out.println("4: sair do modo desenvolvedor");
    }

    @Override
    public int getDeveInput() throws Exception {
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

    public void showMyProducts(ArrayList produtos) {
        for(Object produto : produtos) {
            System.out.println(produto);
        }

    }
    public string getDeveInputSring(){
        string input = "";
        Scanner sc = new Scanner(System.in);
        input = Integer.parseInt(sc.nextLine());
        return input
    }
    
}














