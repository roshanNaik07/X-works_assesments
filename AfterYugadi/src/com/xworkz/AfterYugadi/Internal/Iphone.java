package com.xworkz.AfterYugadi.Internal;

public class Iphone extends Phone{

    public Iphone(){
        System.out.println("No arg cont of Iphone");
    }

    @Override
    public void on(){
        System.out.println("Runnning On in Iphone");
    }

    @Override
    public void off(){
        System.out.println("Runnning off in Iphone");
    }

    @Override
    public void repair(){
        System.out.println("Running repair in Iphone");
    }

    @Override
    public void buy(){
        System.out.println("Running buy in Iphone");
    }

    @Override
    public void changeDisplay(){
        System.out.println("Running changeDisplay in Iphone ");
    }
}
