package com.xworkz.internal;

public class Pencil {
    private String brand;
    private String shade;
    private int price;
    public Pencil(String brand,String shade,int price){
        this.brand=brand;
        this.shade=shade;
        this.price=price;
    }

    @Override
    public String toString() {
        return "brand : "+brand+" shade : "+shade+" price : "+price;
    }

    @Override
    public int hashCode() {
        return 126;
    }
}
