package com.xworkz.AfterYugadi.Internal;

public class Sparks extends Shoe{

    public Sparks(){
        System.out.println("Running no arg cont of Sparks");
    }

    @Override
    public void shoeQuality(){
        System.out.println("Running shoeQuality in Sparks");
    }

    @Override
    public void buyShoe(){
        System.out.println("Running buyShoe in Sparks");
    }

    @Override
    public void sellShoe(){
        System.out.println("Running sellShoe in Sparks");
    }

    @Override
    public void manufactureShoe(){
        System.out.println("Running manufactureShoe in Sparks");
    }

    @Override
    public void shoeColor(){
        System.out.println("Running shoeColor in Sparks");
    }
}
