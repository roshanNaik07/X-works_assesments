package com.xworkz.internal;

public class TV {
    private String brand;
    private int size;
    private int price;

    public TV(String brand, int size, int price) {
        this.brand = brand;
        this.size = size;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Brand : " + brand + " Size : " + size + " inch Price : " + price;
    }

    @Override
    public int hashCode() {
        return 207;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null){
            System.out.println("obj is not null");
            if (obj instanceof TV){
                TV tv = this;
                TV tv1 =(TV) obj;
                if (tv.brand.equals(tv1.brand) && tv.size==tv1.size && tv.price==tv1.price){
                    return true;
                }
            }
        }
        return false;
    }
}
