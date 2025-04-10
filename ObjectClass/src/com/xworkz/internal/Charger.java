package com.xworkz.internal;

import java.util.Objects;

public class Charger {
    private String brand;
    private int length;
    private int price;

    public Charger(String brand,int length,int price){
        this.brand=brand;
        this.length=length;
        this.price=price;
    }

    @Override
    public String toString(){
        return "Brand : "+brand+" length : "+length+" price : "+price;
    }

    @Override
    public int hashCode() {
        return 113;
    }
}
