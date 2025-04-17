package com.xworkz.Rules;

public interface    AmazonForest {
    void rules();

    void safety();

    void forest();

    default void protection() {
        System.out.println("Protection is important for the Amazon forest");
    }
}
