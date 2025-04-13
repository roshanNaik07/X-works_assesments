package com.xworkz.internal;

public class IronBox {
    private String brand;
    private String color;
    private int price;
    public IronBox(String brand,String color,int price){
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
        return 122;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null){
            System.out.println("obj is not null");
            if (obj instanceof IronBox){
                IronBox ironBox = this;
                IronBox ironBox1 =(IronBox) obj;
                if (ironBox.brand.equals(ironBox1.brand)){
                    return true;
                }
            }
        }
        return false;
    }
}
