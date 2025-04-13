package com.xworkz.internal;

public class Sampoo {
    private String brand;
    private String ingredient;
    private int price;
    public Sampoo(String brand,String ingredient,int price){
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
        return 186;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null){
            System.out.println("obj is not null");
            if (obj instanceof Sampoo){
                Sampoo sampoo = this;
                Sampoo sampoo1 =(Sampoo) obj;
                if (sampoo.brand.equals(sampoo1.brand)){
                    return true;
                }
            }
        }
        return false;
    }
}
