package com.xworkz.external;

import com.xworkz.internal.Airline;

public class Passenger {
    Airline airline;

    public Passenger(Airline airline) {
        this.airline = airline;
        System.out.println("Running Airline param const in Passenger");
    }

    public void fly() {
        System.out.println("Running fly in Passenger");
        this.airline.bookFlight();
    }
}
