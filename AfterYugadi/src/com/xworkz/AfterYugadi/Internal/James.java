package com.xworkz.AfterYugadi.Internal;

public class James extends  Chocolate{
    public James(){
        System.out.println("Running no arg cont of James");
    }
    @Override
    public void makeChocolate(){
        System.out.println("Running makeChocolate in James");
    }
    @Override
    public void melt(){
        System.out.println("Running melt in James");
    }
    @Override
    public void buyChocolate(){
        System.out.println("Running buyChocolate in James");
    }
    @Override
    public void eatChocolate(){
        System.out.println("Running eatChocolate in James");
    }
    @Override
    public void wrapChocolate(){
        System.out.println("Running wrapChocolate in James");
    }
}
