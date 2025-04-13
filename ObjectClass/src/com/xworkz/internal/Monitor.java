package com.xworkz.internal;

public class Monitor {
    private String brand;
    private int size;
    private int price;

    public Monitor(String brand, int size, int price) {
        this.brand = brand;
        this.size = size;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Size: " + size + " inches, Price: " + price;
    }

    @Override
    public int hashCode() {
        return 168;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null){
            System.out.println("obj is not null");
            if (obj instanceof Monitor){
                Monitor monitor = this;
                Monitor monitor1 =(Monitor) obj;
                if (monitor.brand.equals(monitor1.brand) && monitor.size==monitor1.size && monitor.price==monitor1.price){
                    return true;
                }
            }
        }
        return false;
    }
}
