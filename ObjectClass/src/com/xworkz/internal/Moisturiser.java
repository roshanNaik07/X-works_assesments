package com.xworkz.internal;

public class Moisturiser {
    private String brand;
    private String type;
    private int price;
    public Moisturiser(String brand, String type, int price){
        this.brand=brand;
        this.type=type;
        this.price=price;
    }

    @Override
    public String toString() {
        return "brand : "+brand+" type : "+type+" price : "+price;
    }
}
