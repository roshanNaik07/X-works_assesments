package com.xworkz.internal;

public class Oil {
    private String brand;
    private String type;
    private int price;
    public Oil(String brand, String type, int price){
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
        return 172;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null){
            System.out.println("obj is not null");
            if (obj instanceof Oil){
                Oil oil = this;
                Oil oil1 =(Oil) obj;
                if (oil.brand.equals(oil1.brand) && oil.type.equals(oil1.type)){
                    return true;
                }
            }
        }
        return false;
    }
}
