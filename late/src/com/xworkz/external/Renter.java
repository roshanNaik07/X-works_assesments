package com.xworkz.external;

import com.xworkz.internal.CarRental;

public class Renter {
    CarRental carRental;

    public Renter(CarRental carRental) {
        this.carRental = carRental;
        System.out.println("Running CarRental param const in Renter");
    }

    public void driveCar() {
        System.out.println("Running driveCar in Renter");
        this.carRental.rentCar();
    }
}
