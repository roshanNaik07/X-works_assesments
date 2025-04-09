package com.xworkz.AfterYugadi.Casting;

import com.xworkz.AfterYugadi.Internal.FaceWash;
import com.xworkz.AfterYugadi.Internal.Garnier;

public class FaceWashBrand {

    public void skinCare(FaceWash faceWash){
        faceWash.apply();
        faceWash.buy();
        faceWash.sell();
        faceWash.price();
        faceWash.color();
        if (faceWash instanceof Garnier){
            Garnier garnier = (Garnier) faceWash;
            garnier.type();
        }
    }
}
