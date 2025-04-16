package com.xworkz.Rules;

public interface ClassRoom {

    void teach();

    default void clean() {
        System.out.println("Cleaning the classroom");
    }

    static void lock() {
        System.out.println("Locking the classroom");
    }

}
