package com.xworkz.Rules;

public class AutomaticGun implements Gun {

    @Override
    public void rules() {
        System.out.println("Automatic gun rules");
    }

    @Override
    public void safety() {
        System.out.println("Automatic gun safety");
    }

    @Override
    public void gun() {
        System.out.println("Automatic gun");
    }

    @Override
    public void safetyMeasures() {
        System.out.println("Safety measures are important for automatic guns.");
    }
}
