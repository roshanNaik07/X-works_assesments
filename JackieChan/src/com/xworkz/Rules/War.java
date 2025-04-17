package com.xworkz.Rules;

public interface War {
    void rules();

    void safety();

    void war();

    default void attack() {
        System.out.println("Attack is important for war.");
    }
}
