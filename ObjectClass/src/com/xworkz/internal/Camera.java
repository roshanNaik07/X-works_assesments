package com.xworkz.internal;

public class Camera {
    private String brand;
    private String type;
    private int price;
    public Camera(String brand,String type,int price){
        this.brand=brand;
        this.type=type;
        this.price=price;
    }

    @Override
    public String toString() {
        return "brand : "+brand+" type : "+type+" price : "+price;
    }

    @Override
    public int hashCode() {
        return 145;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null){
            System.out.println("obj is not null");
            if (obj instanceof Camera){
                Camera camera = this;
                Camera camera1 =(Camera) obj;
                if (camera.brand.equals(camera1.brand) && camera.type.equals(camera1.type)){
                    return true;
                }
            }
        }
        return false;
    }
}
