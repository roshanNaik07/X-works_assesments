package com.xworkz.internal;

public class PenDrive {
    private String brand;
    private int storage;
    private int price;

    public PenDrive(String brand, int storage, int price) {
        this.brand = brand;
        this.storage = storage;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Storage: " + storage + "GB, Price: " + price;
    }

    @Override
    public int hashCode() {
        return 176;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null){
            System.out.println("obj is not null");
            if (obj instanceof PenDrive){
                PenDrive pendrive = this;
                PenDrive pendrive1 =(PenDrive) obj;
                if (pendrive.brand.equals(pendrive1.brand) && pendrive.storage==pendrive1.storage && pendrive.price==pendrive1.price){
                    return true;
                }
            }
        }
        return false;
    }
}
