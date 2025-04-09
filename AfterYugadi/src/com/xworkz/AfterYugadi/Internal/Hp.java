package com.xworkz.AfterYugadi.Internal;

public class Hp extends Laptop{

    public Hp(){
        System.out.println("Running no arg cont Hp");
    }

    @Override
    public void manufacture(){
        System.out.println("Running manufacture in Hp");
    }

    @Override
    public void buyLaptop(){
        System.out.println("Running buyLaptop in Hp");
    }

    @Override
    public void sellLaptop(){
        System.out.println("Running sellLaptop in Hp");
    }

    @Override
    public void onLaptop(){
        System.out.println("Running onLaptop in Hp");
    }

    @Override
    public void shutDown(){
        System.out.println("Running shutDown in Hp");
    }
}
