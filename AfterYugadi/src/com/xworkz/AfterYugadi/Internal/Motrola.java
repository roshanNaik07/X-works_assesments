package com.xworkz.AfterYugadi.Internal;

public class Motrola extends Phone{

    public Motrola(){
        System.out.println("No arg cont of Motrola");
    }

    @Override
    public void on(){
        System.out.println("Runnning On in Motrola");
    }

    @Override
    public void off(){
        System.out.println("Runnning off in Motrola");
    }

    @Override
    public void repair(){
        System.out.println("Running repair in Motrola");
    }

    @Override
    public void buy(){
        System.out.println("Running buy in Motrola");
    }

    @Override
    public void changeDisplay(){
        System.out.println("Running changeDisplay in Motrola ");
    }
}
