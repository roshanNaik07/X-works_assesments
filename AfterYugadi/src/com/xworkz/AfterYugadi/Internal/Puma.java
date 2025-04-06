package com.xworkz.AfterYugadi.Internal;

public class Puma extends Shoe{

    public Puma(){
        System.out.println("Running no arg cont of Puma");
    }

    @Override
    public void shoeQuality(){
        System.out.println("Running shoeQuality in Puma");
    }

    @Override
    public void buyShoe(){
        System.out.println("Running buyShoe in Puma");
    }

    @Override
    public void sellShoe(){
        System.out.println("Running sellShoe in Puma");
    }

    @Override
    public void manufactureShoe(){
        System.out.println("Running manufactureShoe in Puma");
    }

    @Override
    public void shoeColor(){
        System.out.println("Running shoeColor in Puma");
    }
}
