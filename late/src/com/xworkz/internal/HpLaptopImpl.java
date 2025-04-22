package com.xworkz.internal;

public class HpLaptopImpl implements Laptop {

    public HpLaptopImpl() {
        System.out.println("Running no arg const of HpLaptopImpl");
    }

    @Override
    public void process() {
        System.out.println("Running process in HpLaptopImpl");

    }
}
