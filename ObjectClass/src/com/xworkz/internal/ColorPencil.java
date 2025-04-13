package com.xworkz.internal;

public class ColorPencil {
    private String brand;
    private String color;
    private int price;
    public ColorPencil(String brand,String color,int price){
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
        return 127;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null){
            System.out.println("obj is not null");
            if (obj instanceof ColorPencil){
                ColorPencil colorPencil = this;
                ColorPencil colorPencil1 =(ColorPencil) obj;
                if (colorPencil.brand.equals(colorPencil.brand)){
                    return true;
                }
            }
        }
        return false;
    }
}
