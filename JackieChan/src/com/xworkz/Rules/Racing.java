package com.xworkz.Rules;

public interface Racing {
    void rules();

    void safety();

    void racing();

    default void driver() {
        System.out.println("The driver for racing is John Doe.");
    }
}
