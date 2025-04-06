package com.xworkz.AfterYugadi.Internal;

public class Law extends Subject{

    public Law(){
        System.out.println("Running no arg const of Law");
    }

    @Override
    public void read(){
        System.out.println("Running  read in Law");
    }

    @Override
    public void write(){
        System.out.println("Running  write in Law");
    }

    @Override
    public void board(){
        System.out.println("Running  board in Law");
    }

    @Override
    public void learn(){
        System.out.println("Running  learn in Law");
    }

    @Override
    public void price(){
        System.out.println("Running  price in Law");
    }
}
