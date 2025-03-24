package com.xworkz.MondayMood;

public class Artist {



    void artworkStatus(ArtWork artWork){
        System.out.println("Running artworkStatus in artWork");
        if(artWork!=null){
            System.out.println("Artwork name is :"+artWork.name);
            System.out.println("Artwork price is :"+artWork.price);
            artWork.frameArtWork();
            artWork.sellArtWork();
            artWork.artDetails(artWork);
        }
        else System.out.println("artwork is pointing to null");
    }

}
