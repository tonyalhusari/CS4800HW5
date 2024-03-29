package com.tony.decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheeseTest {

    @Test
    void getDescription() {
        String expected = "Burger, cheese";
        Cheese cheese = new Cheese(new Burger());
        String actual = cheese.getDescription();
        assertEquals(expected, actual);
    }

    @Test
    void cost() {
        double expected = 13.00;
        Cheese cheese = new Cheese(new Burger());
        double actual = cheese.cost();
        assertEquals(expected, actual);
    }
}