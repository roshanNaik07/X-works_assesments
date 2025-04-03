package com.xworkz.projector;

public class Lamp {

    private int lampPrice;
    private String lampShape;
    Warrenty warrenty;

    Lamp(int lampPrice,String lampShape,Warrenty warrenty){
        this.lampPrice=lampPrice;
        this.lampShape=lampShape;
        this.warrenty=warrenty;
    }

    void onLamp(){
        System.out.println("--------------------------------------");
        System.out.println("Running onLamp in Lamp");
        System.out.println("Lamp price is : "+this.lampPrice);
        System.out.println("Lamp shape is : "+this.lampShape);
        warrenty.warrentyDetails();
    }
}
