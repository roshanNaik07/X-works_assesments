package com.xworkz.internal;

public class Frame {
    private String size;
    private String material;
    private int price;

    public Frame(String size, String material, int price) {
        this.size = size;
        this.material = material;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Size: " + size + ", Material: " + material + ", Price: " + price;
    }

}
