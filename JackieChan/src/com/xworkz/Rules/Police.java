package com.xworkz.Rules;

public interface Police {
    void rules();

    void safety();

    void police();

    default void duty() {
        System.out.println("Duty is important for police");
    }
}
