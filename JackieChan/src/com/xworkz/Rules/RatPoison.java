package com.xworkz.Rules;

public class RatPoison implements Poison {

    @Override
    public void Avoid() {
        System.out.println("Avoid rat poison");
    }

    @Override
    public void safety() {
        System.out.println("Safety is important");
    }

    @Override
    public void poison() {
        System.out.println("Rat poison is dangerous");
    }

    @Override
    public void protection() {
        System.out.println("Protection is important for rat poison");
    }
}
