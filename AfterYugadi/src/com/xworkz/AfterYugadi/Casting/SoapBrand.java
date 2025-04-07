package com.xworkz.AfterYugadi.Casting;

import com.xworkz.AfterYugadi.Internal.Medimix;
import com.xworkz.AfterYugadi.Internal.Soap;

public class SoapBrand {

    public void type(Soap soap){
        soap.apply();
        soap.buy();
        soap.sell();
        soap.price();
        soap.wash();

        if (soap instanceof Medimix){
            Medimix medimix = (Medimix) soap;
            medimix.brand();
        }
    }
}
