package com.xworkz.internal;

public class TabletStand {
    private String material;
    private String color;
    private int price;

    public TabletStand(String material, String color, int price) {
        this.material = material;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Material : " + material + " Color : " + color + " Price : " + price;
    }

    @Override
    public int hashCode() {
        return 202;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null){
            System.out.println("obj is not null");
            if (obj instanceof TabletStand){
                TabletStand tableStand = this;
                TabletStand tableStand1 =(TabletStand) obj;
                if (tableStand.material.equals(tableStand1.material) && tableStand.color.equals(tableStand1.color) && tableStand.price==tableStand1.price){
                    return true;
                }
            }
        }
        return false;
    }
}
