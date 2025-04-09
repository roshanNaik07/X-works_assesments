package com.xworkz.internal;

public class SoftDrink {
    private String brand;
    private String flavour;
    private int price;
    public SoftDrink(String brand, String flavour, int price){
        this.brand=brand;
        this.flavour=flavour;
        this.price=price;
    }

    @Override
    public String toString() {
        return "brand : "+brand+" flavour : "+flavour+" price : "+price;
    }
}
