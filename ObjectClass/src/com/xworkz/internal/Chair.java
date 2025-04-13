package com.xworkz.internal;

public class Chair {
    private String type;
    private String material;
    private int price;

    public Chair(String type, String material, int price) {
        this.type = type;
        this.material = material;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Type: " + type + ", Material: " + material + ", Price: " + price;
    }

    @Override
    public int hashCode() {
        return 146;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null){
            System.out.println("obj is not null");
            if (obj instanceof Chair){
                Chair chair = this;
                Chair chair1 =(Chair) obj;
                if (chair.type.equals(chair1.type) && chair.material.equals(chair1.material) && chair.price==chair1.price){
                    return true;
                }
            }
        }
        return false;
    }
}
