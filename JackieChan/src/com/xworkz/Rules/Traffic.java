package com.xworkz.Rules;

public interface Traffic {

    void rules();

    void vehicles();

    void signals();

    default void speedLimit() {
        System.out.println("Speed limit is important for road safety.");
    }
}
