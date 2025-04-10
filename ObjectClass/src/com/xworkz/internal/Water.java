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
}
