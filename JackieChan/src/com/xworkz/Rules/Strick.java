package com.xworkz.Rules;

public interface Strick {
    void rules();

    void safety();

    void strick();

    default void opposition() {
        System.out.println("Opposition is important for strick.");
    }
}
