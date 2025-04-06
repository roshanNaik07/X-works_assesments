package com.xworkz.AfterYugadi.Internal;

public class Zebronics extends KeyBoard{

    public Zebronics(){
        System.out.println("Running no arg const of Zebronics");
    }

    @Override
    public void buy(){
        System.out.println("Running plugIn in Zebronics");
    }

    @Override
    public void operate(){
        System.out.println("Running remove in Zebronics");
    }

    @Override
    public void click(){
        System.out.println("Running color in Zebronics");
    }

    @Override
    public void color(){
        System.out.println("Running price in Zebronics");
    }
    @Override
    public void price(){
        System.out.println("Running capacity in Zebronics");
    }
}
