package com.xworkz.internal;

public class Wifi {
    private String brand;
    private String Range;
    private int price;
    public Wifi(String brand, String Range, int price){
        this.brand=brand;
        this.Range=Range;
        this.price=price;
    }

    @Override
    public String toString() {
        return "brand : "+brand+" Range : "+Range+" price : "+price;
    }
}
