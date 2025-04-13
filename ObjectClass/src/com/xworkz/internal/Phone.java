package com.xworkz.internal;

import java.util.Objects;

public class Phone {
    private String brand;
    private String category;
    private int price;

    public Phone(String brand,String category,int price){
        this.brand=brand;
        this.category=category;
        this.price=price;
    }

    @Override
    public String toString(){
        return "Brand : "+brand+" category : "+category+" price : "+price;
    }

    @Override
    public int hashCode() {
        return 114;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null){
            System.out.println("obj is not null");
            if (obj instanceof Phone){
                Phone phone = this;
                Phone phone1= (Phone) obj;
                if (phone.category.equals(phone1.category));
            }
        }
        return false;
    }
}
