package com.xworkz.internal;

public class Jug {
    private String brand;
    private String material;
    private int price;
    public Jug(String brand, String material, int price){
        this.brand=brand;
        this.material=material;
        this.price=price;
    }

    @Override
    public String toString() {
        return "brand : "+brand+" material : "+material+" price : "+price;
    }

    @Override
    public int hashCode() {
        return 162;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null){
            System.out.println("obj is not null");
            if (obj instanceof Jug){
                Jug jug = this;
                Jug jug1 =(Jug) obj;
                if (jug.brand.equals(jug1.brand) && jug.material.equals(jug1.material)){
                    return true;
                }
            }
        }
        return false;
    }
}
