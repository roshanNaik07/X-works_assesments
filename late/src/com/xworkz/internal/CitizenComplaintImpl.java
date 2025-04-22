package com.xworkz.internal;

public class CitizenComplaintImpl implements Police {

    public CitizenComplaintImpl() {
        System.out.println("Running no arg const of CitizenComplaintImpl");
    }

    @Override
    public void fileFIR() {
        System.out.println("Running fileFIR in CitizenComplaintImpl");

    }
}
