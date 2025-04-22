package com.xworkz.internal;

public class FlipkartImpl implements EcommercePlatform {
    public FlipkartImpl() {
        System.out.println("Running no-arg const of FlipkartImpl");
    }

    @Override
    public void placeOrder() {
        System.out.println("Placing order using FlipkartImpl");
    }
}
