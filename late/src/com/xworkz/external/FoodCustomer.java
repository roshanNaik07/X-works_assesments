package com.xworkz.external;

import com.xworkz.internal.FoodApp;

public class FoodCustomer {
    FoodApp foodApp;

    public FoodCustomer(FoodApp foodApp) {
        this.foodApp = foodApp;
        System.out.println("Running FoodApp param const in Customer");
    }

    public void placeOrder() {
        System.out.println("Running placeOrder in Customer");
        this.foodApp.orderFood();
    }
}
