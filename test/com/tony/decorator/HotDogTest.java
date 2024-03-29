package com.tony.decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HotDogTest {

    @Test
    void getDescription() {
        String expected = "Hot Dog";
        String actual = new HotDog().getDescription();
        assertEquals(expected, actual);
    }

    @Test
    void cost() {
        double expected = 8.00;
        double actual = new HotDog().cost();
        assertEquals(expected, actual);
    }
}