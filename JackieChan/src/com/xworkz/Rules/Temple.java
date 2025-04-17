package com.xworkz.Rules;

public interface Temple {

    void rules();

    void pooja();

    void prasad();

    default void rituals() {
        System.out.println("Rituals are an important part of temple practices.");
    }
}
