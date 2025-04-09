package com.xworkz.internal;

public class Soap {
    private String brand;
    private String Aroma;
    private int price;
    public Soap(String brand,String Aroma,int price){
        this.brand=brand;
        this.Aroma=Aroma;
        this.price=price;
    }

    @Override
    public String toString() {
        return "brand : "+brand+" Aroma : "+Aroma+" price : "+price;
    }
}
