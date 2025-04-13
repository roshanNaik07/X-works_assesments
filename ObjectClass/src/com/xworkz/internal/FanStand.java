package com.xworkz.internal;

public class FanStand {
    private String brand;
    private int height;
    private int price;

    public FanStand(String brand, int height, int price) {
        this.brand = brand;
        this.height = height;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Height: " + height + "cm, Price: " + price;
    }

    @Override
    public int hashCode() {
        return 153;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null){
            System.out.println("obj is not null");
            if (obj instanceof FanStand){
                FanStand fanStand = this;
                FanStand fanStand1 =(FanStand) obj;
                if (fanStand.brand.equals(fanStand1.brand) && fanStand.height==fanStand1.height && fanStand.price==fanStand1.price){
                    return true;
                }
            }
        }
        return false;
    }
}
