package com.xworkz.Rules;

public class Gliding implements ParaGliding {

    @Override
    public void rules() {
        System.out.println("Gliding rules: Follow the safety guidelines and regulations.");
    }

    @Override
    public void safety() {
        System.out.println("Safety measures: Always wear a helmet and check your equipment.");
    }

    @Override
    public void equipment() {
        System.out.println("Equipment needed: Glider, harness, helmet, and parachute.");
    }
}
