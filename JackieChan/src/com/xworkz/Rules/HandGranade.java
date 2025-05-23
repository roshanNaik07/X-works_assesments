package com.xworkz.Rules;

public class HandGranade implements Granade {

    @Override
    public void rules() {
        System.out.println("Hand Granade rules");
    }

    @Override
    public void safety() {
        System.out.println("Hand Granade safety");
    }

    @Override
    public void granade() {
        System.out.println("Hand Granade");
    }

    @Override
    public void safetyMeasures() {
        System.out.println("Safety measures are important for hand grenades.");
    }
}
