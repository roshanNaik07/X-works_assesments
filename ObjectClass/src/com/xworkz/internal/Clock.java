package com.xworkz.internal;

public class Clock {
    private String brand;
    private String type;
    private int price;

    public Clock(String brand, String type, int price) {
        this.brand = brand;
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Type: " + type + ", Price: " + price;
    }

    @Override
    public int hashCode() {
        return 146;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null){
            System.out.println("obj is not null");
            if (obj instanceof Clock){
                Clock clock = this;
                Clock clock1 =(Clock) obj;
                if (clock.brand.equals(clock1.brand) && clock.type.equals(clock1.type) && clock.price==clock1.price){
                    return true;
                }
            }
        }
        return false;
    }
}
