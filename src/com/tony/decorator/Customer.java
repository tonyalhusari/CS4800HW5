package com.tony.decorator;

public class Customer {
    private String name;
    private LoyaltyStatus loyaltyStatus;

    public Customer(String name) {
        this.name = name;

        this.loyaltyStatus = new LoyaltyStatus(Loyalty.NONE);

    }

    public String getName() {
        return name;
    }

    public LoyaltyStatus getLoyaltyStatus() {
        return loyaltyStatus;
    }

    public void setLoyaltyStatus(Loyalty loyalty) {
        this.loyaltyStatus.setLoyalty(loyalty);
    }
}
