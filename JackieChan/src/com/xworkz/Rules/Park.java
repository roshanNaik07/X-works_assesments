package com.xworkz.Rules;

public interface Park {

    void clean();

    void timings();

    void facilities();

    default void rules() {
        System.out.println("Park rules are to be followed");
    }

}
