package com.tony.decorator;

public class Fries extends FoodItem {
    public Fries() {
        name = "Fries";
    }


    @Override
    public double cost() {
        return 5.00;
    }
}
