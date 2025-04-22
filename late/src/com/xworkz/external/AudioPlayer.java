package com.xworkz.external;

import com.xworkz.internal.MusicPlatform;

public class AudioPlayer {
    MusicPlatform platform;

    public AudioPlayer(MusicPlatform platform) {
        this.platform = platform;
        System.out.println("AudioPlayer constructor with MusicPlatform");
    }

    public void playMusic() {
        if (platform != null) {
            System.out.println("Playing music in AudioPlayer");
            platform.streamMusic();
        }
        else {
            System.err.println("MusicPlatform is null");
        }
    }
}
