package com.xworkz.internal;

public class Ornament {
    private String brand;
    private String material;
    private int price;
    public Ornament(String brand, String material, int price){
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
        return 173;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null){
            System.out.println("obj is not null");
            if (obj instanceof Ornament){
                Ornament ornament = this;
                Ornament ornament1 =(Ornament) obj;
                if (ornament.brand.equals(ornament1.brand) && ornament.material.equals(ornament1.material)){
                    return true;
                }
            }
        }
        return false;
    }
}
