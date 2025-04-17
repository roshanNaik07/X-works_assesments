package com.xworkz.Rules;

public interface Navy {
    void rules();

    void safety();

    void navy();

    default void maintainShip() {
        System.out.println("Maintaining the ship is crucial for navy operations.");
    }
}
