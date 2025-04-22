package com.xworkz.external;

import com.xworkz.internal.TaxiService;

public class OlaTraveler {
    TaxiService taxiService;

    public OlaTraveler(TaxiService taxiService) {
        this.taxiService = taxiService;
        System.out.println("Running TaxiService param const in Traveler");
    }

    public void travel() {
        System.out.println("Running travel in Traveler");
        this.taxiService.bookTaxi();
    }
}
