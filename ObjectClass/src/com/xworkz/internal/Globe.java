package com.xworkz.internal;

public class Globe {
    private String size;
    private String color;
    private int price;

    public Globe(String size, String color, int price) {
        this.size = size;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Size: " + size + ", Color: " + color + ", Price: " + price;
    }
}
