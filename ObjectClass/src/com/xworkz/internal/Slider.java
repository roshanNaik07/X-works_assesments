package com.xworkz.internal;

public class Slider {
    private String brand;
    private int size;
    private int price;
    public Slider(String brand,int size,int price){
        this.brand=brand;
        this.size=size;
        this.price=price;
    }

    @Override
    public String toString() {
        return "brand : "+brand+"size : "+size+" price : "+price;
    }

    @Override
    public int hashCode() {
        return 119;
    }
}
