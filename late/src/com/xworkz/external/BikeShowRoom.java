package com.xworkz.external;

import com.xworkz.internal.BikeCompany;

public class BikeShowRoom {

    BikeCompany bikeCompany;

    public BikeShowRoom(BikeCompany bikeCompany) {
        this.bikeCompany = bikeCompany;
        System.out.println("Running no arg const of BikeShowRoom");
    }

    public void bikeDelivery() {
        if (this.bikeCompany != null) {
            System.out.println("Running bikeDelivery in BikeShowRoom");
            this.bikeCompany.manufactureBike();
        } else {
            System.err.println("BikeCompany is null");
        }
    }
}
