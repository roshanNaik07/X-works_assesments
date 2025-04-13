package com.xworkz.internal;

public class SuitCase {
    private String brand;
    private String color;
    private int price;
    public SuitCase(String brand,String color,int price){
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
        return 197;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null){
            System.out.println("obj is not null");
            if (obj instanceof SuitCase){
                SuitCase suitCase = this;
                SuitCase suitCase1 =(SuitCase) obj;
                if (suitCase.brand.equals(suitCase1.brand) && suitCase.color.equals(suitCase1.color)){
                    return true;
                }
            }
        }
        return false;
    }
}
