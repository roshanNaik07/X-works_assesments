package com.xworkz.Rules;

public interface Licence {

    void rules();

    void vehicles();

    void signals();

    default void apply(){
        System.out.println("apply for licence");
    }
}
