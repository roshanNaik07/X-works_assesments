package com.xworkz.AfterYugadi.Internal;

public class Onida extends Tv{

    public Onida(){
        System.out.println("Running no arg cont of Onida");
    }

    @Override
    public void onTv(){
        System.out.println("Running onTv in Onida");
    }

    @Override
    public void offTv(){
        System.out.println("Running oofTv in Onida");
    }

    @Override
    public void sellTv(){
        System.out.println("Running sellTv in Onida");
    }

    @Override
    public void buyTv(){
        System.out.println("Running buyTv in Onida");
    }

    @Override
    public void deliver(){
        System.out.println("Running deliver in Onida");
    }
}
