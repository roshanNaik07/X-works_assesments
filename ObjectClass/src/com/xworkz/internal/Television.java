package com.xworkz.internal;

public class Television {
    private String brand;
    private int size;
    private int price;

    public Television(String brand, int size, int price) {
        this.brand = brand;
        this.size = size;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Size: " + size + " inches, Price: " + price;
    }

    @Override
    public int hashCode() {
        return 203;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null){
            System.out.println("obj is not null");
            if (obj instanceof Television){
                Television television = this;
                Television television1 =(Television) obj;
                if (television.brand.equals(television1.brand) && television.size==television1.size && television.price==television1.price){
                    return true;
                }
            }
        }
        return false;
    }
}
