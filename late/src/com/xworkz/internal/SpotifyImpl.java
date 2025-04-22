package com.xworkz.internal;

public class SpotifyImpl implements MusicPlatform {
    public SpotifyImpl() {
        System.out.println("Running no-arg constructor of SpotifyImpl");
    }

    @Override
    public void streamMusic() {
        System.out.println("Streaming music on SpotifyImpl");
    }
}
