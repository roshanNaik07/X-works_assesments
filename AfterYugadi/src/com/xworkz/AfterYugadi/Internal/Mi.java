package com.xworkz.AfterYugadi.Internal;

public class Mi extends Tv{

    public Mi(){
        System.out.println("runnning no arg of Mi");
    }

    @Override
    public void onTv(){
        System.out.println("Running onTv in Mi");
    }

    @Override
    public void offTv(){
        System.out.println("Running oofTv in Mi");
    }

    @Override
    public void sellTv(){
        System.out.println("Running sellTv in Mi");
    }

    @Override
    public void buyTv(){
        System.out.println("Running buyTv in Mi");
    }

    @Override
    public void deliver(){
        System.out.println("Running deliver in Mi");
    }
}
