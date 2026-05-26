package com.pluralsight;

import com.pluralsight.PizzaSizes.Large;
import com.pluralsight.PizzaSizes.Medium;
import com.pluralsight.PizzaSizes.Personal;

import java.util.Scanner;

public abstract class PizzaData implements Large, Medium, Personal {

    public double largePizza() {
        return 16.50;
    }


}
