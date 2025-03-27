package com.xworkz.projector;

public class Board {

    private String color;
    private String size;
    private Capacitor capacitor;

    Board(String color,String size,Capacitor capacitor){
        this.color=color;
        this.size=size;
        this.capacitor=capacitor;
    }

    void boardDetails(){
        System.out.println("-------------------------------------------");
        System.out.println("Running boardDetails in Board");
        System.out.println("Color of the board is : "+this.color);
        System.out.println("Size of the board is : "+this.size);
        capacitor.capacitorDetails();
    }
}
