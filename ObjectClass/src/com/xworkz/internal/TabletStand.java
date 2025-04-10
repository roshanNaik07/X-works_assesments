package com.xworkz.internal;

public class TabletStand {
    private String material;
    private String color;
    private int price;

    public TabletStand(String material, String color, int price) {
        this.material = material;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Material : " + material + " Color : " + color + " Price : " + price;
    }

    @Override
    public int hashCode() {
        return 202;
    }
}
