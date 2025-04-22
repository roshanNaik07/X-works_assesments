package com.xworkz.internal;

public class DentistPatient implements Dentist{

    public DentistPatient() {
        System.out.println("Running no arg const of Patient");
    }

    @Override
    public void checkTeeth() {
        System.out.println("Running checkTeeth in Patient");

    }
}
