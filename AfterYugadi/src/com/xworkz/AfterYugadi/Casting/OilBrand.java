package com.xworkz.AfterYugadi.Casting;

import com.xworkz.AfterYugadi.Internal.Oil;
import com.xworkz.AfterYugadi.Internal.Pamoil;

public class OilBrand {

    public void type(Oil oil){
        oil.quality();
        oil.apply();
        oil.buy();
        oil.sell();
        oil.price();
        if (oil instanceof Pamoil){
            Pamoil pamoil = (Pamoil) oil;
            pamoil.cook();
        }
    }
}
