package com.xworkz.internal;

public class Door {
    private String Material;
    private String color;
    private int price;
    public Door(String Material, String color, int price){
        this.Material=Material;
        this.color=color;
        this.price=price;
    }

    @Override
    public String toString() {
        return "Material : "+Material+" color : "+color+" price : "+price;
    }

    @Override
    public int hashCode() {
        return 149;
    }
}
