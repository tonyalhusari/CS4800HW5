package com.tony.decorator;

public class HotDog extends FoodItem {
    public HotDog() {
        name = "Hot Dog";
    }


    @Override
    public double cost() {
        return 8.00;
    }
}
