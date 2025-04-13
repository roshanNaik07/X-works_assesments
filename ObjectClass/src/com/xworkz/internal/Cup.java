package com.xworkz.internal;

public class Cup {
    private String material;
    private String color;
    private int price;

    public Cup(String material, String color, int price) {
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
        return 147;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null){
            System.out.println("obj is not null");
            if (obj instanceof Cup){
                Cup cup = this;
                Cup cup1 =(Cup) obj;
                if (cup.material.equals(cup1.material) && cup.color.equals(cup1.color) && cup.price==cup1.price){
                    return true;
                }
            }
        }
        return false;
    }
}
