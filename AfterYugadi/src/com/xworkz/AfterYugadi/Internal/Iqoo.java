package com.xworkz.AfterYugadi.Internal;

public class Iqoo extends Phone{

    public Iqoo(){
        System.out.println("No arg cont of Iqoo");
    }

    @Override
    public void on(){
        System.out.println("Runnning On in Iqoo");
    }

    @Override
    public void off(){
        System.out.println("Runnning off in Iqoo");
    }

    @Override
    public void repair(){
        System.out.println("Running repair in Iqoo");
    }

    @Override
    public void buy(){
        System.out.println("Running buy in Iqoo");
    }

    @Override
    public void changeDisplay(){
        System.out.println("Running changeDisplay in Iqoo ");
    }
}
