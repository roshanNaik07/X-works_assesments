package com.xworkz.AfterYugadi.Internal;

public class Sandisk extends Pendrive{

    public Sandisk(){
        System.out.println("Running no arg const of Sandisk");
    }

    @Override
    public void plugIn(){
        System.out.println("Running plugIn in Sandisk");
    }

    @Override
    public void eject(){
        System.out.println("Running eject in Sandisk");
    }

    @Override
    public void buyPendrive(){
        System.out.println("Running buyPendrive in Sandisk");
    }

    @Override
    public void sellPendrive(){
        System.out.println("Running sellPendrive in Sandisk");
    }

    @Override
    public void upload(){
        System.out.println("Running upload in Sandisk");
    }
}
