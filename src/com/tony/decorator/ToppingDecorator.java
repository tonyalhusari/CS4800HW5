package com.tony.decorator;

public abstract class ToppingDecorator extends FoodItem {
    protected FoodItem foodItem;

    public ToppingDecorator(FoodItem foodItem) {
        this.foodItem = foodItem;
    }

    @Override
    public abstract String getDescription();

    @Override
    public double cost() {
        return foodItem.cost();
    }
}
