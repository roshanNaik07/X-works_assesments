package com.xworkz.AfterYugadi.Internal;

public class MiBand extends FitnessBand{

    public MiBand(){
        System.out.println("Running no arg const of MiBand");
    }
    @Override
    public void set(){
        System.out.println("Running set in MiBand");
    }

    @Override
    public void buy(){
        System.out.println("Running buy in MiBand");
    }

    @Override
    public void sell(){
        System.out.println("Running sell in MiBand");
    }

    @Override
    public void gift(){
        System.out.println("Running gift in MiBand");
    }

    @Override
    public void price(){
        System.out.println("Running price in MiBand");
    }

    public void wear(){
        System.out.println("Running wear in MiBand");
    }
}
