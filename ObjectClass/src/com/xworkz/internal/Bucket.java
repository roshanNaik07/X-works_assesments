package com.xworkz.internal;

public class Bucket {
    private String brand;
    private String color;
    private int price;
    public Bucket(String brand,String color,int price){
        this.brand=brand;
        this.color=color;
        this.price=price;
    }

    @Override
    public String toString() {
        return "brand : "+brand+" color : "+color+" price : "+price;
    }

    @Override
    public int hashCode() {
        return 133;
    }
}
