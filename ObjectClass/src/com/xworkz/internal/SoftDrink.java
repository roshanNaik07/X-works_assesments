package com.xworkz.internal;

public class SoftDrink {
    private String brand;
    private String flavour;
    private int price;
    public SoftDrink(String brand, String flavour, int price){
        this.brand=brand;
        this.flavour=flavour;
        this.price=price;
    }

    @Override
    public String toString() {
        return "brand : "+brand+" flavour : "+flavour+" price : "+price;
    }

    @Override
    public int hashCode() {
        return 193;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null){
            System.out.println("obj is not null");
            if (obj instanceof SoftDrink){
                SoftDrink softDrink = this;
                SoftDrink softDrink1 =(SoftDrink) obj;
                if (softDrink.brand.equals(softDrink1.brand) && softDrink.flavour.equals(softDrink1.flavour)){
                    return true;
                }
            }
        }
        return false;
    }
}
