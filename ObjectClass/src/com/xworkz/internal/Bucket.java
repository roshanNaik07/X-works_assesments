package com.xworkz.internal;

public class Bucket {
    private String brand;
    private String color;
    private int price;
    public Bucket(String brand,String color,int price){
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
        return 133;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null){
            System.out.println("obj is not null");
            if (obj instanceof Bucket){
                Bucket bucket = this;
                Bucket bucket1 =(Bucket) obj;
                if (bucket.color.equals(bucket1.color)){
                    return true;
                }
            }
        }
        return false;
    }
}
