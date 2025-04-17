package com.xworkz.Rules;

public interface Logistics {
    void rules();

    void transportation();

    void warehousing();

    default void approval() {
        System.out.println("Logistics approval is important");
    }
}
