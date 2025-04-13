package com.xworkz.internal;

public class Bat {
    private String brand;
    private int weight;
    private int price;
    public Bat(String brand, int weight, int price){
        this.brand=brand;
        this.weight=weight;
        this.price=price;
    }

    @Override
    public String toString() {
        return "brand : "+brand+" Range : "+weight+" price : "+price;
    }

    @Override
    public int hashCode() {
        return 141;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null){
            System.out.println("obj is not null");
            if (obj instanceof Bat){
                Bat bat = this;
                Bat bat1 =(Bat) obj;
                if (bat.brand.equals(bat1.brand) && bat.weight==bat1.weight){
                    return true;
                }
            }
        }
        return false;
    }
}
