package org.esteem.view;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DeveloperView implements AppView{

    @Override
    public void clearInterface(){
        System.out.print("\033c");
    }

    @Override
    public void showOptions() {
        System.out.println("Modo desenvolvedor\n");
        System.out.println("Selecione uma das Opções:");
        System.out.println("1: colocar jogo");
        System.out.println("2: Mostrar Meus jogos");
        System.out.println("3: Atualiasr jogo");
        System.out.println("4: sair do modo desenvolvedor");
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
    public void GameName(){
        System.out.println("Nome do Jogo\n");
    }
    public void GamePrice(){
        System.out.println("Preso do Jogo\n");
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
    public void JogoAtualizada(){
        System.out.println("Nome do jogo a ser modificado");
    }

    public void ErroEntrada(){
        System.out.println("Entrada inválida");
    }
    public void SairDev(){
        System.out.println("Saindo do modo desenvolvedor");
    }
}




