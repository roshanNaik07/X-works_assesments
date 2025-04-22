package com.xworkz.internal;

public class CultFitImpl implements FitnessApp {
    public CultFitImpl() {
        System.out.println("Running no-arg const of CultFitImpl");
    }

    @Override
    public void startWorkout() {
        System.out.println("Starting workout with CultFitImpl");
    }
}
