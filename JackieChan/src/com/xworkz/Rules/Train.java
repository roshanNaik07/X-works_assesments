package com.xworkz.Rules;

public interface Train {
    void rules();

    void safety();

    void train();

    default void timing() {
        System.out.println("The timing for train is 10:00 AM.");
    }
}
