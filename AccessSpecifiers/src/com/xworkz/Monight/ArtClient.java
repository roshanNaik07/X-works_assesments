package com.xworkz.Monight;
import com.xworkz.MondayMood.ArtWork;

public class ArtClient {

    public void clientOrder(ArtWork artWork){
        if(artWork!=null){
            System.out.println("Artwork name is "+artWork.name);
            artWork.frameArtWork();
        }
        else System.out.println("artClient is pointing to null");
    }
}
