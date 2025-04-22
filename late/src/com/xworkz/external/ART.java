package com.xworkz.external;

import com.xworkz.internal.Artist;

public class ART {

    Artist artist;

    public ART(Artist artist) {
        System.out.println("Running no arg const of ART");
        this.artist = artist;
    }
    public void sell(){
        if (this.artist != null) {
            System.out.println("Running sell in ART");
            this.artist.draw();
        } else {
            System.err.println("Artist is null");
        }
    }

}
