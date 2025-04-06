package com.xworkz.AfterYugadi.Internal;

public class Jorden extends Shoe{

    public Jorden(){
        System.out.println("Running no arg cont of Jorden");
    }


    @Override
    public void shoeQuality(){
        System.out.println("Running shoeQuality in Jorden");
    }

    @Override
    public void buyShoe(){
        System.out.println("Running buyShoe in Jorden");
    }

    @Override
    public void sellShoe(){
        System.out.println("Running sellShoe in Jorden");
    }

    @Override
    public void manufactureShoe(){
        System.out.println("Running manufactureShoe in Jorden");
    }

    @Override
    public void shoeColor(){
        System.out.println("Running shoeColor in Jorden");
    }
}
