package com.xworkz.internal;

public class PowerBank {
    private String brand;
    private int Capacity;
    private int price;

    public PowerBank(String brand,int Capacity,int price){
        this.brand=brand;
        this.Capacity=Capacity;
        this.price=price;
    }

    @Override
    public String toString(){
        return "Brand : "+brand+" Capacity : "+Capacity+" price : "+price;
    }
}
