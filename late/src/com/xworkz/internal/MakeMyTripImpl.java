package com.xworkz.internal;

public class MakeMyTripImpl implements TravelAgency {
    public MakeMyTripImpl() {
        System.out.println("MakeMyTripImpl constructor");
    }

    @Override
    public void bookTrip() {
        System.out.println("Trip booked via MakeMyTripImpl");
    }
}
