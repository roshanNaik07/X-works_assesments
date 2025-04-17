package com.xworkz.Rules;

public interface YouTube {

    void rules();

    void videos();

    void channels();

    default void subscription() {
        System.out.println("Subscription is required for premium content");
    }
}
