package com.xworkz.internal;

public class Sweet {
    private String name;
    private String ingredient;
    private int price;
    public Sweet(String name, String ingredient, int price){
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
        return 198;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null){
            System.out.println("obj is not null");
            if (obj instanceof Sweet){
                Sweet sweet = this;
                Sweet sweet1 =(Sweet) obj;
                if (sweet.name.equals(sweet1.name) && sweet.ingredient.equals(sweet1.ingredient)){
                    return true;
                }
            }
        }
        return false;
    }
}
