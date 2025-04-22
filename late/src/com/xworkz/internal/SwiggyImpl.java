package com.xworkz.internal;

public class SwiggyImpl implements DeliveryApp {
    public SwiggyImpl() {
        System.out.println("Running no-arg const of SwiggyImpl");
    }

    @Override
    public void deliverItem() {
        System.out.println("Delivering item using SwiggyImpl");
    }
}
