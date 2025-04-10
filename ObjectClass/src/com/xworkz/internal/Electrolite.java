package com.xworkz.internal;

public class Electrolite {
    private String brand;
    private String type;
    private int price;
    public Electrolite(String brand, String type, int price){
        this.brand=brand;
        this.type=type;
        this.price=price;
    }

    @Override
    public String toString() {
        return "brand : "+brand+" type : "+type+" price : "+price;
    }

    @Override
    public int hashCode() {
        return 151;
    }
}
