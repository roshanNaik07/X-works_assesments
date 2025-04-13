package com.xworkz.internal;

public class Snacks {
    private String name;
    private String ingredient;
    private int price;
    public Snacks(String name, String ingredient, int price){
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
        return 192;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null){
            System.out.println("obj is not null");
            if (obj instanceof Snacks){
                Snacks snacks = this;
                Snacks snacks1 =(Snacks) obj;
                if (snacks.name.equals(snacks1.name) && snacks.ingredient.equals(snacks1.ingredient) && snacks.price==snacks1.price){
                    return true;
                }
            }
        }
        return false;
    }
}
