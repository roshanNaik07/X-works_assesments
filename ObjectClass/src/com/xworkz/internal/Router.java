package com.xworkz.internal;

public class Router {
    private String brand;
    private int speed;
    private int price;

    public Router(String brand, int speed, int price) {
        this.brand = brand;
        this.speed = speed;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Brand : " + brand + " Speed : " + speed + " Mbps Price : " + price;
    }

    @Override
    public int hashCode() {
        return 185;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null){
            System.out.println("obj is not null");
            if (obj instanceof Router){
                Router router = this;
                Router router1 =(Router) obj;
                if (router.brand.equals(router1.brand) && router.speed==router1.speed && router.price==router1.price){
                    return true;
                }
            }
        }
        return false;
    }
}
