package com.xworkz.internal;

public class Router {
    private String brand;
    private int speed;
    private int price;

    public Router(String brand, int speed, int price) {
        this.brand = brand;
        this.speed = speed;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Brand : " + brand + " Speed : " + speed + " Mbps Price : " + price;
    }
}
