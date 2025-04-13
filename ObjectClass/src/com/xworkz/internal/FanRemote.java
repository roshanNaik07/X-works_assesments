package com.xworkz.internal;

public class FanRemote {
    private String brand;
    private int range;
    private int price;

    public FanRemote(String brand, int range, int price) {
        this.brand = brand;
        this.range = range;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Range: " + range + "m, Price: " + price;
    }

    @Override
    public int hashCode() {
        return 152;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null){
            System.out.println("obj is not null");
            if (obj instanceof FanRemote){
                FanRemote fanRemote = this;
                FanRemote fanRemote1 =(FanRemote) obj;
                if (fanRemote.brand.equals(fanRemote1.brand) && fanRemote.range==fanRemote1.range && fanRemote.price==fanRemote1.price){
                    return true;
                }
            }
        }
        return false;
    }
}
