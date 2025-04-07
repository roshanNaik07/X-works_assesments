package com.xworkz.AfterYugadi.Internal;

public class Kathak extends Dance{

    public Kathak(){
        System.out.println("Running no arg const of Kathak");
    }

    @Override
    public void learn(){
        System.out.println("Running learn in Kathak");
    }

    @Override
    public void practice(){
        System.out.println("Running practice in Kathak");
    }

    @Override
    public void perform(){
        System.out.println("Running perform in Kathak");
    }

    @Override
    public void teach(){
        System.out.println("Running teach in Kathak");
    }

    @Override
    public void compitation(){
        System.out.println("Running compitation in Kathak");
    }

    public void show(){
        System.out.println("Running show in Kathak");
    }
}
