package com.xworkz.internal;

public class Facewash {
    private String brand;
    private String ingredient;
    private int price;
    public Facewash(String brand,String ingredient,int price){
        this.brand=brand;
        this.ingredient=ingredient;
        this.price=price;
    }

    @Override
    public String toString() {
        return "brand : "+brand+" ingredient : "+ingredient+" price : "+price;
    }

    @Override
    public int hashCode() {
        return 134;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null){
            System.out.println("obj is not null");
            if (obj instanceof Facewash){
                Facewash facewash = this;
                Facewash facewash1 =(Facewash) obj;
                if (facewash.brand.equals(facewash1.brand)){
                    return true;
                }
            }
        }
        return false;
    }
}
