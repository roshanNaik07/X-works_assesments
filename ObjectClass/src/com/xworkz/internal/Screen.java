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

    @Override
    public int hashCode() {
        return 115;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null){
            System.out.println("Obj is not null");
            if (obj instanceof Screen){
                Screen screen = this;
                Screen screen1 = (Screen) obj;
                if (screen.price==screen1.price){
                    return true;
                }
            }
        }
        return false;
    }
}
