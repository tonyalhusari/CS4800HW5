package com.tony.decorator;

public class Jalapeno extends ToppingDecorator {
    public Jalapeno(FoodItem foodItem) {
        super(foodItem);
    }

    @Override
    public String getDescription() {
        return foodItem.getDescription() + ", jalapeno";
    }

    @Override
    public double cost() {
        return foodItem.cost() + 1.00;
    }
}
