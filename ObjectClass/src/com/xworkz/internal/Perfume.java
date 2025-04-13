package com.xworkz.internal;

public class Perfume {
    private String brand;
    private String type;
    private int price;
    public Perfume(String brand, String type, int price){
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
        return 177;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null){
            System.out.println("obj is not null");
            if (obj instanceof Perfume){
                Perfume perfume = this;
                Perfume perfume1 =(Perfume) obj;
                if (perfume.brand.equals(perfume1.brand) && perfume.type.equals(perfume1.type)){
                    return true;
                }
            }
        }
        return false;
    }

}
