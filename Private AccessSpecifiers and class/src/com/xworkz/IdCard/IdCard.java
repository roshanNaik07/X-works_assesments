package com.xworkz.IdCard;

public class IdCard {

    private String material;
    private String[] colors;
    private int weight;
    private String designedBy;

    public String getMaterial(){
        return material;
    }

    public void setMaterial(String material){
        this.material=material;
    }

    public String[] getColors(){
        return colors;
    }

    public void setColors(String[] colors){
        this.colors=colors;
    }

    public int getWeight(){
        return weight;
    }

    public void setWeight(int weight){
        this.weight=weight;
    }

    public String getDesignedBy(){
        return designedBy;
    }

    public void setDesignedBy(String designedBy){
        this.designedBy=designedBy;
    }
}
