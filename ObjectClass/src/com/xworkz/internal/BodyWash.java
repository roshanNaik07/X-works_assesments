package com.xworkz.internal;

public class BodyWash {
    private String brand;
    private String ingredient;
    private int price;
    public BodyWash(String brand,String ingredient,int price){
        this.brand=brand;
        this.ingredient=ingredient;
        this.price=price;
    }

    @Override
    public String toString() {
        return "brand : "+brand+" ingredient : "+ingredient+" price : "+price;
    }
}
