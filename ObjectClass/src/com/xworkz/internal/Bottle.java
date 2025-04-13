package com.xworkz.internal;

public class Bottle {
    private int capacity;
    private String color;
    private int price;

    public Bottle(int capacity,String color,int price){
        this.capacity=capacity;
        this.color=color;
        this.price=price;
    }

    @Override
    public String toString() {
        return "Capacity : "+capacity+"color : "+color+" price : "+price;
    }

    @Override
    public int hashCode() {
        return 116;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null){
            System.out.println("Obj is not null");
            if (obj instanceof  Bottle){
                Bottle bottle= this;
                Bottle bottle1 = (Bottle)obj;
                if (bottle.color.equals(bottle1.color)){
                    return true;
                }
            }
        }
        return false;
    }
}
