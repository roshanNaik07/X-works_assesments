package com.xworkz.internal;

public class Burger {
    private String name;
    private String ingredient;
    private int price;
    public Burger(String name, String ingredient, int price){
        this.name=name;
        this.ingredient=ingredient;
        this.price=price;
    }

    @Override
    public String toString() {
        return "name : "+name+" ingredient : "+ingredient+" price : "+price;
    }

    @Override
    public int hashCode() {
        return 144;
    }
}
