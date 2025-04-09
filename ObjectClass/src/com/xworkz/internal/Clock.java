package com.xworkz.internal;

public class Clock {
    private String brand;
    private String type;
    private int price;

    public Clock(String brand, String type, int price) {
        this.brand = brand;
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Type: " + type + ", Price: " + price;
    }
}
