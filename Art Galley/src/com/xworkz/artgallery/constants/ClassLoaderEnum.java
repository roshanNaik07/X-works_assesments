package com.xworkz.artgallery.constants;

public enum ClassLoaderEnum {

    URL("jdbc:mysql://localhost:3306/artgallery"),
    USERNAME("root"),
    SECRET("Xworkzodc@123")
    ;

    private String prop;

    ClassLoaderEnum(String prop)
    {
        this.prop=prop;
    }

    public String getProp() {
        return prop;
    }
}
