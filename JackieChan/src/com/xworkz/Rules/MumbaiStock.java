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

    @Override
    public void timing() {
        System.out.println("The timing for Mumbai stock market is 9:00 AM to 3:30 PM.");
    }
}
