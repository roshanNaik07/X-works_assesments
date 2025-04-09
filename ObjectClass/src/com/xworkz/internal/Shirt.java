package com.xworkz.internal;

public class Shirt {
    private String Brand;
    private String color;
    private int price;

    public Shirt(String Brand,String color,int price){
        this.Brand=Brand;
        this.color=color;
        this.price=price;
    }

    @Override
    public String toString() {
        return "Brand : "+Brand+"color : "+color+" price : "+price;
    }
}
