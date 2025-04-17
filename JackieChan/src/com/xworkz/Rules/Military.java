package com.xworkz.Rules;

public interface Military {
    void rules();

    void soldiers();

    void weapons();

    default void force() {
        System.out.println("Black Cat");
    }
}
