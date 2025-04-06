package com.xworkz.AfterYugadi.Internal;

public class Adidas extends Shoe{

    public Adidas(){
        System.out.println("Running no arg cont of Adidas");
    }

    @Override
    public void shoeQuality(){
        System.out.println("Running shoeQuality in Adidas");
    }

    @Override
    public void buyShoe(){
        System.out.println("Running buyShoe in Adidas");
    }

    @Override
    public void sellShoe(){
        System.out.println("Running sellShoe in Adidas");
    }

    @Override
    public void manufactureShoe(){
        System.out.println("Running manufactureShoe in Adidas");
    }

    @Override
    public void shoeColor(){
        System.out.println("Running shoeColor in Adidas");
    }
}
