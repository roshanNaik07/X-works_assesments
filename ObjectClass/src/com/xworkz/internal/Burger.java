package com.xworkz.internal;

public class Burger {
    private String name;
    private String ingredient;
    private int price;
    public Burger(String name, String ingredient, int price){
        this.name=name;
        this.ingredient=ingredient;
        this.price=price;
    }

    @Override
    public String toString() {
        return "name : "+name+" ingredient : "+ingredient+" price : "+price;
    }

    @Override
    public int hashCode() {
        return 144;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null){
            System.out.println("obj is not null");
            if (obj instanceof Burger){
                Burger burger = this;
                Burger burger1 =(Burger) obj;
                if (burger.name.equals(burger1.name) && burger.ingredient.equals(burger1.ingredient) && burger.price==burger1.price){
                    return true;
                }
            }
        }
        return false;
    }
}
