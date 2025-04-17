package com.xworkz.Rules;

public interface Crackers {
    void Sell();

    void safety();

    void crackers();

    default void safetyMeasures() {
        System.out.println("Safety measures are important for crackers.");
    }
}
