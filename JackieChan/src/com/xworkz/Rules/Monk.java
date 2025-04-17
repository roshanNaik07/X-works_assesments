package com.xworkz.Rules;

public interface Monk {

    void rules();

    void monks();

    void temples();

    default void ashram() {
        System.out.println("Monk ashram");
    }
}
