package com.xworkz.Rules;

public class Biker implements BikeRace {

    @Override
    public void rules() {
        System.out.println("Biker rules");
    }

    @Override
    public void speed() {
        System.out.println("Biker speed");
    }

    @Override
    public void safety() {
        System.out.println("Biker safety");
    }

    @Override
    public void bikeCompany() {
        System.out.println("Biker company is important");
    }
}
