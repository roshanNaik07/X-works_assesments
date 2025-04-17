package com.xworkz.Rules;

public interface Karate {

    void rules();

    void students();

    void teachers();

    default void learn() {
        System.out.println("learn karate");
    }
}
