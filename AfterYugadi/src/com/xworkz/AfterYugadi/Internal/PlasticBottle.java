package com.xworkz.AfterYugadi.Internal;

public class PlasticBottle extends Bottle{

    public PlasticBottle(){
        System.out.println("running no arg const of PlasticBottle");
    }
    @Override
    public void manufacture(){
        System.out.println("Running manufacture in PlasticBottle");
    }

    @Override
    public void color(){
        System.out.println("Running color in PlasticBottle");
    }

    @Override
    public void fill(){
        System.out.println("Running fill in PlasticBottle");
    }

    @Override
    public void openBottle(){
        System.out.println("Running openBottle in PlasticBottle");
    }

    @Override
    public void closeBottle(){
        System.out.println("Running closeBottle in PlasticBottle");
    }
}
