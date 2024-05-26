package org.esteem;
import java.util.Scanner;

import org.esteem.view.LojaView;

public class App 
{
    public static void main( String[] args )
    {
        Scanner sc1 = new Scanner(System.in);
        LojaView v = new LojaView();
        System.out.println( "Hello World!" );
        v.showLojaOptions();
        if (sc1.nextLine().equals("clear")) {
            v.clearConsole();
        }
        System.out.println(":)");
        sc1.close();
    }
}
