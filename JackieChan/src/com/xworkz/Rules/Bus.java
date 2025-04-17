package com.xworkz.Rules;

public interface Bus {
    void rules();

    void safety();

    void bus();

    default void timing() {
        System.out.println("The timing for bus is 10:00 AM.");
    }
}
