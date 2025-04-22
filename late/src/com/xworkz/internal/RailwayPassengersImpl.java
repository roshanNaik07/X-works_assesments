package com.xworkz.internal;

public class RailwayPassengersImpl implements Railway {

    public RailwayPassengersImpl() {
        System.out.println("Running no arg const of RailwayPassengersImpl");
    }

    @Override
    public void getTrainTicket() {
        System.out.println("Running getTrainTicket in RailwayPassengersImpl");

    }
}
