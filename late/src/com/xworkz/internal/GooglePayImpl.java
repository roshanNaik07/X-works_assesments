package com.xworkz.internal;

public class GooglePayImpl implements PaymentApp {
    public GooglePayImpl() {
        System.out.println("Running no-arg const of GooglePayImpl");
    }

    @Override
    public void makePayment() {
        System.out.println("Making payment using GooglePayImpl");
    }
}
