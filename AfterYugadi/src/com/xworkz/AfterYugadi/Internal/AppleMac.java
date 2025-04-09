package com.xworkz.AfterYugadi.Internal;

public class AppleMac extends Laptop{

    public AppleMac(){
        System.out.println("Running no arg cont AppleMac");
    }
    @Override
    public void manufacture(){
        System.out.println("Running manufacture in AppleMac");
    }

    @Override
    public void buyLaptop(){
        System.out.println("Running buyLaptop in AppleMac");
    }

    @Override
    public void sellLaptop(){
        System.out.println("Running sellLaptop in AppleMac");
    }

    @Override
    public void onLaptop(){
        System.out.println("Running onLaptop in AppleMac");
    }

    @Override
    public void shutDown(){
        System.out.println("Running shutDown in AppleMac");
    }
}
