package com.xworkz.AfterYugadi.Internal;

public class Oppo extends Phone{

    public Oppo(){
        System.out.println("No arg cont of Oppo");
    }

    @Override
    public void on(){
        System.out.println("Runnning On in Oppo");
    }

    @Override
    public void off(){
        System.out.println("Runnning off in Oppo");
    }

    @Override
    public void repair(){
        System.out.println("Running repair in Oppo");
    }

    @Override
    public void buy(){
        System.out.println("Running buy in Oppo");
    }

    @Override
    public void changeDisplay(){
        System.out.println("Running changeDisplay in Oppo ");
    }
}
