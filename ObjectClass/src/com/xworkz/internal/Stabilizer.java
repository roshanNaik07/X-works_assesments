package com.xworkz.internal;

public class Stabilizer {
    private String brand;
    private int voltage;
    private int price;

    public Stabilizer(String brand, int voltage, int price) {
        this.brand = brand;
        this.voltage = voltage;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Brand : " + brand + " Voltage : " + voltage + "V Price : " + price;
    }
}
