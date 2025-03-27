package com.xworkz.projector;

public class Capacitor {

    private String watt;
    private int price;

    Capacitor(String watt,int price){
        this.watt=watt;
        this.price=price;
    }

    void capacitorDetails(){
        System.out.println("----------------------------------");
        System.out.println("Running capacitorDetails() in Capacitor");
        System.out.println("Capcitor watt is : "+this.watt);
        System.out.println("Capacitor price is : "+this.price);
    }
}
