package com.xworkz.internal;

public class Lamp {
    private String type;
    private String color;
    private int price;

    public Lamp(String type, String color, int price) {
        this.type = type;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Type: " + type + ", Color: " + color + ", Price: " + price;
    }

    @Override
    public int hashCode() {
        return 164;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null){
            System.out.println("obj is not null");
            if (obj instanceof Lamp){
                Lamp lamp = this;
                Lamp lamp1 =(Lamp) obj;
                if (lamp.type.equals(lamp1.type) && lamp.color.equals(lamp1.color) && lamp.price==lamp1.price){
                    return true;
                }
            }
        }
        return false;
    }
}
