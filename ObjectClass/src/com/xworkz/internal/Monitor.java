package com.xworkz.internal;

public class Monitor {
    private String brand;
    private int size;
    private int price;

    public Monitor(String brand, int size, int price) {
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
        return 168;
    }
}
