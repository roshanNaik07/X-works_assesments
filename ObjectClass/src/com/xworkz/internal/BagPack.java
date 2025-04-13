package com.xworkz.internal;

public class BagPack {
    private String brand;
    private int size;
    private int price;

    public BagPack(String brand, int size, int price) {
        this.brand = brand;
        this.size = size;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Size: " + size + "L, Price: " + price;
    }

    @Override
    public int hashCode() {
        return 139;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null){
            System.out.println("obj is not null");
            if (obj instanceof BagPack){
                BagPack bagPack = this;
                BagPack bagPack1 =(BagPack) obj;
                if (bagPack.brand.equals(bagPack1.brand) && bagPack.size==bagPack1.size && bagPack.price==bagPack1.price){
                    return true;
                }
            }
        }
        return false;
    }
}
