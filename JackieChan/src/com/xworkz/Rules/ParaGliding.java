package com.xworkz.Rules;

public interface ParaGliding {
    void rules();

    void safety();

    void equipment();

    default void weatherConditions() {
        System.out.println("Weather conditions are important for para-gliding");
    }
}
