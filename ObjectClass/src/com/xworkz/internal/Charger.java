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

    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            System.out.println("obj is not null");
            if (obj instanceof Charger){
                Charger charger = this;
                Charger charger1=(Charger) obj;
                if (charger.brand.equals(charger1.brand)){
                    return true;
                }
            }
        }
        return false;
    }
}
