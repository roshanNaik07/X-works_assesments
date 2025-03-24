package com.xworkz.MondayMood;

public class Runner {

    public static void main(String[] args) {

        ArtWork artWork = new ArtWork();
        Artist artist = new Artist();
        artist.artworkStatus(artWork);

        System.out.println("-----------------------------------------\n-----------------------------------");

        PG pg = new PG();
        PgOwner pgOwner= new PgOwner();
        pgOwner.ownerAction(pg);
    }
}
