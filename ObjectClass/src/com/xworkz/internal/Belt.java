package com.xworkz.internal;

public class Belt {
    private String Brand;
    private String material;
    private int price;
    public Belt(String Brand,String material,int price){
        this.Brand=Brand;
        this.material=material;
        this.price=price;
    }

    @Override
    public String toString() {
        return "Brand : "+Brand+"material : "+material+" price : "+price;
    }

    @Override
    public int hashCode() {
        return 118;
    }
}
