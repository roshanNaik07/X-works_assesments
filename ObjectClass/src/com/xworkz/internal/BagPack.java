package com.xworkz.internal;

public class BagPack {
    private String brand;
    private int size;
    private int price;

    public BagPack(String brand, int size, int price) {
        this.brand = brand;
        this.size = size;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Size: " + size + "L, Price: " + price;
    }

    @Override
    public int hashCode() {
        return 139;
    }
}
