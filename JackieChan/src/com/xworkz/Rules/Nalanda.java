package com.xworkz.Rules;

public class Nalanda implements Library{

    @Override
    public void rules() {
        System.out.println("Rules of Nalanda");
    }

    @Override
    public void silence() {
        System.out.println("Silence in Nalanda");
    }

    @Override
    public void library() {
        System.out.println("Library of Nalanda");
    }
}
