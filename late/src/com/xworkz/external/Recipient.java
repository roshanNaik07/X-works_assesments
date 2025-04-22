package com.xworkz.external;

import com.xworkz.internal.DeliveryApp;

public class Recipient {
    DeliveryApp deliveryApp;

    public Recipient(DeliveryApp deliveryApp) {
        this.deliveryApp = deliveryApp;
        System.out.println("Running DeliveryApp param const in Recipient");
    }

    public void receiveDelivery() {
        System.out.println("Running receiveDelivery in Recipient");
        this.deliveryApp.deliverItem();
    }
}
