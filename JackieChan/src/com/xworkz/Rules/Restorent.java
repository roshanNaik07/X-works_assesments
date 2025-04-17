package com.xworkz.Rules;

public interface Restorent {
    void rules();

    void food();

    void service();

    void ambiance();

    default void cleanliness() {
        System.out.println("Restorent cleanliness is important");
    }
}
