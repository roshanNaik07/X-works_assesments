package com.xworkz.AfterYugadi.Internal;

public class Titan extends Watch{

    public Titan(){
        System.out.println("Running no arg const of Titan");
    }

    @Override
    public void set(){
        System.out.println("Running set in Titan");
    }

    @Override
    public void buy(){
        System.out.println("Running buy in Titan");
    }

    @Override
    public void sell(){
        System.out.println("Running sell in Titan");
    }

    @Override
    public void gift(){
        System.out.println("Running gift in Titan");
    }

    @Override
    public void price(){
        System.out.println("Running price in Titan");
    }
}
