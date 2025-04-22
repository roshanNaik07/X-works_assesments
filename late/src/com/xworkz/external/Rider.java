package com.xworkz.external;

import com.xworkz.internal.RideSharing;

public class Rider {
    RideSharing rideSharing;

    public Rider(RideSharing rideSharing) {
        this.rideSharing = rideSharing;
        System.out.println("Running RideSharing param const in Rider");
    }

    public void startJourney() {
        System.out.println("Running startJourney in Rider");
        this.rideSharing.bookRide();
    }
}

