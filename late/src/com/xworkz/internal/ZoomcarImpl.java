package com.xworkz.internal;

public class ZoomcarImpl implements CarRental {
    public ZoomcarImpl() {
        System.out.println("Running no-arg const of ZoomcarImpl");
    }

    @Override
    public void rentCar() {
        System.out.println("Renting car using ZoomcarImpl");
    }
}
