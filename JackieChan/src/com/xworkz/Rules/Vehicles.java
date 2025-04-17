package com.xworkz.Rules;

public class Vehicles implements Traffic{

    @Override
    public void rules() {
        System.out.println("Traffic rules are important for safety.");
    }

    @Override
    public void vehicles() {
        System.out.println("Different types of vehicles include cars, bikes, and buses.");
    }

    @Override
    public void signals() {
        System.out.println("Traffic signals help manage the flow of vehicles.");
    }

    @Override
    public void speedLimit(){
        System.out.println("Speed limit is necessary");
    }
}
