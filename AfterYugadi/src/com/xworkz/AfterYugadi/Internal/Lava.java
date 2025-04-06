package com.xworkz.AfterYugadi.Internal;

public class Lava extends Phone{

    public Lava(){
        System.out.println("No arg cont of Lava");
    }

    @Override
    public void on(){
        System.out.println("Runnning On in Lava");
    }

    @Override
    public void off(){
        System.out.println("Runnning off in Lava");
    }

    @Override
    public void repair(){
        System.out.println("Running repair in Lava");
    }

    @Override
    public void buy(){
        System.out.println("Running buy in Lava");
    }

    @Override
    public void changeDisplay(){
        System.out.println("Running changeDisplay in Lava ");
    }
}
