package com.xworkz.Rules;

public interface Shop {
    void rules();

    void safety();

    void shop();

    default void items() {
        System.out.println("Items are important for the shop");
    }
}
