package com.xworkz.artgallery.dto;

import java.io.Serializable;

public class ArtGalleryDTO implements Serializable {

    String artist ;
    String title ;
    String artType ;
    int price ;
    String size ;
    String medium ;
    String email ;
    String mode ;

    public ArtGalleryDTO(String artist, String title, String artType, int price, String size, String medium, String email, String mode) {
        this.artist = artist;
        this.title = title;
        this.artType = artType;
        this.price = price;
        this.size = size;
        this.medium = medium;
        this.email = email;
        this.mode = mode;
    }

    public String getMode() {
        return mode;
    }

    public String getEmail() {
        return email;
    }

    public String getMedium() {
        return medium;
    }

    public String getSize() {
        return size;
    }

    public int getPrice() {
        return price;
    }

    public String getArtType() {
        return artType;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

}
