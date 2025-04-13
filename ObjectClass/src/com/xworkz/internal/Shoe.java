package com.xworkz.internal;

public class Shoe {
    private String brand;
    private int size;
    private int price;
    public Shoe(String brand,int size,int price){
        this.brand=brand;
        this.size=size;
        this.price=price;
    }

    @Override
    public String toString() {
        return "brand : "+brand+"size : "+size+" price : "+price;
    }

    @Override
    public int hashCode() {
        return 119;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            System.out.println("obj is not null");
            if (obj instanceof Shoe){
                Shoe shoe = this;
                Shoe shoe1 = (Shoe) obj;
                if (shoe.size==shoe1.size){
                    return true;
                }
            }
        }
        return false;
    }
}
