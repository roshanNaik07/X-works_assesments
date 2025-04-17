package com.xworkz.Rules;

public interface Hospital {

    void emergencyServices();

    void billingAndInsurance();

    void patientRightsAndResponsibilities();

    default void patientCare() {
        System.out.println("Patient care is important");
    }
}
