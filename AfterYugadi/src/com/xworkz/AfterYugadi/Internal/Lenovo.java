package com.xworkz.AfterYugadi.Internal;

public class Lenovo extends Laptop{

    public Lenovo(){
        System.out.println("Running no arg cont Lenovo");
    }

    @Override
    public void manufacture(){
        System.out.println("Running manufacture in Lenovo");
    }

    @Override
    public void buyLaptop(){
        System.out.println("Running buyLaptop in Lenovo");
    }

    @Override
    public void sellLaptop(){
        System.out.println("Running sellLaptop in Lenovo");
    }

    @Override
    public void onLaptop(){
        System.out.println("Running onLaptop in Lenovo");
    }

    @Override
    public void shutDown(){
        System.out.println("Running shutDown in Lenovo");
    }
}
