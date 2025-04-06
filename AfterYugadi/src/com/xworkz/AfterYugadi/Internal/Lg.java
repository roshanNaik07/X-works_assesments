package com.xworkz.AfterYugadi.Internal;

public class Lg extends Tv{

    public Lg(){
        System.out.println("Running no arg of Lg");
    }

    @Override
    public void onTv(){
        System.out.println("Running onTv in Lg");
    }

    @Override
    public void offTv(){
        System.out.println("Running oofTv in Lg");
    }

    @Override
    public void sellTv(){
        System.out.println("Running sellTv in Lg");
    }

    @Override
    public void buyTv(){
        System.out.println("Running buyTv in Lg");
    }

    @Override
    public void deliver(){
        System.out.println("Running deliver in Lg");
    }
}

