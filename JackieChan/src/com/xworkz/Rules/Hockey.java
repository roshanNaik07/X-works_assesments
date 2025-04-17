package com.xworkz.Rules;

public interface Hockey {
    void rules();

    void safety();

    void equipment();

    default void practice() {
        System.out.println("Practice is important for hockey");
    }
}
