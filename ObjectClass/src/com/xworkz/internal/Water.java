package com.xworkz.internal;

public class Water {
    private String brand;
    private int quantity;
    private int price;
    public Water(String brand, int quantity, int price){
        this.brand=brand;
        this.quantity=quantity;
        this.price=price;
    }

    @Override
    public String toString() {
        return "brand : "+brand+" quantity : "+quantity+" price : "+price;
    }

    @Override
    public int hashCode() {
        return 209;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null){
            System.out.println("obj is not null");
            if (obj instanceof Water){
                Water water = this;
                Water water1 =(Water) obj;
                if (water.brand.equals(water1.brand) && water.price==water1.price){
                    return true;
                }
            }
        }
        return false;
    }
}
