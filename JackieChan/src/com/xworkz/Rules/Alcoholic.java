package com.xworkz.Rules;

public class Alcoholic implements Bar{

    @Override
    public void fun() {
        System.out.println("Fun in the bar");
    }

    @Override
    public void safety() {
        System.out.println("Safety in the bar");
    }

    @Override
    public void respect() {
        System.out.println("Respect in the bar");
    }

    @Override
    public void barRules() {
        System.out.println("Bar rules are important");
    }
}

