package com.xworkz.AfterYugadi.Internal;

public class Lewis extends Belt{

    public Lewis(){
        System.out.println("Running no arg const of Lewis");
    }
    @Override
    public void color(){
        System.out.println("Running color in Lewis");
    }

    @Override
    public void buy(){
        System.out.println("Running buy in Lewis");
    }

    @Override
    public void sell(){
        System.out.println("Running sell in Lewis");
    }

    @Override
    public void manufacture(){
        System.out.println("Running manufacture in Lewis");
    }

    @Override
    public void price(){
        System.out.println("Running price in Lewis");
    }
}
