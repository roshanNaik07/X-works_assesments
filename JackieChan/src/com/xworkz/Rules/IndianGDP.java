package com.xworkz.Rules;

public class IndianGDP implements GDP {

    @Override
    public void growth() {
        System.out.println("India's GDP is growing at a rapid pace.");
    }

    @Override
    public void safety() {
        System.out.println("India's economy is stable and safe for investments.");
    }

    @Override
    public void gdp() {
        System.out.println("India's GDP is one of the largest in the world.");
    }
}
