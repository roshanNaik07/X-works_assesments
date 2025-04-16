package com.xworkz.Rules;

public class Patient implements Hospital{

    @Override
    public void emergencyServices() {
        System.out.println("emergencyServices is important");
    }

    @Override
    public void billingAndInsurance() {
        System.out.println("billingAndInsurance is important");
    }

    @Override
    public void patientRightsAndResponsibilities() {
        System.out.println("patientRightsAndResponsibilities is important");
    }

}
