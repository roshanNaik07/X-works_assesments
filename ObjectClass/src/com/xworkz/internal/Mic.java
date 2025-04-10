package com.xworkz.internal;

public class Mic {
    private String type;
    private String brand;
    private int price;

    public Mic(String type, String brand, int price) {
        this.type = type;
        this.brand = brand;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Type : " + type + " Brand : " + brand + " Price : " + price;
    }

    @Override
    public int hashCode() {
        return 165;
    }
}
