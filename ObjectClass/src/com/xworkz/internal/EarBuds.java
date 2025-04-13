package com.xworkz.internal;

public class EarBuds {

    private String brand;
    private String color;
    private int price;
    public EarBuds(String brand, String color, int price){
        this.brand=brand;
        this.color=color;
        this.price=price;
    }

    @Override
    public String toString() {
        return "brand : "+brand+" color : "+color+" price : "+price;
    }

    @Override
    public int hashCode() {
        return 150;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null){
            System.out.println("obj is not null");
            if (obj instanceof EarBuds){
                EarBuds earBuds = this;
                EarBuds earBuds1 =(EarBuds) obj;
                if (earBuds.brand.equals(earBuds1.brand) && earBuds.color.equals(earBuds1.color)){
                    return true;
                }
            }
        }
        return false;
    }
}
