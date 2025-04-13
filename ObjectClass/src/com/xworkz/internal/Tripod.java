package com.xworkz.internal;

public class Tripod {
    private String brand;
    private int height;
    private int price;

    public Tripod(String brand, int height, int price) {
        this.brand = brand;
        this.height = height;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Brand : " + brand + " Height : " + height + " cm Price : " + price;
    }

    @Override
    public int hashCode() {
        return 205;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null){
            System.out.println("obj is not null");
            if (obj instanceof Tripod){
                Tripod tripod = this;
                Tripod tripod1 =(Tripod) obj;
                if (tripod.brand.equals(tripod1.brand) && tripod.height==tripod1.height && tripod.price==tripod1.price){
                    return true;
                }
            }
        }
        return false;
    }
}
