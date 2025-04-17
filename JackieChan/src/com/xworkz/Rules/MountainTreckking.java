package com.xworkz.Rules;

public class MountainTreckking implements Treckking {

    @Override
    public void rules() {
        System.out.println("Trekking rules are followed");
    }

    @Override
    public void safety() {
        System.out.println("Safety measures are taken");
    }

    @Override
    public void trekking() {
        System.out.println("Trekking is done in a safe manner");
    }

    @Override
    public void season() {
        System.out.println("The season for trekking is winter.");
    }
}
