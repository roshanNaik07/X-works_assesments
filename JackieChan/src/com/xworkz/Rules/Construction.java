package com.xworkz.Rules;

public interface Construction {
    void rules();

    void safety();

    void construction();

    default void material() {
        System.out.println("The material for construction is concrete.");
    }
}
