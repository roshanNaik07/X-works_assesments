package com.xworkz.internal;

public class Moisturiser {
    private String brand;
    private String type;
    private int price;
    public Moisturiser(String brand, String type, int price){
        this.brand=brand;
        this.type=type;
        this.price=price;
    }

    @Override
    public String toString() {
        return "brand : "+brand+" type : "+type+" price : "+price;
    }

    @Override
    public int hashCode() {
        return 167;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null){
            System.out.println("obj is not null");
            if (obj instanceof Moisturiser){
                Moisturiser moisturiser = this;
                Moisturiser moisturiser1 =(Moisturiser) obj;
                if (moisturiser.brand.equals(moisturiser1.brand) && moisturiser.type.equals(moisturiser1.type)){
                    return true;
                }
            }
        }
        return false;
    }
}
