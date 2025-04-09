package com.xworkz.internal;

public class Ink {
    private String color;
    private String brand;
    private int price;

    public Ink(String color, String brand, int price) {
        this.color = color;
        this.brand = brand;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Color: " + color + ", Brand: " + brand + ", Price: " + price;
    }
}
