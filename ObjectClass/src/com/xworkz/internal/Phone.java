package com.xworkz.internal;

import java.util.Objects;

public class Phone {
    private String brand;
    private String category;
    private int price;

    public Phone(String brand,String category,int price){
        this.brand=brand;
        this.category=category;
        this.price=price;
    }

    @Override
    public String toString(){
        return "Brand : "+brand+" category : "+category+" price : "+price;
    }

    @Override
    public int hashCode() {
        return 114;
    }
}
