package com.xworkz.internal;

public class Frame {
    private String size;
    private String material;
    private int price;

    public Frame(String size, String material, int price) {
        this.size = size;
        this.material = material;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Size: " + size + ", Material: " + material + ", Price: " + price;
    }

    @Override
    public int hashCode() {
        return 156;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null){
            System.out.println("obj is not null");
            if (obj instanceof Frame){
                Frame frame = this;
                Frame frame1 =(Frame) obj;
                if (frame.size.equals(frame1.size) && frame.material.equals(frame1.material) && frame.price==frame1.price){
                    return true;
                }
            }
        }
        return false;
    }
}
