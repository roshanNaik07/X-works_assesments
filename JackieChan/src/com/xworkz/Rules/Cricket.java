package com.xworkz.Rules;

public interface Cricket {

    void rules();

    void players();

    void umpireDecision();

    default void kit(){
        System.out.println("Cricket kit is required");
    }
}
