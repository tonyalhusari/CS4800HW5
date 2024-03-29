package com.tony.decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JalapenoTest {

    @Test
    void getDescription() {
        String expected = "Hot Dog, jalapeno";
        Jalapeno jalapeno = new Jalapeno(new HotDog());
        String actual = jalapeno.getDescription();
        assertEquals(expected, actual);
    }

    @Test
    void cost() {
        double expected = 9.00;
        Jalapeno jalapeno = new Jalapeno(new HotDog());
        double actual = jalapeno.cost();
        assertEquals(expected, actual);
    }
}