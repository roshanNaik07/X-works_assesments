package com.xworkz.Rules;

public class CourierArtWork implements Courier {

    @Override
    public void protect() {
        System.out.println("Courier protect");
    }

    @Override
    public void safety() {
        System.out.println("Courier safety");
    }

    @Override
    public void courier() {
        System.out.println("Courier art work");
    }

    @Override
    public void price() {
        System.out.println("The price for courier art work is 200.");
    }
}
