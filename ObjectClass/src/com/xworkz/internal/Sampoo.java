package com.xworkz.internal;

public class Sampoo {
    private String brand;
    private String ingredient;
    private int price;
    public Sampoo(String brand,String ingredient,int price){
        this.brand=brand;
        this.ingredient=ingredient;
        this.price=price;
    }

    @Override
    public String toString() {
        return "brand : "+brand+" ingredient : "+ingredient+" price : "+price;
    }

    @Override
    public int hashCode() {
        return 186;
    }
}
