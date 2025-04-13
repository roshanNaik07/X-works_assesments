package com.xworkz.internal;

public class Inverter {
    private String brand;
    private int backupHours;
    private int price;

    public Inverter(String brand, int backupHours, int price) {
        this.brand = brand;
        this.backupHours = backupHours;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Brand : " + brand + " Backup : " + backupHours + " hrs Price : " + price;
    }

    @Override
    public int hashCode() {
        return 161;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null){
            System.out.println("obj is not null");
            if (obj instanceof Inverter){
                Inverter inverter = this;
                Inverter inverter1 =(Inverter) obj;
                if (inverter.brand.equals(inverter1.brand) && inverter.backupHours==inverter1.backupHours && inverter.price==inverter1.price){
                    return true;
                }
            }
        }
        return false;
    }
}
