package com.xworkz.projector;

public class Lens {

    private String size;
    private int lensPrice;


    public Lens(String size ,int lensPrice){
        this.size=size;
        this.lensPrice=lensPrice;
    }

    public void fixLens(){
        System.out.println("---------------------------------------");
        System.out.println("Running fixlens in Lens");
        System.out.println("The size of the lens is : "+this.size);
        System.out.println("The price of the lens is : "+this.lensPrice);
    }
}
