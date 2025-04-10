package com.xworkz.internal;

public class Table {
    private String material;
    private String color;
    private int price;

    public Table(String material, String color, int price) {
        this.material = material;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Material: " + material + ", Color: " + color + ", Price: " + price;
    }

    @Override
    public int hashCode() {
        return 200;
    }
}
