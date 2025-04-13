package com.xworkz.internal;

public class Stabilizer {
    private String brand;
    private int voltage;
    private int price;

    public Stabilizer(String brand, int voltage, int price) {
        this.brand = brand;
        this.voltage = voltage;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Brand : " + brand + " Voltage : " + voltage + "V Price : " + price;
    }

    @Override
    public int hashCode() {
        return 196;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null){
            System.out.println("obj is not null");
            if (obj instanceof Stabilizer){
                Stabilizer stabilizer = this;
                Stabilizer stabilizer1 =(Stabilizer) obj;
                if (stabilizer.brand.equals(stabilizer1.brand) && stabilizer.voltage==stabilizer1.voltage && stabilizer.price==stabilizer1.price){
                    return true;
                }
            }
        }
        return false;
    }
}
