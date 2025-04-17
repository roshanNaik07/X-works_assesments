package com.xworkz.Rules;

public interface Industry {

    void rules();

    void employees();

    void managers();

    default void safety() {
        System.out.println("Safety is a priority in the industry.");
    }
}
