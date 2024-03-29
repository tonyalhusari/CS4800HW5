package com.tony.decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KetchupTest {

    @Test
    void getDescription() {
        String expected = "Fries, ketchup";
        Ketchup ketchup = new Ketchup(new Fries());
        String actual = ketchup.getDescription();
        assertEquals(expected, actual);
    }
    @Test
    void getDescription2() {
        String expected = "Fries, cheese, ketchup";
        Ketchup ketchup = new Ketchup(new Cheese(new Fries()));
        String actual = ketchup.getDescription();
        assertEquals(expected, actual);
    }
    @Test
    void cost() {
        double expected = 7.00;
        Ketchup ketchup = new Ketchup(new Fries());
        double actual = ketchup.cost();
        assertEquals(expected, actual);
    }

    @Test
    void cost2() {
        double expected = 10.00;
        Ketchup ketchup = new Ketchup(new Cheese(new Fries()));
        double actual = ketchup.cost();
        assertEquals(expected, actual);
    }
}