package com.xworkz.internal;

public class Screen {
    private String brand;
    private String size;
    private int price;

    public Screen(String brand,String size,int price){
        this.brand=brand;
        this.size=size;
        this.price=price;
    }

    @Override
    public String toString(){
        return "Brand : "+brand+" size : "+size+" price : "+price;
    }
}
