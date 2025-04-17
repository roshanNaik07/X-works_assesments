package com.xworkz.Rules;

public interface River {

    void recreation();

    void navigation();

    void hydropower();

    default void waterQuality() {
        System.out.println("Water quality is important");
    }
}
