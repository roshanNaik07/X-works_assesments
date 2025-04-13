package com.xworkz.internal;

public class Mouse {
    private String brand;
    private String type;
    private int price;

    public Mouse(String brand, String type, int price) {
        this.brand = brand;
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Type: " + type + ", Price: " + price;
    }

    @Override
    public int hashCode() {
        return 170;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("obj is not null");
            if (obj instanceof Mouse) {
                Mouse mouse = this;
                Mouse mouse1 = (Mouse) obj;
                if (mouse.brand.equals(mouse1.brand) && mouse.type.equals(mouse1.type) && mouse.price == mouse1.price) {
                    return true;
                }
            }
        }
        return false;
    }
}
