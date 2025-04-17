package com.xworkz.Rules;

public interface Politics {
    void rules();

    void safety();

    void equipment();

    default void management() {
        System.out.println("Management is important for politics");
    }
}
