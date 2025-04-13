package com.xworkz.internal;

public class Table {
    private String material;
    private String color;
    private int price;

    public Table(String material, String color, int price) {
        this.material = material;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Material: " + material + ", Color: " + color + ", Price: " + price;
    }

    @Override
    public int hashCode() {
        return 200;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null){
            System.out.println("obj is not null");
            if (obj instanceof Table){
                Table table = this;
                Table table1 =(Table) obj;
                if (table.material.equals(table1.material) && table.color.equals(table1.color) && table.price==table1.price){
                    return true;
                }
            }
        }
        return false;
    }
}
