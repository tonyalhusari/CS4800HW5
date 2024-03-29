package com.tony.decorator;

public class RestaurantDemo {
    public static void main(String[] args) {
        Customer tony = new Customer("Tony");
        tony.setLoyaltyStatus(Loyalty.BRONZE);

        FoodItem hotDog = new HotDog();
        hotDog = new Ketchup(hotDog);
        hotDog = new Jalapeno(hotDog);



        Order order = new Order(tony);
        order.addFoodItem(hotDog);

        System.out.println("Order Summary");
        System.out.println("Customer: " + order.getCustomer().getName());
        System.out.print(order.printFoodItems());
        System.out.println("Total price: " + order.getTotalPrice());
        System.out.println("Discount: " + order.getDiscount());
        System.out.println("Total price with discount: " + order.getTotalPriceWithDiscount());

        System.out.println();

        FoodItem burger = new Burger();
        burger = new Cheese(burger);
        burger = new Jalapeno(burger);
        order.addFoodItem(burger);
        tony.setLoyaltyStatus(Loyalty.SILVER);

        System.out.println("Order Summary");
        System.out.println("Customer: " + order.getCustomer().getName());
        System.out.print(order.printFoodItems());
        System.out.println("Total price: " + order.getTotalPrice());
        System.out.println("Discount: " + order.getDiscount());
        System.out.println("Total price with discount: " + order.getTotalPriceWithDiscount());

        System.out.println();

        tony.setLoyaltyStatus(Loyalty.GOLD);
        order.addFoodItem(new Fries());

        System.out.println("Order Summary");
        System.out.println("Customer: " + order.getCustomer().getName());
        System.out.print(order.printFoodItems());
        System.out.println("Total price: " + order.getTotalPrice());
        System.out.println("Discount: " + order.getDiscount());
        System.out.println("Total price with discount: " + order.getTotalPriceWithDiscount());


    }

}
