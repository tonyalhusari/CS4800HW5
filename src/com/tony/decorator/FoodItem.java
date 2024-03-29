package com.tony.decorator;

public abstract class FoodItem {
    protected String name;

    public String getDescription() {
        return name;
    }

    public abstract double cost();

}
