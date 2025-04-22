package com.xworkz.internal;

public class NetflixImpl implements VideoStreaming {
    public NetflixImpl() {
        System.out.println("Running no-arg const of NetflixImpl");
    }

    @Override
    public void streamVideo() {
        System.out.println("Streaming on NetflixImpl");
    }
}

