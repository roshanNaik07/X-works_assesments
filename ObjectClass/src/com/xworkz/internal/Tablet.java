package com.xworkz.internal;

public class Tablet {
    private String brand;
    private int ram;
    private int price;

    public Tablet(String brand, int ram, int price) {
        this.brand = brand;
        this.ram = ram;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Brand : " + brand + " RAM : " + ram + "GB Price : " + price;
    }
}
