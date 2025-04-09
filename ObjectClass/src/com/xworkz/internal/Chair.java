package com.xworkz.internal;

public class Chair {
    private String type;
    private String material;
    private int price;

    public Chair(String type, String material, int price) {
        this.type = type;
        this.material = material;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Type: " + type + ", Material: " + material + ", Price: " + price;
    }
}
