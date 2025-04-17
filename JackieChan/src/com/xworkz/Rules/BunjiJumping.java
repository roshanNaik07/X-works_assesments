package com.xworkz.Rules;

public interface BunjiJumping {
    void rules();

    void safety();

    void bunjiJumping();

    default void protection() {
        System.out.println("Protection is important for bunjiJumping");
    }
}
