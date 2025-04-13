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

    @Override
    public int hashCode() {
        return 157;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null){
            System.out.println("obj is not null");
            if (obj instanceof Globe){
                Globe globe = this;
                Globe globe1 =(Globe) obj;
                if (globe.size.equals(globe1.size) && globe.color.equals(globe1.color) && globe.price==globe1.price){
                    return true;
                }
            }
        }
        return false;
    }
}
