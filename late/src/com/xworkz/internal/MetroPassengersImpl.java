package com.xworkz.internal;

public class MetroPassengersImpl implements Metro {

    public MetroPassengersImpl() {
        System.out.println("Running no arg const of MetroPassengersImpl");
    }

    @Override
    public void buyTicket() {
        System.out.println("Running buyTicket in MetroPassengersImpl");

    }
}
