package com.xworkz.internal;

public class TV {
    private String brand;
    private int size;
    private int price;

    public TV(String brand, int size, int price) {
        this.brand = brand;
        this.size = size;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Brand : " + brand + " Size : " + size + " inch Price : " + price;
    }
}
