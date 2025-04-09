package com.xworkz.internal;

public class FanRemote {
    private String brand;
    private int range;
    private int price;

    public FanRemote(String brand, int range, int price) {
        this.brand = brand;
        this.range = range;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Range: " + range + "m, Price: " + price;
    }
}
