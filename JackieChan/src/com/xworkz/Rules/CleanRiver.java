package com.xworkz.Rules;

public class CleanRiver implements River{

    @Override
    public void recreation() {
        System.out.println("Clean River Rules");
    }

    @Override
    public void navigation() {
        System.out.println("Clean River Vehicles");
    }

    @Override
    public void hydropower() {
        System.out.println("Clean River Signals");
    }

}
