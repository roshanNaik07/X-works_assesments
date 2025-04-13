package com.xworkz.internal;

public class Smartwatch {
    private String brand;
    private String model;
    private int price;

    public Smartwatch(String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Model: " + model + ", Price: " + price;
    }

    @Override
    public int hashCode() {
        return 191;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null){
            System.out.println("obj is not null");
            if (obj instanceof Smartwatch){
                Smartwatch smartWatch = this;
                Smartwatch smartWatch1 =(Smartwatch) obj;
                if (smartWatch.brand.equals(smartWatch1.brand) && smartWatch.model.equals(smartWatch1.model) && smartWatch.price==smartWatch1.price){
                    return true;
                }
            }
        }
        return false;
    }
}
