package com.xworkz.Rules;

public interface FootBall {

    void rules();

    void players();

    void refereeDecision();

    default void Practice(){
        System.out.println("Football practice is essential");
    }
}
