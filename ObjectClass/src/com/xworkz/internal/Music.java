package com.xworkz.internal;

public class Music {
    private String appName;
    private int subscription;
    private int mb;
    public Music(String appName,int subscription,int mb){
        this.appName=appName;
        this.subscription=subscription;
        this.mb=mb;
    }

    @Override
    public String toString() {
        return "appName : "+appName+" subscription : "+subscription+" mb : "+mb;
    }
}
