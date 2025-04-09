package com.xworkz.internal;

public class PenDrive {
    private String brand;
    private int storage;
    private int price;

    public PenDrive(String brand, int storage, int price) {
        this.brand = brand;
        this.storage = storage;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Storage: " + storage + "GB, Price: " + price;
    }
}
