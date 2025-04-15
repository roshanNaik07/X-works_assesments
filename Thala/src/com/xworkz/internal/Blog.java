package com.xworkz.internal;

public class Blog extends Article {

    @Override
    public void publish() {
        System.out.println("Running publish in Blog");
    }

}