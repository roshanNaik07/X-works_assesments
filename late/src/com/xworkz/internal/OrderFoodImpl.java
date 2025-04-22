package com.xworkz.internal;

public class OrderFoodImpl implements SwiggyApp {

    public OrderFoodImpl() {
        System.out.println("Running no arg const of OrderFoodImpl");
    }

    @Override
    public void orderFood() {
        System.out.println("Running orderFood in OrderFoodImpl");

    }
}
