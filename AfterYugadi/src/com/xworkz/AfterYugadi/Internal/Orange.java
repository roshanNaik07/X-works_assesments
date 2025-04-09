package com.xworkz.AfterYugadi.Internal;

public class Orange extends Color{

    public Orange(){
        System.out.println("Running no arg const of Orange");
    }

    @Override
    public void buy(){
        System.out.println("Running  buy in Orange");
    }

    @Override
    public void apply(){
        System.out.println("Running  apply in Orange");
    }

    @Override
    public void wash(){
        System.out.println("Running  wash in Orange");
    }

    @Override
    public void throwColor(){
        System.out.println("Running  throwColor in Orange");
    }

    @Override
    public void price(){
        System.out.println("Running  price in Orange");
    }

    public void manufacture(){
        System.out.println("Running manufacture in Orange");
    }
}
