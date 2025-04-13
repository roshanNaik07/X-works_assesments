package com.xworkz.internal;

public class Pizza {
    private String name;
    private String ingredient;
    private int price;


    public Pizza(String name, String ingredient, int price){
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
        return 178;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null){
            System.out.println("obj is not null");
            if (obj instanceof Pizza){
                Pizza pizza = this;
                Pizza pizza1 =(Pizza) obj;
                if (pizza.name.equals(pizza1.name) && pizza.ingredient.equals(pizza1.ingredient) && pizza.price==pizza1.price){
                    return true;
                }
            }
        }
        return false;
    }
}
