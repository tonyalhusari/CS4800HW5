package com.tony.decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FoodItemTest {
    private FoodItem burger = new Burger();
    private FoodItem fries = new Fries();
    private FoodItem hotDog = new HotDog();

    @Test
    void getDescription() {
        String expected = "Burger";
        String actual = burger.getDescription();
        assertEquals(expected, actual);
    }

    @Test
    void cost() {
        double expected = 10.00;
        double actual = burger.cost();
        assertEquals(expected, actual);

    }
}