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

    @Override
    public int hashCode() {
        return 132;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null){
            System.out.println("obj is not null");
            if (obj instanceof Music){
                Music music = this;
                Music music1 =(Music) obj;
                if (music.appName.equals(music.appName)){
                    return true;
                }
            }
        }
        return false;
    }
}
