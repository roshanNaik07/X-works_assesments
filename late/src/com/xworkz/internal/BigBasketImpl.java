package com.xworkz.internal;

public class BigBasketImpl implements GroceryApp {
    public BigBasketImpl() {
        System.out.println("Running no-arg const of BigBasketImpl");
    }

    @Override
    public void orderGroceries() {
        System.out.println("Ordering groceries using BigBasketImpl");
    }
}
