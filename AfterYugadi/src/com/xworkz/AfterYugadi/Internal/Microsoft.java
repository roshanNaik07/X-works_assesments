package com.xworkz.AfterYugadi.Internal;

public class Microsoft extends Laptop{

    public Microsoft(){
        System.out.println("Running no arg cont Microsoft");
    }
    @Override
    public void manufacture(){
        System.out.println("Running manufacture in Microsoft");
    }

    @Override
    public void buyLaptop(){
        System.out.println("Running buyLaptop in Microsoft");
    }

    @Override
    public void sellLaptop(){
        System.out.println("Running sellLaptop in Microsoft");
    }

    @Override
    public void onLaptop(){
        System.out.println("Running onLaptop in Microsoft");
    }

    @Override
    public void shutDown(){
        System.out.println("Running shutDown in Microsoft");
    }
}
