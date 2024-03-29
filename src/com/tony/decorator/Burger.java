package com.tony.decorator;

public class Burger extends FoodItem {
    public Burger() {
        name = "Burger";
    }


    @Override
    public double cost() {
        return 10.00;
    }
}
