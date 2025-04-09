package com.xworkz.AfterYugadi.Casting;

import com.xworkz.AfterYugadi.Internal.Shirt;
import com.xworkz.AfterYugadi.Internal.Zudio;

public class ClothingBrand {

    public void choose(Shirt shirt){
        shirt.buy();
        shirt.iron();
        shirt.color();
        shirt.wash();
        shirt.price();

        if (shirt instanceof Zudio){

            Zudio zudio = (Zudio) shirt;
            zudio.choice();
        }
    }
}
