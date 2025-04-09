package com.xworkz.AfterYugadi.Internal;

public class Xiomi extends  Phone{

    public Xiomi(){
        System.out.println("No arg cont of Xiomi");
    }
    @Override
    public void on(){
        System.out.println("Runnning On in Xiomi");
    }

    @Override
    public void off(){
        System.out.println("Runnning off in Xiomi");
    }

    @Override
    public void repair(){
        System.out.println("Running repair in Xiomi");
    }

    @Override
    public void buy(){
        System.out.println("Running buy in Xiomi");
    }

    @Override
    public void changeDisplay(){
        System.out.println("Running changeDisplay in Xiomi ");
    }
}
