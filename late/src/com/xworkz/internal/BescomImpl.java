package com.xworkz.internal;

public class BescomImpl implements ElectricityBoard {
    public BescomImpl() {
        System.out.println("BescomImpl constructor");
    }

    @Override
    public void supplyPower() {
        System.out.println("Power supplied by BescomImpl");
    }
}
