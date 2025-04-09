package com.xworkz.internal;

public class Shoe {
    private String brand;
    private int size;
    private int price;
    public Shoe(String brand,int size,int price){
        this.brand=brand;
        this.size=size;
        this.price=price;
    }

    @Override
    public String toString() {
        return "brand : "+brand+"size : "+size+" price : "+price;
    }
}
