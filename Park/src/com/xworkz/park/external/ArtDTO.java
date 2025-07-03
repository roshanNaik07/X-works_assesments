package com.xworkz.park.external;

public class ArtDTO {

    private String exhibitionName;
    private String location;
    private String exhibitionType;
    private String artistName;
    private String artName;
    private String artType;
    private int artPrice;
    private String material;
    private String size;
    private boolean forSale;

    public ArtDTO(String exhibitionName, String location, String exhibitionType, String artistName, String artName, String artType, int artPrice, String material, String size, boolean forSale) {
        this.exhibitionName = exhibitionName;
        this.location = location;
        this.exhibitionType = exhibitionType;
        this.artistName = artistName;
        this.artName = artName;
        this.artType = artType;
        this.artPrice = artPrice;
        this.material = material;
        this.size = size;
        this.forSale = forSale;
    }

    public String getExhibitionName() {
        return exhibitionName;
    }

    public String getLocation() {
        return location;
    }

    public String getExhibitionType() {
        return exhibitionType;
    }

    public String getArtistName() {
        return artistName;
    }

    public String getArtName() {
        return artName;
    }

    public String getArtType() {
        return artType;
    }

    public int getArtPrice() {
        return artPrice;
    }

    public String getMaterial() {
        return material;
    }

    public String getSize() {
        return size;
    }

    public boolean isForSale() {
        return forSale;
    }

    @Override
    public String toString() {
        return "ArtDTO{" +
                "exhibitionName='" + exhibitionName + '\'' +
                ", location='" + location + '\'' +
                ", exhibitionType='" + exhibitionType + '\'' +
                ", artistName='" + artistName + '\'' +
                ", artName='" + artName + '\'' +
                ", artType='" + artType + '\'' +
                ", artPrice=" + artPrice +
                ", material='" + material + '\'' +
                ", size='" + size + '\'' +
                ", forSale=" + forSale +
                '}';
    }
}
