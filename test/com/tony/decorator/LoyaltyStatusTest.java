package com.tony.decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoyaltyStatusTest {
    LoyaltyStatus loyaltyStatus = new LoyaltyStatus(Loyalty.GOLD);

    @Test
    void setLoyalty() {
        Loyalty loyalty = Loyalty.SILVER;
        Loyalty expected = loyalty;

        loyaltyStatus.setLoyalty(loyalty);
        Loyalty actual = loyaltyStatus.getLoyalty();

        assertEquals(expected, actual);
    }

    @Test
    void getLoyalty() {
        Loyalty expected = Loyalty.GOLD;
        Loyalty actual = loyaltyStatus.getLoyalty();
        assertEquals(expected, actual);
    }

    @Test
    void getDiscount() {
        double price = 100;
        double expected = 20;
        double actual = loyaltyStatus.getDiscount(price);
        assertEquals(expected, actual);
    }
}