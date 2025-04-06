package com.xworkz.AfterYugadi.Internal;

public class Panasonic extends Battery{
    public Panasonic(){
        System.out.println("Running no arg const of Panasonic");
    }

    @Override
    public void buy(){
        System.out.println("Running  buy in Panasonic");
    }

    @Override
    public void plug(){
        System.out.println("Running  plug in Panasonic");
    }

    @Override
    public void blast(){
        System.out.println("Running  blast in Panasonic");
    }

    @Override
    public void size(){
        System.out.println("Running  size in Panasonic");
    }
    @Override
    public void price(){
        System.out.println("Running  price in Panasonic");
    }
}
