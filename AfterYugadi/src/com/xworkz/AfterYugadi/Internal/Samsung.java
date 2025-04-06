package com.xworkz.AfterYugadi.Internal;

public class Samsung extends Tv{

    public Samsung(){
        System.out.println("Running no arg cont of Samsung");
    }

    @Override
    public void onTv(){
        System.out.println("Running onTv in Samsung");
    }

    @Override
    public void offTv(){
        System.out.println("Running oofTv in Samsung");
    }

    @Override
    public void sellTv(){
        System.out.println("Running sellTv in Samsung");
    }

    @Override
    public void buyTv(){
        System.out.println("Running buyTv in Samsung");
    }

    @Override
    public void deliver(){
        System.out.println("Running deliver in Samsung");
    }
}
