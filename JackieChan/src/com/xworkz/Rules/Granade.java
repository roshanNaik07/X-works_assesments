package com.xworkz.Rules;

public interface Granade {
    void rules();

    void safety();

    void granade();

    default void safetyMeasures() {
        System.out.println("Safety measures are important for grenades.");
    }
}
