package com.xworkz.Rules;

public interface Economy {
    void growth();

    void safety();

    void economy();

    default void improvement() {
        System.out.println("Improvement is important for economy.");
    }
}

