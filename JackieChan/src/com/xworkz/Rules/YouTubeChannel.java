package com.xworkz.Rules;

public class YouTubeChannel implements YouTube {

    @Override
    public void rules() {
        System.out.println("YouTube rules");
    }

    @Override
    public void videos() {
        System.out.println("YouTube videos");
    }

    @Override
    public void channels() {
        System.out.println("YouTube channels");
    }
}
