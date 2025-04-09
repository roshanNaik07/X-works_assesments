package com.xworkz.internal;

public class Webcam {
    private String brand;
    private String resolution;
    private int price;

    public Webcam(String brand, String resolution, int price) {
        this.brand = brand;
        this.resolution = resolution;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Brand : " + brand + " Resolution : " + resolution + " Price : " + price;
    }
}
