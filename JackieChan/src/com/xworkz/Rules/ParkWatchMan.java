package com.xworkz.Rules;

public class ParkWatchMan implements Park{

    @Override
    public void clean() {
        System.out.println("Cleaning the park");
    }

    @Override
    public void timings() {
        System.out.println("Park timings are 6 AM to 8 PM");
    }

    @Override
    public void facilities() {
        System.out.println("Facilities available in the park");
    }

    @Override
    public void rules() {
        System.out.println("Park rules are to be followed");
    }
}
