package com.xworkz.AfterYugadi.Internal;

public class Nikon extends Camera{

    public Nikon(){
        System.out.println("Runner no arg const of Nikon");
    }

    @Override
    public void buy(){
        System.out.println("Running plugIn in Nikon");
    }

    @Override
    public void operate(){
        System.out.println("Running remove in Nikon");
    }

    @Override
    public void click(){
        System.out.println("Running color in Nikon");
    }

    @Override
    public void focus(){
        System.out.println("Running price in Nikon");
    }

    @Override
    public void lens(){
        System.out.println("Running capacity in Nikon");
    }

    public void price(){
        System.out.println("Running price in Nikon");
    }
}
