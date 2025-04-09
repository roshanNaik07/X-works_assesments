package com.xworkz.internal;

public class Laptop {

    private String brand;
    private String color;
    private int price;

    public Laptop(String brand,String color,int price){
        this.brand=brand;
        this.color=color;
        this.price=price;
    }

    @Override
    public String toString(){
        return "Brand : "+brand+" color : "+color+" price : "+price;
    }
}
