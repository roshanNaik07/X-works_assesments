package com.xworkz.internal;

public class Projector {
    private String brand;
    private String resolution;
    private int price;

    public Projector(String brand, String resolution, int price) {
        this.brand = brand;
        this.resolution = resolution;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Brand : " + brand + " Resolution : " + resolution + " Price : " + price;
    }

    @Override
    public int hashCode() {
        return 182;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null){
            System.out.println("obj is not null");
            if (obj instanceof Projector){
                Projector projector = this;
                Projector projector1 =(Projector) obj;
                if (projector.brand.equals(projector1.brand) && projector.resolution.equals(projector1.resolution) && projector.price==projector1.price){
                    return true;
                }
            }
        }
        return false;
    }
}
