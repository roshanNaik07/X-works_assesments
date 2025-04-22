package com.xworkz.external;

import com.xworkz.internal.SwiggyApp;

public class FoodDeliveryApp {

    SwiggyApp swiggyApp;

    public FoodDeliveryApp(SwiggyApp swiggyApp) {
        this.swiggyApp = swiggyApp;
        System.out.println("Running no arg const of FoodDeliveryApp");
    }

    public void order() {
        if (this.swiggyApp != null) {
            System.out.println("Running order in FoodDeliveryApp");
            this.swiggyApp.orderFood();
        } else {
            System.err.println("SwiggyApp is null");
        }
    }
}
