package com.xworkz.internal;

public class Television {
    private String brand;
    private int size;
    private int price;

    public Television(String brand, int size, int price) {
        this.brand = brand;
        this.size = size;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Size: " + size + " inches, Price: " + price;
    }

    @Override
    public int hashCode() {
        return 203;
    }
}
