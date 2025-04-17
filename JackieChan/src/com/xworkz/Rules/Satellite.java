package com.xworkz.Rules;

public interface Satellite {
    void rules();

    void satellites();

    void signals();

    default void launch() {
        System.out.println("Satellite launched by ISRO");
    }

}
