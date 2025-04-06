package com.xworkz.AfterYugadi.Internal;

public class VivoBook extends Laptop{

    public VivoBook(){
        System.out.println("Running no arg cont VivoBook");
    }

    @Override
    public void manufacture(){
        System.out.println("Running manufacture in VivoBook");
    }

    @Override
    public void buyLaptop(){
        System.out.println("Running buyLaptop in VivoBook");
    }

    @Override
    public void sellLaptop(){
        System.out.println("Running sellLaptop in VivoBook");
    }

    @Override
    public void onLaptop(){
        System.out.println("Running onLaptop in VivoBook");
    }

    @Override
    public void shutDown(){
        System.out.println("Running shutDown in VivoBook");
    }

}
