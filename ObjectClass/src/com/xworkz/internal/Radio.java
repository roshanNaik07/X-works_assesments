package com.xworkz.internal;

public class Radio {
    private String brand;
    private String type;
    private int price;
    public Radio(String brand,String type,int price){
        this.brand=brand;
        this.type=type;
        this.price=price;
    }

    @Override
    public String toString() {
        return "brand : "+brand+" type : "+type+" price : "+price;
    }

    @Override
    public int hashCode() {
        return 183;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null){
            System.out.println("obj is not null");
            if (obj instanceof Radio){
                Radio radio = this;
                Radio radio1 =(Radio) obj;
                if (radio.brand.equals(radio1.brand) && radio.type.equals(radio1.type)){
                    return true;
                }
            }
        }
        return false;
    }
}
