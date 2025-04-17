package com.xworkz.Rules;

public interface PrimeMinister {

    void rules();
    void safety();
    void primeMinister();

    default void foreignAffairs() {
        System.out.println("Foreign affairs are important for the Prime Minister");
    }
}
