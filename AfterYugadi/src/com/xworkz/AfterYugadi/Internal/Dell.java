package com.xworkz.AfterYugadi.Internal;

public class Dell extends Laptop{

    public Dell(){
        System.out.println("Running no arg cont Dell");
    }
    @Override
    public void manufacture(){
        System.out.println("Running manufacture in Dell");
    }

    @Override
    public void buyLaptop(){
        System.out.println("Running buyLaptop in Dell");
    }

    @Override
    public void sellLaptop(){
        System.out.println("Running sellLaptop in Dell");
    }

    @Override
    public void onLaptop(){
        System.out.println("Running onLaptop in Dell");
    }

    @Override
    public void shutDown(){
        System.out.println("Running shutDown in Dell");
    }
}
