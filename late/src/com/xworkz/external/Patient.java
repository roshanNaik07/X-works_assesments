package com.xworkz.external;

import com.xworkz.internal.HealthcareApp;

public class Patient {
    HealthcareApp healthcareApp;

    public Patient(HealthcareApp healthcareApp) {
        this.healthcareApp = healthcareApp;
        System.out.println("Running HealthcareApp param const in Patient");
    }

    public void getTreatment() {
        System.out.println("Running getTreatment in Patient");
        this.healthcareApp.bookAppointment();
    }
}
