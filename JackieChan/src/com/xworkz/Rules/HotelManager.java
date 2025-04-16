package com.xworkz.Rules;

public class HotelManager implements Hotel {

    @Override
    public void rules() {
        System.out.println("Hotel rules are implemented");
    }

    @Override
    public void food() {
        System.out.println("Hotel food is implemented");
    }

    @Override
    public void service() {
        System.out.println("Hotel service is implemented");
    }
}
