package com.xworkz.external;

import com.xworkz.internal.FitnessTracker;

public class FitnessUser {
    FitnessTracker fitnessTracker;

    public FitnessUser(FitnessTracker fitnessTracker) {
        this.fitnessTracker = fitnessTracker;
        System.out.println("Running FitnessTracker param const in User");
    }

    public void monitorActivity() {
        System.out.println("Running monitorActivity in User");
        this.fitnessTracker.trackSteps();
    }
}
