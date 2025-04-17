package com.xworkz.Rules;

public interface Hotel {
    void rules();

    void food();

    void service();

    default void cleanliness() {
        System.out.println("Hotel cleanliness is important");
    }
}
