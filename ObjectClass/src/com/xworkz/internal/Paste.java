package com.xworkz.internal;

public class Paste {
    private String brand;
    private String ingredient;
    private int price;
    public Paste(String brand,String ingredient,int price){
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
        return 136;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null){
            System.out.println("obj is not null");
            if (obj instanceof Paste){
                Paste paste = this;
                Paste paste1 =(Paste) obj;
                if (paste.brand.equals(paste1.brand)){
                    return true;
                }
            }
        }
        return false;
    }
}
