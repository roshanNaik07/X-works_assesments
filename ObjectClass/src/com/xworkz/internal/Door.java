package com.xworkz.internal;

public class Door {
    private String Material;
    private String color;
    private int price;
    public Door(String Material, String color, int price){
        this.Material=Material;
        this.color=color;
        this.price=price;
    }

    @Override
    public String toString() {
        return "Material : "+Material+" color : "+color+" price : "+price;
    }

    @Override
    public int hashCode() {
        return 149;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null){
            System.out.println("obj is not null");
            if (obj instanceof Door){
                Door door = this;
                Door door1 =(Door) obj;
                if (door.Material.equals(door1.Material) && door.color.equals(door1.color) && door.price==door1.price){
                    return true;
                }
            }
        }
        return false;
    }
}
