package com.xworkz.internal;

public class Laptop {

    private String brand;
    private String color;
    private int price;

    public Laptop(String brand,String color,int price){
        this.brand=brand;
        this.color=color;
        this.price=price;
    }

    @Override
    public String toString(){
        return "Brand : "+brand+" color : "+color+" price : "+price;
    }

    @Override
    public int hashCode() {
        return 112;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            System.out.println("obj is not null");
            if (obj instanceof Laptop){
                Laptop laptop = this;
                Laptop laptop1 = (Laptop) obj;
                if (laptop.color.equals(laptop1.color)){
                    return true;
                }
            }
        }
        return false;
    }
}
