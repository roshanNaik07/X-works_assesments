package com.xworkz.Rules;

public interface Festival {
    void rules();

    void ritual();

    void festival();

    default void celebration() {
        System.out.println("Celebration is important for festivals.");
    }
}
