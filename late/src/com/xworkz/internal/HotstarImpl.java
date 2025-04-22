package com.xworkz.internal;

public class HotstarImpl implements EntertainmentApp {
    public HotstarImpl() {
        System.out.println("Running no-arg const of HotstarImpl");
    }

    @Override
    public void playContent() {
        System.out.println("Playing content on HotstarImpl");
    }
}
