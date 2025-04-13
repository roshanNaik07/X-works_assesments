package com.xworkz.internal;

public class Tshirt {
    private String brand;
    private String color;
    private int price;

    public Tshirt(String brand,String color,int price){
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
        return 206;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("tshirt is not null");
            if (obj instanceof Tshirt){
                Tshirt tshirt=this;
                Tshirt tshirt1 = (Tshirt) obj;
                if(tshirt.brand.equals(tshirt1.brand) && tshirt.color.equals(tshirt1.color) && tshirt.price == tshirt1.price){
                    System.out.println("Both the tshirts are same");
                    return true;
                }
            }
        }
        return false;
    }
}
