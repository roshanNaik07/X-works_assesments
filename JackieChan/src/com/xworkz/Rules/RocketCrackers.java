package com.xworkz.Rules;

public class RocketCrackers implements Crackers {

    @Override
    public void Sell() {
        System.out.println("Selling Rocket Crackers");
    }

    @Override
    public void safety() {
        System.out.println("Safety measures for Rocket Crackers");
    }

    @Override
    public void crackers() {
        System.out.println("Rocket Crackers are available");
    }

}
