package com.tony.decorator;

public class Ketchup extends ToppingDecorator {
    public Ketchup(FoodItem foodItem) {
        super(foodItem);
    }

    @Override
    public String getDescription() {
        return foodItem.getDescription() + ", ketchup";
    }

    @Override
    public double cost() {
        return foodItem.cost() + 2.00;
    }
}
