package com.xworkz.internal;

public class FanStand {
    private String brand;
    private int height;
    private int price;

    public FanStand(String brand, int height, int price) {
        this.brand = brand;
        this.height = height;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Height: " + height + "cm, Price: " + price;
    }

    @Override
    public int hashCode() {
        return 153;
    }
}
