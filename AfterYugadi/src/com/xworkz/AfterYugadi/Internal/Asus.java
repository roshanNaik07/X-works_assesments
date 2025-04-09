package com.xworkz.AfterYugadi.Internal;

public class Asus extends Lenovo{

    public Asus(){
        System.out.println("Running no arg cont Asus");
    }

    @Override
    public void manufacture(){
        System.out.println("Running manufacture in Asus");
    }

    @Override
    public void buyLaptop(){
        System.out.println("Running buyLaptop in Asus");
    }

    @Override
    public void sellLaptop(){
        System.out.println("Running sellLaptop in Asus");
    }

    @Override
    public void onLaptop(){
        System.out.println("Running onLaptop in Asus");
    }

    @Override
    public void shutDown(){
        System.out.println("Running shutDown in Asus");
    }
}
