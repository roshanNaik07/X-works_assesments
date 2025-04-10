package com.xworkz.internal;

public class Wallet {
    private String brand;
    private String material;
    private int price;

    public Wallet(String brand, String material, int price) {
        this.brand = brand;
        this.material = material;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Material: " + material + ", Price: " + price;
    }

    @Override
    public int hashCode() {
        return 208;
    }
}
