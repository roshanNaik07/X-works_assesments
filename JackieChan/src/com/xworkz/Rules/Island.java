package com.xworkz.Rules;

public interface Island {
    void rules();

    void safety();

    void island();

    default void packages(){
        System.out.println("Packages are important for the island");
    }
}
