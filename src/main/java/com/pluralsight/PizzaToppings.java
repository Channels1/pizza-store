package com.pluralsight;


import java.util.ArrayList;
import java.util.List;

public class PizzaToppings<T> {
    //fields
    private List<T> toppings;

    //Premium list Meat and Cheese
    public ArrayList<String> getToppingsPremiumMeat() {
        getToppingsPremiumMeat().add("Pepperoni");
        getToppingsPremiumMeat().add("Sausage");
        getToppingsPremiumMeat().add("Ham");
        getToppingsPremiumMeat().add("Bacon");
        getToppingsPremiumMeat().add("Chicken");
        getToppingsPremiumMeat().add("MeatBall");


        return getToppingsPremiumMeat();
    }

    public ArrayList<String> getToppingsChesse() {
        getToppingsChesse().add("Mozzarella");
        getToppingsChesse().add("Parmesan");
        getToppingsChesse().add("Ricotta");
        getToppingsChesse().add("Goat Cheese");
        getToppingsChesse().add("Buffalo");

        return getToppingsChesse();
    }

    public ArrayList<String> getToppingsRegular() {
        getToppingsRegular().add("Onions");
        getToppingsRegular().add("Mushrooms");
        getToppingsRegular().add("Bell peppers");
        getToppingsRegular().add("Olives");
        getToppingsRegular().add("Tomatoes");
        getToppingsRegular().add("Spinach");
        getToppingsRegular().add("Basil");
        getToppingsRegular().add("Pineapples");
        getToppingsRegular().add("Anchovies");

        return getToppingsRegular();
    }


    public PizzaToppings() {
        this.toppings = new ArrayList<>();
    }

}
