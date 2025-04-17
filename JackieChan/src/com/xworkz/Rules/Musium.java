package com.xworkz.Rules;

public interface Musium {

    void rules();

    void tickets();

    void guides();

    default void safety() {
        System.out.println("Safety is a priority in the museum.");
    }
}
