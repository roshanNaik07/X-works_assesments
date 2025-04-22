package com.xworkz.internal;

public class DriversImpl implements TrafficSignal{

    public DriversImpl() {
        System.out.println("Running no arg const of DriversImpl");
    }

    @Override
    public void controlTraffic() {
        System.out.println("Running controlTraffic in DriversImpl");

    }
}
