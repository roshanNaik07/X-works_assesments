package com.xworkz.internal;

public class Slider {
    private String brand;
    private int size;
    private int price;
    public Slider(String brand,int size,int price){
        this.brand=brand;
        this.size=size;
        this.price=price;
    }

    @Override
    public String toString() {
        return "brand : "+brand+"size : "+size+" price : "+price;
    }

    @Override
    public int hashCode() {
        return 119;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null){
            System.out.println("obj is not null");
            if (obj instanceof Slider){
                Slider slider = this;
                Slider slider1 =(Slider) obj;
                if (slider.brand.equals(slider1.brand)){
                    return true;
                }
            }
        }
        return false;
    }
}
