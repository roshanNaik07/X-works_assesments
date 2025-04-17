package com.xworkz.Rules;

public interface Library {
    void rules();

    void silence();

    void library();

    default void renovation() {
        System.out.println("Renovation is important for the library");
    }
}
