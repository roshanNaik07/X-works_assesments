package com.xworkz.external;

import com.xworkz.internal.EcommercePlatform;

public class Shopper {
    EcommercePlatform ecommercePlatform;

    public Shopper(EcommercePlatform ecommercePlatform) {
        this.ecommercePlatform = ecommercePlatform;
        System.out.println("Running EcommercePlatform param const in Shopper");
    }

    public void shop() {
        System.out.println("Running shop in Shopper");
        this.ecommercePlatform.placeOrder();
    }
}
