package com.xworkz.AfterYugadi.Internal;

public class Spotify extends Song{

    public Spotify(){
        System.out.println("No arg const of Spotify");
    }

    @Override
    public void play(){
        System.out.println("Running play in Spotify");
    }

    @Override
    public void compose(){
        System.out.println("Running compose in Spotify");
    }

    @Override
    public void download(){
        System.out.println("Running download in Spotify");
    }

    @Override
    public void playlist(){
        System.out.println("Running playlist in Spotify");
    }

    @Override
    public void delete(){
        System.out.println("Running delete in Spotify");
    }
}
