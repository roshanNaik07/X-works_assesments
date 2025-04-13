package com.xworkz.internal;

public class Speaker {
    private String brand;
    private String type;
    private int price;

    public Speaker(String brand, String type, int price) {
        this.brand = brand;
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return "brand : " + brand + " type : " + type + " price : " + price;
    }

    @Override
    public int hashCode() {
        return 194;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("obj is not null");
            if (obj instanceof Speaker) {
                Speaker speaker = this;
                Speaker speaker1 = (Speaker) obj;
                if (speaker.brand.equals(speaker1.brand) && speaker.type.equals(speaker1.type)) {
                    return true;
                }
            }
        }
        return false;
    }
}

