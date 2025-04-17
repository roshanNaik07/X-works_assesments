package com.xworkz.Rules;

public interface Courier {
    void protect();

    void safety();

    void courier();

    default void price() {
        System.out.println("The price for courier is 100.");
    }
}
