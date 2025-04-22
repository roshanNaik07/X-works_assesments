package com.xworkz.internal;

public class UberImpl implements RideSharing {
    public UberImpl() {
        System.out.println("Running no-arg const of UberImpl");
    }

    @Override
    public void bookRide() {
        System.out.println("Booking ride using UberImpl");
    }
}
