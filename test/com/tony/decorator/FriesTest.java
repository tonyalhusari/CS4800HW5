package com.tony.decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FriesTest {

    @Test
    void getDescription() {
        String expected = "Fries";
        String actual = new Fries().getDescription();
        assertEquals(expected, actual);
    }

    @Test
    void cost() {
        double expected = 5.00;
        double actual = new Fries().cost();
        assertEquals(expected, actual);
    }
}