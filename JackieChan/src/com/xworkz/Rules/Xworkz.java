package com.xworkz.Rules;

public interface Xworkz {

    void teach();

    default void clean() {
        System.out.println("keep cleaning");
    }

    static void lock() {
        System.out.println("Locking the classroom");
    }
}
