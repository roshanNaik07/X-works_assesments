package com.xworkz.Rules;

public interface Office {

    void work();

    default void clean() {
        System.out.println("Keep the office clean");
    }

    static void lock() {
        System.out.println("Locking the office");
    }

}
