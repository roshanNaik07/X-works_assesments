package com.xworkz.AfterYugadi.Casting;
import com.xworkz.AfterYugadi.Internal.Song;
import com.xworkz.AfterYugadi.Internal.Spotify;

public class MusicApp {

    public void runApp(Song song){
        song.compose();
        song.delete();
        song.download();
        song.play();
        song.playlist();

        if(song instanceof Spotify){
            //casting : converting the dataType
            Spotify spotify = (Spotify) song;
            spotify.install();
        }
    }
}
