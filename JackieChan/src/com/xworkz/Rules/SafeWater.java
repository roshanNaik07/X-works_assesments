package com.xworkz.Rules;

public class SafeWater implements DrinkWater{
    @Override
    public void filter() {
        System.out.println("Water is filtered");
    }

    @Override
    public void safety() {
        System.out.println("Water is safe to drink");
    }

    @Override
    public void drinkWater() {
        System.out.println("Drinking water");
    }
}
