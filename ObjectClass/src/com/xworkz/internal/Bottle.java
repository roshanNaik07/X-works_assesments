package com.xworkz.internal;

public class Bottle {
    private int capacity;
    private String color;
    private int price;

    public Bottle(int capacity,String color,int price){
        this.capacity=capacity;
        this.color=color;
        this.price=price;
    }

    @Override
    public String toString() {
        return "Capacity : "+capacity+"color : "+color+" price : "+price;
    }
}
