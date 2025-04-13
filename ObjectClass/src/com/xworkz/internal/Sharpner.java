package com.xworkz.internal;

public class Sharpner {
    private String brand;
    private String color;
    private int price;
    public Sharpner(String brand,String color,int price){
        this.brand=brand;
        this.color=color;
        this.price=price;
    }

    @Override
    public String toString() {
        return "brand : "+brand+" color : "+color+" price : "+price;
    }

    @Override
    public int hashCode() {
        return 129;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null){
            System.out.println("obj is not null");
            if (obj instanceof Sharpner){
                Sharpner sharpner = this;
                Sharpner sharpner1 =(Sharpner) obj;
                if (sharpner.brand.equals(sharpner1.brand)){
                    return true;
                }
            }
        }
        return false;
    }
}
