package com.tony.decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
class OrderTest {

    Customer customer = new Customer("Tony");

    Order order = new Order(customer);


    @Test
    void addFoodItem() {
        FoodItem foodItem = new HotDog();
        order.addFoodItem(foodItem);

        String expected = "Hot Dog";
        String actual = order.getFoodItem(0).getDescription();
        assertEquals(expected, actual);
    }

    @Test
    void getTotalPrice() {
        order.addFoodItem(new HotDog());
        order.addFoodItem(new Cheese(new Burger()));

        double expected = 21.00; //10+3+8
        double actual = order.getTotalPrice();
        assertEquals(expected, actual);
    }

    @Test
    void getDiscount() {
        customer.setLoyaltyStatus(Loyalty.SILVER);
        order.addFoodItem(new HotDog());
        order.addFoodItem(new Cheese(new Burger()));

        double expected = 2.1; //0.1*21
        double actual = order.getDiscount();
        assertEquals(expected, actual);
    }

    @Test
    void getTotalPriceWithDiscount() {
        customer.setLoyaltyStatus(Loyalty.SILVER);
        order.addFoodItem(new HotDog());
        order.addFoodItem(new Cheese(new Burger()));

        double expected = 18.9; //21 - 0.1*21
        double actual = order.getTotalPriceWithDiscount();
        assertEquals(expected, actual);
    }

    @Test
    void getCustomer() {
        String expected = "Tony";
        String actual = order.getCustomer().getName();
        assertEquals(expected, actual);
    }

    @Test
    void printFoodItems() {
        order.addFoodItem(new HotDog());
        order.addFoodItem(new Cheese(new Burger()));
        String expected = "Hot Dog\nBurger, cheese\n";

        String actual = order.printFoodItems();

        assertEquals(expected, actual);
    }
}