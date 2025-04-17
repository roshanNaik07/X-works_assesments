package com.xworkz.Rules;

public interface Bullet {
    void rules();

    void safety();

    void bullet();

    default void material() {
        System.out.println("The material for bullet proof is steel.");
    }
}
