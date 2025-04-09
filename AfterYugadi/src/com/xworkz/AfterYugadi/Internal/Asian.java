package com.xworkz.AfterYugadi.Internal;

public class Asian extends Shoe{

    public Asian(){
        System.out.println("Running no arg cont of Asian");
    }

    @Override
    public void shoeQuality(){
        System.out.println("Running shoeQuality in Asian");
    }

    @Override
    public void buyShoe(){
        System.out.println("Running buyShoe in Asian");
    }

    @Override
    public void sellShoe(){
        System.out.println("Running sellShoe in Asian");
    }

    @Override
    public void manufactureShoe(){
        System.out.println("Running manufactureShoe in Asian");
    }

    @Override
    public void shoeColor(){
        System.out.println("Running shoeColor in Asian");
    }
}
