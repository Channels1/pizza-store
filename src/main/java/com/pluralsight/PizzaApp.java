package com.pluralsight;

import com.pluralsight.PizzaSizes.Large;

import java.util.Scanner;

public class PizzaApp {
    public static void main(String[] args) {
        Scanner uKey = new Scanner(System.in);

        PizzaMainMenu startMenu = new PizzaMainMenu();
        boolean run = true;


        while(run) {
        System.out.println("Welcome to Slice galore");
        System.out.println("==========================");
        System.out.println("Ready to order?");
        System.out.println("\t(1) New order");
        System.out.println("\t(0) exit");
        int choice = uKey.nextInt();
        uKey.nextLine();

        switch (choice) {
            case 1:
                startMenu.mainMenu();
                break;
            case 0:
                System.out.println("See ya around next time");
                uKey.close();
                run = false;
                System.exit(0);

            default: waitAndGo(uKey,"Wrong input try again");

        }

    }

}  public static void waitAndGo(Scanner ukey, String message) {
        System.out.println(message + "(press ENTER to continue");
        ukey.nextLine();
    }



}



