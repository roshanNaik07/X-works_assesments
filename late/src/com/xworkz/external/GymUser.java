package com.xworkz.external;

import com.xworkz.internal.FitnessApp;

public class GymUser {
    FitnessApp fitnessApp;

    public GymUser(FitnessApp fitnessApp) {
        this.fitnessApp = fitnessApp;
        System.out.println("Running FitnessApp param const in GymUser");
    }

    public void exercise() {
        System.out.println("Running exercise in GymUser");
        this.fitnessApp.startWorkout();
    }
}
