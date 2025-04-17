package com.xworkz.Rules;

public interface BikeRace {
    void rules();

    void speed();

    void safety();

    default void bikeCompany() {
        System.out.println("Bike company is important");
    }
}
