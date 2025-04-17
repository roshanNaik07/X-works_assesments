package com.xworkz.Rules;

public interface BasketBall {

    void rules();

    void players();

    void refereeDecision();

    default void Practice() {
        System.out.println("Basketball practice is essential");
    }
}
