package com.xworkz.internal;

public class PenguinImpl implements Publisher {
    public PenguinImpl() {
        System.out.println("PenguinImpl constructor");
    }

    @Override
    public void publishBook() {
        System.out.println("Book published by PenguinImpl");
    }
}
