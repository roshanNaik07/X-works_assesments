package com.xworkz.external;

import com.xworkz.internal.PaymentGateway;

public class OnlineStore {
    PaymentGateway gateway;

    public OnlineStore(PaymentGateway gateway) {
        this.gateway = gateway;
        System.out.println("OnlineStore constructor with PaymentGateway");
    }

    public void checkout() {
        if (gateway != null) {
            System.out.println("Processing payment...");
            gateway.processPayment();
        }
    }
}
