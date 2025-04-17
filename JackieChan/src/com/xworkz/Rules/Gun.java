package com.xworkz.Rules;

public interface Gun {
    void rules();

    void safety();

    void gun();

    default void safetyMeasures() {
        System.out.println("Safety measures are important for guns.");
    }
}
