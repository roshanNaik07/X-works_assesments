package com.xworkz.internal;

public class Mirror {
    private String shape;
    private String type;
    private int price;

    public Mirror(String shape, String type, int price) {
        this.shape = shape;
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Shape: " + shape + ", Type: " + type + ", Price: " + price;
    }
}
