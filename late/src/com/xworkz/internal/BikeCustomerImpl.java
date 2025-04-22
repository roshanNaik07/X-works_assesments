package com.xworkz.internal;

public class BikeCustomerImpl implements BikeCompany{

    public BikeCustomerImpl() {
        System.out.println("Running no arg const of BikeCustomerImpl");
    }

    @Override
    public void manufactureBike() {
        System.out.println("Running manufactureBike in BikeCustomerImpl");

    }
}
