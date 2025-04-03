package com.xworkz.projector;

public class Quality {

    private String material;

    Quality(String material){
        this.material=material;
    }

    void qualityDetails(){
        System.out.println("-----------------------------------");
        System.out.println("Running qualityDetails() in Quality");
        System.out.println("The material of the wire is : "+this.material);
    }
}
