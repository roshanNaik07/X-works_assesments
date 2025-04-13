package com.xworkz.internal;

public class Keyboard {
    private String brand;
    private String layout;
    private int price;

    public Keyboard(String brand, String layout, int price) {
        this.brand = brand;
        this.layout = layout;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Layout: " + layout + ", Price: " + price;
    }

    @Override
    public int hashCode() {
        return 163;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null){
            System.out.println("obj is not null");
            if (obj instanceof Keyboard){
                Keyboard keyboard = this;
                Keyboard keyboard1 =(Keyboard) obj;
                if (keyboard.brand.equals(keyboard1.brand) && keyboard.layout.equals(keyboard1.layout) && keyboard.price==keyboard1.price){
                    return true;
                }
            }
        }
        return false;
    }
}
