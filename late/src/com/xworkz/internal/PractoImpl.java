package com.xworkz.internal;

public class PractoImpl implements HealthcareApp {
    public PractoImpl() {
        System.out.println("Running no-arg const of PractoImpl");
    }

    @Override
    public void bookAppointment() {
        System.out.println("Booking appointment using PractoImpl");
    }
}
