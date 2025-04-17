package com.xworkz.Rules;

public interface GDP {
    void growth();

    void safety();

    void gdp();

    default void improvement() {
        System.out.println("Improvement is important for GDP.");
    }
}
