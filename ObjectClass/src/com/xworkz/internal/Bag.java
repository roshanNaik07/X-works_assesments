package com.xworkz.internal;

public class Bag {
    private String brand;
    private String color;
    private int price;

    public Bag(String brand,String color,int price){
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
        return 111;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null){
            System.out.println("obj is not null");
            if (obj instanceof Bag){
                Bag bag=this;
                Bag bag1=(Bag) obj;
                if (bag.brand.equals(bag1.brand)){
                    return true;
                }
            }
        }
        return false;
    }
}
