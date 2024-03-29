package com.tony.decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BurgerTest {

    @Test
    void getDescription() {
        String expected = "Burger";
        String actual = new Burger().getDescription();
        assertEquals(expected, actual);
    }

    @Test
    void cost() {
        double expected = 10.00;
        double actual = new Burger().cost();
        assertEquals(expected, actual);
    }
}