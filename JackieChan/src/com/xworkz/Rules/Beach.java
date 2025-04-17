package com.xworkz.Rules;

public interface Beach {
    void rules();

    void safety();

    void beach();

    default void clean() {
        System.out.println("Cleanliness is important for the beach");
    }
}
