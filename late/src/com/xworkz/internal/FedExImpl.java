package com.xworkz.internal;

public class FedExImpl implements CourierService {
    public FedExImpl() {
        System.out.println("FedExImpl constructor");
    }

    @Override
    public void deliverParcel() {
        System.out.println("Parcel delivered by FedExImpl");
    }
}
