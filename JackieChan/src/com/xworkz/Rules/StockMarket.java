package com.xworkz.Rules;

public interface StockMarket {
    void rules();

    void safety();

    void stockMarket();

    default void timing() {
        System.out.println("The timing for stock market is 9:00 AM to 3:30 PM.");
    }
}
