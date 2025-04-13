package com.xworkz.internal;

public class Tablet {
    private String brand;
    private int ram;
    private int price;

    public Tablet(String brand, int ram, int price) {
        this.brand = brand;
        this.ram = ram;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Brand : " + brand + " RAM : " + ram + "GB Price : " + price;
    }

    @Override
    public int hashCode() {
        return 201;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null){
            System.out.println("obj is not null");
            if (obj instanceof Tablet){
                Tablet tablet = this;
                Tablet tablet1 =(Tablet) obj;
                if (tablet.brand.equals(tablet1.brand) && tablet.ram==tablet1.ram && tablet.price==tablet1.price){
                    return true;
                }
            }
        }
        return false;
    }
}
