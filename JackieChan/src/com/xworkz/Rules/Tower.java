package com.xworkz.Rules;

public interface Tower {

    void rules();

    void safety();

    void tower();

    default void installation() {
        System.out.println("Installation is important for the tower");
    }
}
