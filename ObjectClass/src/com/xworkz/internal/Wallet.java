package com.xworkz.internal;

public class Wallet {
    private String brand;
    private String material;
    private int price;

    public Wallet(String brand, String material, int price) {
        this.brand = brand;
        this.material = material;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Material: " + material + ", Price: " + price;
    }

    @Override
    public int hashCode() {
        return 208;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null){
            System.out.println("obj is not null");
            if (obj instanceof Wallet){
                Wallet wallet = this;
                Wallet wallet1 =(Wallet) obj;
                if (wallet.brand.equals(wallet1.brand) && wallet.material.equals(wallet1.material) && wallet.price==wallet1.price){
                    return true;
                }
            }
        }
        return false;
    }
}
