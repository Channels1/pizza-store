package com.pluralsight;


import com.pluralsight.PizzaSizes.Pizza;

public class PizzaData implements Pizza {
    //Fields
    private String size;
    private String crust;
    private double price;

    public PizzaData(String size, String crust) {
        this.size = size;
        this.crust = crust;
    }


    @Override
    public double getPrice() {
        switch (size) {
            case "small":
                return 8.00;
            case "Medium":
                return 10.00;
            case "Large":
                return 16.50;
            default:
                return 0;
        }
    }

    @Override
    public String getDescription() {
        return size + " " + crust + "Pizza";
    }
}