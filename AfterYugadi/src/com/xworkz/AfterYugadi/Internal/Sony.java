package com.xworkz.AfterYugadi.Internal;

public class Sony extends Tv{

    public Sony(){
        System.out.println("Running no arg cont of Sony");
    }

    @Override
    public void onTv(){
        System.out.println("Running onTv in Sony");
    }

    @Override
    public void offTv(){
        System.out.println("Running oofTv in Sony");
    }

    @Override
    public void sellTv(){
        System.out.println("Running sellTv in Sony");
    }

    @Override
    public void buyTv(){
        System.out.println("Running buyTv in Sony");
    }

    @Override
    public void deliver(){
        System.out.println("Running deliver in Sony");
    }
}
