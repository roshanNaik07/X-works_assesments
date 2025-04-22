package com.xworkz.internal;

public class ArtCustomersImpl implements Artist {

    public ArtCustomersImpl() {
        System.out.println("Running no arg const of ArtCustomersImpl");
    }

    @Override
    public void draw() {
        System.out.println("Running draw in ArtCustomersImpl");

    }
}
