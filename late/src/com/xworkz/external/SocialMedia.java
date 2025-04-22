package com.xworkz.external;

import com.xworkz.internal.Instagram;

public class SocialMedia {
    Instagram instagram;

    public SocialMedia(Instagram instagram) {
        this.instagram = instagram;
        System.out.println("Running no arg const of SocialMedia");
    }
    public void use() {
        if (this.instagram != null) {
            System.out.println("Running use in SocialMedia");
            this.instagram.install();
        } else {
            System.err.println("Instagram is null");
        }
    }
}
