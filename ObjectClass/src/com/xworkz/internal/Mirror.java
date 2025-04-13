package com.xworkz.internal;

public class Mirror {
    private String shape;
    private String type;
    private int price;

    public Mirror(String shape, String type, int price) {
        this.shape = shape;
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Shape: " + shape + ", Type: " + type + ", Price: " + price;
    }

    @Override
    public int hashCode() {
        return 166;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("obj is not null");
            if (obj instanceof Mirror) {
                Mirror mirror = this;
                Mirror mirror1 = (Mirror) obj;
                if (mirror.shape.equals(mirror1.shape) && mirror.type.equals(mirror1.type) && mirror.price == mirror1.price) {
                    return true;
                }
            }
        }
        return false;
    }
}
