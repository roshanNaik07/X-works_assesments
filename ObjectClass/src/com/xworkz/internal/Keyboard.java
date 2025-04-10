package com.xworkz.internal;

public class Keyboard {
    private String brand;
    private String layout;
    private int price;

    public Keyboard(String brand, String layout, int price) {
        this.brand = brand;
        this.layout = layout;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Layout: " + layout + ", Price: " + price;
    }

    @Override
    public int hashCode() {
        return 163;
    }
}
