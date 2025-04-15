package com.xworkz.internal;

public abstract class Tshirt {
    private String brand;
    private String color;
    private String size;
    private int price;

    public Tshirt(String brand){
        super();
    }

    public Tshirt(String brand,String color,String size){
        this(brand);
        this.color=color;
        this.size=size;
    }

    public Tshirt(String brand,String color,String size,int price){
        this(brand,color,size);
        this.price=price;
    }

    public String toString() {
        return "Brand "+brand+" color : "+color+" size : "+size+" price : "+price;
    }
}
