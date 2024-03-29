package com.tony.decorator;

public class Cheese extends ToppingDecorator {
    public Cheese(FoodItem foodItem) {
        super(foodItem);
    }

    @Override
    public String getDescription() {
        return foodItem.getDescription() + ", cheese";
    }

    @Override
    public double cost() {
        return foodItem.cost() + 3.00;
    }
}
