package com.tony.decorator;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private Customer customer;
    private List<FoodItem> foodItems;

    public Order(Customer customer) {
        this.customer = customer;
        this.foodItems = new ArrayList<>();
    }

    public void addFoodItem(FoodItem foodItem) {
        foodItems.add(foodItem);
    }

    public FoodItem getFoodItem(int index) {
        return foodItems.get(index);
    }



    public double getTotalPrice() {
        double totalPrice = 0.0;
        for (FoodItem foodItem : foodItems) {
            totalPrice += foodItem.cost();
        }
        return totalPrice;
    }

    public double getDiscount() {
        return customer.getLoyaltyStatus().getDiscount(getTotalPrice());
    }

    public double getTotalPriceWithDiscount() {
        return getTotalPrice() - getDiscount();
    }

    public Customer getCustomer() {
        return customer;
    }
    public String printFoodItems() {

        String foodItem = "";
        for (FoodItem foodItem1 : foodItems) {
            foodItem += foodItem1.getDescription() + "\n";
        }
        return foodItem;
    }
}
