package com.tony.decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {
    Customer customer = new Customer("Tony");
    @Test
    void getName() {
        String expected = "Tony";
        String actual = customer.getName();
        assertEquals(expected, actual);
    }

    @Test
    void getLoyaltyStatus() {
        Loyalty expected = new LoyaltyStatus(Loyalty.NONE).getLoyalty();
        Loyalty actual = customer.getLoyaltyStatus().getLoyalty();
        assertEquals(expected, actual);
    }

    @Test
    void setLoyaltyStatus() {
        customer.setLoyaltyStatus(Loyalty.GOLD);
        Loyalty expected = new LoyaltyStatus(Loyalty.GOLD).getLoyalty();
        Loyalty actual = customer.getLoyaltyStatus().getLoyalty();
        assertEquals(expected, actual);
    }
}