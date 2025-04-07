package com.xworkz.AfterYugadi.Internal;

public class Usha extends Fan{

    public Usha(){
        System.out.println("Running no arg const of Usha");
    }

    @Override
    public void buy(){
        System.out.println("Running plugIn in Usha");
    }

    @Override
    public void rotate(){
        System.out.println("Running remove in Usha");
    }

    @Override
    public void color(){
        System.out.println("Running color in Usha");
    }

    @Override
    public void brand(){
        System.out.println("Running price in Usha");
    }

    @Override
    public void price(){
        System.out.println("Running capacity in fan");
    }

    public void warrenty(){
        System.out.println("Running warrenty in Usha");
    }
}
