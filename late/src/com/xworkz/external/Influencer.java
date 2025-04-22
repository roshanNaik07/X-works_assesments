package com.xworkz.external;

import com.xworkz.internal.SocialMediaApp;

public class Influencer {
    SocialMediaApp socialMediaApp;

    public Influencer(SocialMediaApp socialMediaApp) {
        this.socialMediaApp = socialMediaApp;
        System.out.println("Running SocialMediaApp param const in Influencer");
    }

    public void post() {
        System.out.println("Running post in Influencer");
        this.socialMediaApp.postContent();
    }
}
