package com.tony.decorator;

public class LoyaltyStatus {
    private Loyalty loyalty;

    public LoyaltyStatus(Loyalty loyalty) {
        this.loyalty = loyalty;
    }

    public void setLoyalty(Loyalty loyalty) {
        this.loyalty = loyalty;
    }

    public Loyalty getLoyalty() {
        return loyalty;
    }

    public double getDiscount(double price) {
        double discount = 0;
        if (loyalty == Loyalty.GOLD) {
            discount = price * 0.2;
        }
        else if (loyalty == Loyalty.SILVER) {
            discount = price * 0.1;
        }
        else if (loyalty == Loyalty.BRONZE) {
            discount = price * 0.05;
        }
        return discount;
    }
}
