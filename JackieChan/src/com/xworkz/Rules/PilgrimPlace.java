package com.xworkz.Rules;

public interface PilgrimPlace {

    void rules();

    void dressCode();

    void food();

    default void safety() {
        System.out.println("Safety is a priority in the pilgrim place.");
    }
}
