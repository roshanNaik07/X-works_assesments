package com.xworkz.Rules;

public interface Crop {
    void growth();

    void yield();

    void crop();

    default void season() {
        System.out.println("The season for rice is summer.");
    }
}
