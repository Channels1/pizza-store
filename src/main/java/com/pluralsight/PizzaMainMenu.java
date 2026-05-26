package com.pluralsight;

import java.util.Scanner;

public class PizzaMainMenu {
private Scanner ukey = new Scanner(System.in);

public void mainMenu(String[] String) {
    boolean run = true;

    while (run) {
        System.out.println("\n===Main Menu====");
        System.out.println("\t1) Add Pizza");
        System.out.println("\t2) Add Drink");
        System.out.println("\t3) Add Garlic Knots");
        System.out.println("\t4) Checkout");
        System.out.println("\t0) Cancel order");
        int choice = ukey.nextInt();

        switch (choice) {
            case 1:
                //add pizza
                break;
            case 2:
                // add drink
                break;
            case 3:
                //add Garlic Knots
                break;
            case 4:
                // checkout
                break;
            case 0:
                //Cancel order
                PizzaApp.main(String);
                break;

        }
    }
}

}
