package com.xworkz.Satelite;

public class Satelite {
    private Type type;
    private int cost;
    private int weight;
    private int loadCapacity;

    public Type getType(){
        return type;
    }

    public void setType(Type type){
        this.type=type;
    }

    public int getCost(){
        return cost;
    }

    public void setCost(int cost){
        this.cost=cost;
    }

    public int getWeight(){
        return weight;
    }

    public void setWeight(int weight){
        this.weight=weight;
    }

    public int getLoadCapacity(){
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity){
        this.loadCapacity=loadCapacity;
    }
}
