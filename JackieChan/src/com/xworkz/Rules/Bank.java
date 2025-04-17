package com.xworkz.Rules;

public interface Bank {
    void rules();

    void safety();

    void bank();

    default void management() {
        System.out.println("Management is important for banks");
    }
}
