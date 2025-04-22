package com.xworkz.internal;

public class CitizenConstituionImpl implements Constitution{

    public CitizenConstituionImpl() {
        System.out.println("Running no arg const of CitizenConstituionImpl");
    }

    @Override
    public void followRules() {
        System.out.println("Running folloeRules in CitizenConstituionImpl");

    }
}
