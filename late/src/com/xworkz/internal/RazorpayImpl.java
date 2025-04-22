package com.xworkz.internal;

public class RazorpayImpl implements PaymentGateway {
    public RazorpayImpl() {
        System.out.println("RazorpayImpl constructor");
    }

    @Override
    public void processPayment() {
        System.out.println("Payment processed by RazorpayImpl");
    }
}
