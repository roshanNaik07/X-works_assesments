package com.xworkz.AfterYugadi.Internal;

public class Vivo extends Phone {

    public Vivo(){
        System.out.println("No arg cont of Vivo");
    }

    @Override
    public void on(){
        System.out.println("Runnning On in Vivo");
    }

    @Override
    public void off(){
        System.out.println("Runnning off in Vivo");
    }

    @Override
    public void repair(){
        System.out.println("Running repair in Vivo");
    }

    @Override
    public void buy(){
        System.out.println("Running buy in Vivo");
    }

    @Override
    public void changeDisplay(){
        System.out.println("Running changeDisplay in Vivo ");
    }
}
