package com.xworkz.AfterYugadi.Internal;

public class Bright extends Pen{

    public Bright(){
        System.out.println("Running no arg const of Bright");
    }

    @Override
    public void buy(){
        System.out.println("Running  buy in Bright");
    }

    @Override
    public void refill(){
        System.out.println("Running  refill in Bright");
    }

    @Override
    public void color(){
        System.out.println("Running  color in Bright");
    }

    @Override
    public void use(){
        System.out.println("Running  use in Bright");
    }
    @Override
    public void price(){
        System.out.println("Running  price in Bright");
    }
}
