package com.xworkz.AfterYugadi.Internal;

public class Physics extends Book{

    public Physics(){
        System.out.println("Running no arg const of Physics");
    }

    @Override
    public void read(){
        System.out.println("Running  read in Physics");
    }

    @Override
    public void buy(){
        System.out.println("Running buy in Physics");
    }

    @Override
    public void writer(){
        System.out.println("Running writer in Physics");
    }

    @Override
    public void learn(){
        System.out.println("Running learn in Physics");
    }

    @Override
    public void price(){
        System.out.println("Running price in Physics");
    }
}
