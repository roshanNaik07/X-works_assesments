package com.xworkz.Rules;

public class MumbaiStock implements StockMarket {

    @Override
    public void rules() {
        System.out.println("Mumbai stock market rules");
    }

    @Override
    public void safety() {
        System.out.println("Mumbai stock market safety");
    }

    @Override
    public void stockMarket() {
        System.out.println("Mumbai stock market");
    }
}
