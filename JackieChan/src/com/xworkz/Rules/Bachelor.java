package com.xworkz.Rules;

public class Bachelor implements PG{

    @Override
    public void pay() {
        System.out.println("Paying the fees");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning the bachelor room");
    }

    @Override
    public void silence() {
        System.out.println("Maintaining silence in the bachelor room");
    }
}
