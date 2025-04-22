package com.xworkz.internal;

public class FitbitImpl implements FitnessTracker {
    public FitbitImpl() {
        System.out.println("Running no-arg const of FitbitImpl");
    }

    @Override
    public void trackSteps() {
        System.out.println("Tracking steps using FitbitImpl");
    }
}
