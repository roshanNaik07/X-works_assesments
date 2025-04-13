package com.xworkz.internal;

public class Brush {
    private String brand;
    private String type;
    private int price;
    public Brush(String brand,String type,int price){
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
        return 143;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null){
            System.out.println("obj is not null");
            if (obj instanceof Brush){
                Brush brush = this;
                Brush brush1 =(Brush) obj;
                if (brush.brand.equals(brush1.brand)){
                    return true;
                }
            }
        }
        return false;
    }
}
