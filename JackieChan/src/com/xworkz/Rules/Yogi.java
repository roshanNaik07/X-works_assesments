package com.xworkz.Rules;

public interface Yogi {

    void yoga();

    void meditation();

    void pranayama();

    default void ashram() {
        System.out.println("Yogi ashram");
    }
}
