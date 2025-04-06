package com.xworkz.AfterYugadi.Internal;

public class Silicon extends BackCover{

    public Silicon(){
        System.out.println("Running no arg const of Silicon");
    }

    @Override
    public void color(){
        System.out.println("Running color in Silicon");
    }

    @Override
    public void theme(){
        System.out.println("Running theme in Silicon");
    }

    @Override
    public void material(){
        System.out.println("Running material in Silicon");
    }

    @Override
    public void addBackCover(){
        System.out.println("Running addBackCover in Silicon");
    }

    @Override
    public void remove(){
        System.out.println("Running remove in Silicon");
    }
}
