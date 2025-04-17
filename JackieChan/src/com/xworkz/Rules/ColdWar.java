package com.xworkz.Rules;

public interface ColdWar {
    void rules();

    void safety();

    void coldWar();

    default void economyReasons() {
        System.out.println("Economic reasons are cold war.");
    }
}
