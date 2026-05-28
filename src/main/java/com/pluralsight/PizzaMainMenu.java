package com.pluralsight;

import com.pluralsight.PizzaSizes.Personal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PizzaMainMenu  {
private Scanner ukey = new Scanner(System.in);
PizzaApp menu1 = new PizzaApp();

public void mainMenu() {
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
                addPizza(ukey);
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
                run = false;
                break;

        }
    }
}
public void addPizza(Scanner ukey) {
    boolean run = true;

    while (run) {
        System.out.println("Select your type: ");
        System.out.println("\t1) Thin");
        System.out.println("\t2) Regular");
        System.out.println("\t3) Thick");
        System.out.println("\t4) Cauliflower ");
        System.out.print("Input here: ");
        int crust = ukey.nextInt();

        System.out.println("Pizza size?");
        System.out.println("\t1) Small");
        System.out.println("\t2) Medium");
        System.out.println("\t3) Large");
        System.out.print("Input here: ");
        int size = ukey.nextInt();

        System.out.println("Choose your toppings");
        System.out.println("Meats:");
        System.out.println("\t1) Pepperoni");
        System.out.println("\t2) Sausage");
        System.out.println("\t3) Ham");
        System.out.println("\t4) Bacon");
        System.out.println("\t5) Chicken");
        System.out.println("\t6) Meatball");
        System.out.println("\t0) No Meat");
        System.out.print("Your choice: ");

        int meatToppings = ukey.nextInt();

        System.out.println("Cheese:");
        System.out.println("\t1) Mozzarella");
        System.out.println("\t2) Parmesan");
        System.out.println("\t3) Ricotta");
        System.out.println("\t4) Goat Cheese");
        System.out.println("\t5) Buffalo");
        System.out.println("\t0) No extra cheese");
        System.out.print("Your Choice: ");

        int cheeseToppings = ukey.nextInt();

        System.out.println("Other toppings:");
        System.out.println("\t1) Onions");
        System.out.println("\t2) Mushrooms");
        System.out.println("\t3) Bell Peppers");
        System.out.println("\t4) Olives");
        System.out.println("\t5) Tomatoes");
        System.out.println("\t6) Spinach");
        System.out.println("\t7) Basil");
        System.out.println("\t8) Pineapples");
        System.out.println("\t9) Anchovies");
        System.out.println("\t0) No other toppings");
        System.out.print("Your Choice: ");
        int regularToppings = ukey.nextInt();

        switch (crust) {
            case 1:




        }

    }

    }


    }


