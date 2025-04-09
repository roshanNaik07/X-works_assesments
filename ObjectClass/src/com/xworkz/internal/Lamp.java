package com.xworkz.internal;

public class Lamp {
    private String type;
    private String color;
    private int price;

    public Lamp(String type, String color, int price) {
        this.type = type;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Type: " + type + ", Color: " + color + ", Price: " + price;
    }
}
