package com.xworkz.internal;

public class ZomatoImpl implements FoodApp {
    public ZomatoImpl() {
        System.out.println("Running no-arg const of ZomatoImpl");
    }

    @Override
    public void orderFood() {
        System.out.println("Ordering food through ZomatoImpl");
    }
}
