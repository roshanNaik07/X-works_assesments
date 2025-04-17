package com.xworkz.Rules;

public interface Exercise {

    void warmUp();

    void cardio();

    void strengthTraining();

    default void flexibility() {
        System.out.println("flexibility is important");
    }
}
