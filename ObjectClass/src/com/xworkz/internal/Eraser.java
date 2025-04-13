package com.xworkz.internal;

public class Eraser {
    private String brand;
    private String color;
    private int price;
    public Eraser(String brand,String color,int price){
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
        return 128;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null){
            System.out.println("obj is not null");
            if (obj instanceof Eraser){
                Eraser eraser = this;
                Eraser eraser1 =(Eraser) obj;
                if (eraser.brand.equals(eraser.brand)){
                    return true;
                }
            }
        }
        return false;
    }
}
