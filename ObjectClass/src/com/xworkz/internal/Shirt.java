package com.xworkz.internal;

public class Shirt {
    private String Brand;
    private String color;
    private int price;

    public Shirt(String Brand,String color,int price){
        this.Brand=Brand;
        this.color=color;
        this.price=price;
    }

    @Override
    public String toString() {
        return "Brand : "+Brand+"color : "+color+" price : "+price;
    }

    @Override
    public int hashCode() {
        return 117;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            System.out.println("obj is not null");
            if (obj instanceof Shirt){
                Shirt shirt = this;
                Shirt shirt1 =(Shirt) obj;
                if (shirt.Brand.equals(shirt1.Brand)){
                    return true;
                }
            }
        }
        return false;
    }
}
