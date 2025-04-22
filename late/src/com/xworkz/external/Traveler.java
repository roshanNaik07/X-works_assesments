package com.xworkz.external;

import com.xworkz.internal.CabService;

public class Traveler {
    CabService cabService;

    public Traveler(CabService cabService) {
        this.cabService = cabService;
        System.out.println("Running CabService param const in Traveler");
    }

    public void goToDestination() {
        System.out.println("Running goToDestination in Traveler");
        this.cabService.hireCab();
    }
}
