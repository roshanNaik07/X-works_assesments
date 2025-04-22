package com.xworkz.internal;

public class InstagramImpl implements SocialMediaApp {
    public InstagramImpl() {
        System.out.println("Running no-arg const of InstagramImpl");
    }

    @Override
    public void postContent() {
        System.out.println("Posting content on InstagramImpl");
    }
}
