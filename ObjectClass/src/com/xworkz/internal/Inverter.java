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
}
