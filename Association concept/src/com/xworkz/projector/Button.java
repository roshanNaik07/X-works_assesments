package com.xworkz.projector;

public class Button {

    private int noOfButtons;
    private String color;
    private Material material;

    Button(int noOfButtons , String color,Material material){
        this.noOfButtons=noOfButtons;
        this.color=color;
        this.material=material;
    }

    void buttonDetails(){
        System.out.println("-------------------------------------");
        System.out.println("Running buttonDetails() in Button");
        System.out.println("Total number of buttons are : "+this.noOfButtons);
        System.out.println("Color of the button is : "+this.color);
        material.materialDetails();
    }
}
