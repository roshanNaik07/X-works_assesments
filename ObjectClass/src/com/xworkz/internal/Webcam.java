package com.xworkz.internal;

public class Webcam {
    private String brand;
    private String resolution;
    private int price;

    public Webcam(String brand, String resolution, int price) {
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
        return 210;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null){
            System.out.println("obj is not null");
            if (obj instanceof Webcam){
                Webcam webcam = this;
                Webcam webcam1 =(Webcam) obj;
                if (webcam.brand.equals(webcam1.brand) && webcam.resolution.equals(webcam1.resolution) && webcam.price==webcam1.price){
                    return true;
                }
            }
        }
        return false;
    }
}
