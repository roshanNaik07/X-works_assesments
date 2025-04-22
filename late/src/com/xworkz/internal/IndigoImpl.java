package com.xworkz.internal;

public class IndigoImpl implements Airline {
    public IndigoImpl() {
        System.out.println("Running no-arg const of IndigoImpl");
    }

    @Override
    public void bookFlight() {
        System.out.println("Flight booked with IndigoImpl");
    }
}
