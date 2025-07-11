package com.xworkz.trip.runner;

import com.xworkz.trip.internal.TripPlan;

import java.util.Optional;

public class TripPlanRunner {

    public static void main(String[] args) {


        TripPlan tripPlan = new TripPlan();
        Optional<Integer> entryFee = tripPlan.getEntryFeeByName(null);

        if (entryFee.isPresent()){

            System.out.println(entryFee.get());
        }
        else {
            System.out.println("Place name is null");
        }
    }
}
