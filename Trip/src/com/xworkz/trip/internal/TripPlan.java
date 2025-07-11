package com.xworkz.trip.internal;

import java.util.Optional;

public class TripPlan {

    public Optional<Integer> getEntryFeeByName(String placeName){

        if ("kodachadri".equalsIgnoreCase(placeName)){
            System.out.println("Name is Matching");
            return Optional.ofNullable(500);
        }

        else {
            System.out.println("Place is not matching");
            return Optional.empty();
        }

    }

}
