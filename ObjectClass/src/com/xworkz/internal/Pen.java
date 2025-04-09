package com.xworkz.internal;

public class Pen {
    private String brand;
    private String ink;
    private int price;
    public Pen(String brand,String ink,int price){
        this.brand=brand;
        this.ink=ink;
        this.price=price;
    }

    @Override
    public String toString() {
        return "brand : "+brand+" ink : "+ink+" price : "+price;
    }
}
