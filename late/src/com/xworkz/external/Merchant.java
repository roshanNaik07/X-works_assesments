package com.xworkz.external;

import com.xworkz.internal.PaymentApp;

public class Merchant {
    PaymentApp paymentApp;

    public Merchant(PaymentApp paymentApp) {
        this.paymentApp = paymentApp;
        System.out.println("Running PaymentApp param const in Merchant");
    }

    public void receiveMoney() {
        System.out.println("Running receiveMoney in Merchant");
        this.paymentApp.makePayment();
    }
}
