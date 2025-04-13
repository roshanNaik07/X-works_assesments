package com.xworkz.internal;

public class BodyWash {
    private String brand;
    private String ingredient;
    private int price;
    public BodyWash(String brand,String ingredient,int price){
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
        return 142;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null){
            System.out.println("obj is not null");
            if (obj instanceof BodyWash){
                BodyWash bodyWash = this;
                BodyWash bodyWash1 =(BodyWash) obj;
                if (bodyWash.brand.equals(bodyWash.brand) && bodyWash.ingredient.equals(bodyWash.ingredient)){
                    return true;
                }
            }
        }
        return false;
    }
}
