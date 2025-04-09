package com.xworkz.internal;

public class Bat {
    private String brand;
    private int weight;
    private int price;
    public Bat(String brand, int weight, int price){
        this.brand=brand;
        this.weight=weight;
        this.price=price;
    }

    @Override
    public String toString() {
        return "brand : "+brand+" Range : "+weight+" price : "+price;
    }
}
