package com.xworkz.internal;

public class Mug {
    private String brand;
    private String color;
    private int price;
    public Mug(String brand,String color,int price){
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
        return 171;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null){
            System.out.println("obj is not null");
            if (obj instanceof Mug){
                Mug mug = this;
                Mug mug1 =(Mug) obj;
                if (mug.brand.equals(mug1.brand) && mug.color.equals(mug1.color) && mug.price==mug1.price){
                    return true;
                }
            }
        }
        return false;
    }
}
