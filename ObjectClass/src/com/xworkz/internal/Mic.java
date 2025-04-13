package com.xworkz.internal;

public class Mic {
    private String type;
    private String brand;
    private int price;

    public Mic(String type, String brand, int price) {
        this.type = type;
        this.brand = brand;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Type : " + type + " Brand : " + brand + " Price : " + price;
    }

    @Override
    public int hashCode() {
        return 165;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null){
            System.out.println("obj is not null");
            if (obj instanceof Mic){
                Mic mac = this;
                Mic mac1 =(Mic) obj;
                if (mac.type.equals(mac1.type) && mac.brand.equals(mac1.brand) && mac.price==mac1.price){
                    return true;
                }
            }
        }
        return false;
    }
}
