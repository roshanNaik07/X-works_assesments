package com.xworkz.Rules;

public interface Jacket {
    void waterProof();

    void safety();

    void jacket();

    default void material() {
        System.out.println("The material for jacket is polyester.");
    }
}
