package com.xworkz.internal;

public class Jug {
    private String brand;
    private String material;
    private int price;
    public Jug(String brand, String material, int price){
        this.brand=brand;
        this.material=material;
        this.price=price;
    }

    @Override
    public String toString() {
        return "brand : "+brand+" material : "+material+" price : "+price;
    }

    @Override
    public int hashCode() {
        return 162;
    }
}
