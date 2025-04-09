package com.xworkz.internal;

public class Smartwatch {
    private String brand;
    private String model;
    private int price;

    public Smartwatch(String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Model: " + model + ", Price: " + price;
    }
}
