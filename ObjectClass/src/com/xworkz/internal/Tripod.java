package com.xworkz.internal;

public class Tripod {
    private String brand;
    private int height;
    private int price;

    public Tripod(String brand, int height, int price) {
        this.brand = brand;
        this.height = height;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Brand : " + brand + " Height : " + height + " cm Price : " + price;
    }
}
