package com.xworkz.artgallery.dto;

import java.io.Serializable;

public class ArtGalleryDTO implements Serializable {

    private String artist ;
    private String title ;
    private String artType ;
    private int price ;
    private String size ;
    private String medium ;
    private String email ;
    private String mode ;

    public int getPk() {
        return pk;
    }

    public void setPk(int pk) {
        this.pk = pk;
    }

    private int pk;

    public ArtGalleryDTO(){
        System.out.println("Running no arg constructor of ArtGallery DTO");
    }

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

    @Override
    public String toString() {
        return "ArtGalleryDTO{" +
                "artist='" + artist + '\'' +
                ", title='" + title + '\'' +
                ", artType='" + artType + '\'' +
                ", price=" + price +
                ", size='" + size + '\'' +
                ", medium='" + medium + '\'' +
                ", email='" + email + '\'' +
                ", mode='" + mode + '\'' +
                '}';
    }


}
