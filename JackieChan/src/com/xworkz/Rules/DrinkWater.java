package com.xworkz.Rules;

public interface DrinkWater {
    void filter();

    void safety();

    void drinkWater();

    default void temperature() {
        System.out.println("The temperature for drinking water is 25 degrees Celsius.");
    }
}
