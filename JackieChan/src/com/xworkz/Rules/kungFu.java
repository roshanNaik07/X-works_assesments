package com.xworkz.Rules;

public interface kungFu {

    void rules();

    void students();

    void teachers();

    default void learn() {
        System.out.println("learn kung fu");
    }
}
