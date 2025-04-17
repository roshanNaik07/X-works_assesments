package com.xworkz.Rules;

public interface Poison {
    void Avoid();

    void safety();

    void poison();

    default void protection() {
        System.out.println("Protection is important for poison");
    }
}
