package com.xworkz.MondayMood;

public class ArtWork {

    public String name ="Krishna" ;
    int price =5000;
    private int count=1;

    public void frameArtWork(){
        System.out.println("Running frameArtWork");
    }

    void sellArtWork(){
        System.out.println("Running sellArtWork ");
    }

    private void buyArtWork(ArtWork artWork){
        if(artWork!=null){
            System.out.println("number of artwork is "+artWork.count);
        }
        else System.out.println("artWork is pointing to null");
    }

    void artDetails(ArtWork artWork){
        if(artWork!=null){
            artWork.buyArtWork(artWork);
        }
        else System.out.println("artwork is pointing to null");
    }

}
