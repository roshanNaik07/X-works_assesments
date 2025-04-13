package com.xworkz.internal;

public class Ink {
    private String color;
    private String brand;
    private int price;

    public Ink(String color, String brand, int price) {
        this.color = color;
        this.brand = brand;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Color: " + color + ", Brand: " + brand + ", Price: " + price;
    }

    @Override
    public int hashCode() {
        return 160;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null){
            System.out.println("obj is not null");
            if (obj instanceof Ink){
                Ink ink = this;
                Ink ink1 =(Ink) obj;
                if (ink.color.equals(ink1.color) && ink.brand.equals(ink1.brand) && ink.price==ink1.price){
                    return true;
                }
            }
        }
        return false;
    }
}
