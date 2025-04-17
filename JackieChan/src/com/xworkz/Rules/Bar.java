package com.xworkz.Rules;

public interface Bar {

    void fun();

    void safety();

    void respect();

    default void barRules() {
        System.out.println("Bar rules are important");
    }
}
