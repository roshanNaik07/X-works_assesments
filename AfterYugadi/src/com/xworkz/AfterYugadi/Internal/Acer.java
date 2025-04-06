package com.xworkz.AfterYugadi.Internal;

public class Acer extends Laptop{

    public Acer(){
        System.out.println("Running no arg cont Acer");
    }

    @Override
    public void manufacture(){
        System.out.println("Running manufacture in Acer");
    }

    @Override
    public void buyLaptop(){
        System.out.println("Running buyLaptop in Acer");
    }

    @Override
    public void sellLaptop(){
        System.out.println("Running sellLaptop in Acer");
    }

    @Override
    public void onLaptop(){
        System.out.println("Running onLaptop in Acer");
    }

    @Override
    public void shutDown(){
        System.out.println("Running shutDown in Acer");
    }
}
