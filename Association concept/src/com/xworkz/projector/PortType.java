package com.xworkz.projector;

public class PortType {
    private int price;
    private String warrenty;

    PortType(int price , String warrenty){
        this.price=price;
        this.warrenty=warrenty;
    }

    void portTypeDetails(){
        System.out.println("-------------------------------------");
        System.out.println("Running portTypeDetails in PortType");
        System.out.println("price is : "+this.price);
        System.out.println("Warrenty time : "+this.warrenty);
    }

}
