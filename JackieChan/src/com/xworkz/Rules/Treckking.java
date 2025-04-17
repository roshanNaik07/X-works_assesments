package com.xworkz.Rules;

public interface Treckking {
    void rules();

    void safety();

    void trekking();

    default void season() {
        System.out.println("The season for trekking is summer.");
    }
}
