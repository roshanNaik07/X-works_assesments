package com.xworkz.projector;

public class Wire {

    private int length;
    private String color;
    private Quality quality;

    Wire(int length,String color,Quality quality){
        this.length=length;
        this.color=color;
        this.quality=quality;
    }

    void wireDetails(){
        System.out.println("-------------------------------------");
        System.out.println("Running wireDetails() in Wire");
        System.out.println("Length of the wire is : "+this.length+" meter");
        System.out.println("Color of the wire is : "+this.color);
        quality.qualityDetails();
    }
}
