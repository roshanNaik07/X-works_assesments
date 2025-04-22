package com.xworkz.internal;

public class SocialMediaUserImpl implements Instagram {

    public SocialMediaUserImpl() {
        System.out.println("Running no arg const of SocialMediaUserImpl");
    }

    @Override
    public void install() {
        System.out.println("Running install in SocialMediaUserImpl");

    }
}
