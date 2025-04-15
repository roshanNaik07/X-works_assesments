package com.xworkz.internal;

public abstract class Phone {
    private String brand;
    private String color;
    private int price;

    public Phone(String brand , String color ,int price){
        this.brand=brand;
        this.color=color;
        this.price=price;
    }

    public void display(){
        System.out.println("Brand : "+brand+" color : "+color+" price : "+price);
    }
}
